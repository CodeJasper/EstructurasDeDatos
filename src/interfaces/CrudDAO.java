package interfaces;

import java.util.List;

import interfaces.Crud;
import stack.StackArray;

public interface CrudDAO <T> 
{

	public  boolean insert(T dato);
	
	public boolean update(T dato);
	
	public boolean delete(T dato);
	
	public Crud findById(T dato);
	
	public StackArray<Crud> findAll();
}
