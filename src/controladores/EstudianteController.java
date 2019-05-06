package controladores;

import DAOsDTOs.CentroDeEstudioDTO;
import DAOsDTOs.EstudianteDAO;
import DAOsDTOs.EstudianteDTO;
import interfaces.Crud;
import stack.StackArray;

public class EstudianteController 
{
	private EstudianteDAO dao;
	private EstudianteDTO dto;
	
	public EstudianteController() {	
		this.dao = new EstudianteDAO();		
	}
	
	public void createDto(int codigo_matricula, int codigo_estudiante, int suscripcion_autobuses, int programa, String nombre, String apellido, String direccion)
	{
		dto = new EstudianteDTO(codigo_matricula, codigo_estudiante, suscripcion_autobuses, programa, nombre, apellido, direccion);
	}
	
	public void createDtoId(int codigo_estudiante)	
	{
		dto = new EstudianteDTO(codigo_estudiante);
	}
	
	public void createDtoEmpty()	
	{
		dto = new EstudianteDTO();
	}
	
	public void setDto(EstudianteDTO dto)
	{
		this.dto = dto;
	}
	
	public EstudianteDTO getDto()
	{
		return dto;
	}
	
	public boolean insert() 
	{
		return dao.insert(dto);
	}


	public boolean update() 
	{
		return dao.update(dto);	
	}

	
	public boolean delete()
	{
		return dao.delete(dto);
	}

	public Crud findById() 
	{
		return dao.getById(dto);
	}
	
	public StackArray<Crud> findAll() 
	{
		return dao.getFindAll(dto);
	}
	
	
}
