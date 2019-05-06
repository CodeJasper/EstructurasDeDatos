package controladores;

import DAOsDTOs.GrupoAutobusesDTO;
import DAOsDTOs.GrupoParadasDAO;
import DAOsDTOs.GrupoParadasDTO;
import interfaces.Crud;
import stack.StackArray;

public class GrupoParadasController 
{
	private GrupoParadasDAO dao;
	private GrupoParadasDTO dto;
	public GrupoParadasController() {
		super();
		this.dao = new GrupoParadasDAO();		
	}
	
	public void createDto(int codigo_parada, int codigo_autobus)
	{
		dto = new GrupoParadasDTO(codigo_parada, codigo_autobus);
	}
	
	public void createDtoId(int codigo_parada, int codigo_autobus)	
	{
		dto = new GrupoParadasDTO(codigo_parada, codigo_autobus);
	}
	
	public void createDtoEmpty()	
	{
		dto = new GrupoParadasDTO();
	}
	
	public void setDto(GrupoParadasDTO dto)
	{
		this.dto = dto;
	}
	
	public GrupoParadasDTO getDto()
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
