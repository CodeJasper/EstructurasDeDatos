package conecction;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JOptionPane;



public class ConnectionDB 
{
	private static ConnectionDB  connectionDB = null;
	private Connection connection= null;
	private Statement statement= null;
	
	public ConnectionDB()
	{
		Properties dataConecction = new Properties();
		FileInputStream input = null;
		
		try
		{
			input =  new FileInputStream("data/conecction.properties");
			dataConecction.load(input);
			
			String urlConnection = dataConecction.getProperty("url");
			String userConnection = dataConecction.getProperty("user");
			String passwordConnection = dataConecction.getProperty("password");
			
			connection =  DriverManager.getConnection(urlConnection, userConnection, passwordConnection);	
			//connection =  DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/browser/postgres");
			
			System.out.println("Conexion realizada");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}				
	}

	public static ConnectionDB getInstance() 
	{
		if (connectionDB == null) 
		{
			connectionDB = new ConnectionDB();
		}
		return connectionDB;
	}
	
	public ResultSet qetQuery(String query) 
	{
		ResultSet resultSet = null;
		try 
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultSet = statement.executeQuery(query);
		}
		catch (SQLException e) 
		{		
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return resultSet;
	}
	
	public boolean executeQuery(String query) {
		boolean ex = false;		
		try 
		{
			statement = connection.createStatement();			
			ex = statement.execute(query);
		} 
		catch (SQLException e) 
		{ 			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return ex;
	}
	
}
