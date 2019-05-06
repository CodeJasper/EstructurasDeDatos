package genericity;

import stack.StackArray;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import interfaces.Crud;
import conecction.*;

public class GenericDao<T> 
{
	public ConnectionDB con;
	private Class<T> entityClass;
	
	
	public GenericDao(Class<T> entityClass)
	{
		this.entityClass = entityClass;
		con = ConnectionDB.getInstance();
	}
	
	
	
	public boolean insert(Crud dato)
	{
		return con.executeQuery(dato.insert());
	}
	
	public boolean update(Crud dato)
	{
		return con.executeQuery(dato.update());
	}
	
	public boolean delete(Crud dato)
	{
		return con.executeQuery(dato.delete());
	}
	
	
	public <T> T getById(Crud daoClass)
	{
		T newObject = null;
		ResultSet rs = con.qetQuery(daoClass.findById());
		try 
		{			 
			ResultSetMetaData rsMetaData = rs.getMetaData();
			Method[] entityClassMethods = entityClass.getMethods();
			while(rs.next())
			{
				newObject  = (T) entityClass.getDeclaredConstructor().newInstance();
				for( int i = 1; i <= rsMetaData.getColumnCount(); i++)
				{
					String nameColumn = rsMetaData.getColumnName(i);
					Method methodToInvoked = methodToInvoked( entityClassMethods, nameMethod( nameColumn ));
					Object objeto = rs.getObject(i);
					methodToInvoked.invoke(newObject, objeto);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return newObject;
	}
	
	public <T> StackArray<T> getFindAll( Crud daoClass )
	{
		ResultSet rs = con.qetQuery(daoClass.findAll());
		
		int size = 0;
	
		try {
			while(rs.next())
			{
				size++;
			}
		} catch (SQLException e1) {		
			e1.printStackTrace();
		}

		StackArray<T> dates = new StackArray<T>(size);
		try 
		{
			rs.first();
			ResultSetMetaData rsMetaData = rs.getMetaData();
			Method[] entityClassMethods = entityClass.getMethods();
			
			do {
				T newObject  = (T) entityClass.getDeclaredConstructor().newInstance();
				for( int i = 1; i <= rsMetaData.getColumnCount(); i++)
				{
					String nameColumn = rsMetaData.getColumnName(i);
					Method methodToInvoked = methodToInvoked( entityClassMethods, nameMethod( nameColumn ));
					Object objeto = rs.getObject(i);
					methodToInvoked.invoke(newObject, objeto);
				}
				dates.push(newObject);
			}
			while(rs.next());
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() + "\n"+  "No hay datos para mostrar");
		}
		
		return   dates;
		
	}
	
	private Method methodToInvoked(Method[] daoMethod, String nameMethod) 
{
		
		Method method = null;
		
		for(int i = 0; i < daoMethod.length; i++)
		{
			String daoNameMethod = daoMethod[i].getName();
			if(nameMethod.equals(daoNameMethod))
			{
				method = daoMethod[i];
			}
		}
		
		return method;
	}

	private String nameMethod(String columnName) 
{
		return "set_"+columnName;
	}
}

