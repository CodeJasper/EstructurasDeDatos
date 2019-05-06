package controladores;

import DAOsDTOs.ProgramaDTO;
import DAOsDTOs.SuscripcionAutobusesDAO;
import DAOsDTOs.SuscripcionAutobusesDTO;
import interfaces.Crud;
import stack.StackArray;

public class SuscripcionAutobusesController 
{
	private SuscripcionAutobusesDAO dao;
	private SuscripcionAutobusesDTO dto;
	
	public SuscripcionAutobusesController() {
		super();
		this.dao = new SuscripcionAutobusesDAO();		
	}
	
	public void createDto(int codigo_estudiante, int codigo_centro_estudio, int codigo_autobus)
	{
		dto = new SuscripcionAutobusesDTO(codigo_estudiante, codigo_centro_estudio, codigo_autobus);
	}

	public void createDtoEmpty()	
	{
		dto = new SuscripcionAutobusesDTO();
	}
	
	public void setDto(SuscripcionAutobusesDTO dto)
	{
		this.dto = dto;
	}
	
	public SuscripcionAutobusesDTO getDto()
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
