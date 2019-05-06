package controladores;

import DAOsDTOs.EstudianteDTO;
import DAOsDTOs.GrupoAutobusesDAO;
import DAOsDTOs.GrupoAutobusesDTO;
import interfaces.Crud;
import stack.StackArray;

public class GrupoAutobusesController 
{
	private GrupoAutobusesDAO dao;
	private GrupoAutobusesDTO dto;
	public GrupoAutobusesController() {
		super();
		this.dao = new GrupoAutobusesDAO();
	}
	
	public void createDto(int codigo_centro_estudio, int codigo_autobus)
	{
		dto = new GrupoAutobusesDTO(codigo_centro_estudio, codigo_autobus);
	}
	
	public void createDtoId(int codigo_centro_estudio, int codigo_autobus)	
	{
		dto = new GrupoAutobusesDTO(codigo_centro_estudio, codigo_autobus);
	}
	
	public void createDtoEmpty()	
	{
		dto = new GrupoAutobusesDTO();
	}
	
	public void setDto(GrupoAutobusesDTO dto)
	{
		this.dto = dto;
	}
	
	public GrupoAutobusesDTO getDto()
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
