package controladores;

import DAOsDTOs.MatriculaDTO;
import DAOsDTOs.ParadaDAO;
import DAOsDTOs.ParadaDTO;
import interfaces.Crud;
import stack.StackArray;

public class ParadaController
{
	private ParadaDAO dao;
	private ParadaDTO dto;
	
	public ParadaController() {
		super();
		this.dao = new ParadaDAO();		
	}

	public void createDto(int codigo_parada, String calle)
	{
		dto = new ParadaDTO(codigo_parada, calle);
	}
	
	public void createDtoId(int codigo_parada)	
	{
		dto = new ParadaDTO(codigo_parada);
	}
	
	public void createDtoEmpty()	
	{
		dto = new ParadaDTO();
	}
	
	public void setDto(ParadaDTO dto)
	{
		this.dto = dto;
	}
	
	public ParadaDTO getDto()
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
