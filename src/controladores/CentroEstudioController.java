package controladores;
import DAOsDTOs.*;
import interfaces.Crud;
import stack.StackArray;

public class CentroEstudioController
{
	private CentroDeEstudioDAO dao;
	private CentroDeEstudioDTO dto;

	public CentroEstudioController () 
	{
		this.dao = new CentroDeEstudioDAO();		
	}

	public void createDto(int codigoCentroEstudio, String nombre, String direccion )
	{
		dto = new CentroDeEstudioDTO(codigoCentroEstudio, nombre, direccion);
	}
	
	public void createDtoId(int codigoCentroEstudio)	
	{
		dto = new CentroDeEstudioDTO(codigoCentroEstudio);
	}
	
	public void createDtoEmpty()	
	{
		dto = new CentroDeEstudioDTO();
	}
	
	public void setDto(CentroDeEstudioDTO dto)
	{
		this.dto = dto;
	}
	
	public CentroDeEstudioDTO getDto()
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