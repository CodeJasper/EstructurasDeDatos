package controladores;

import DAOsDTOs.ParadaDTO;
import DAOsDTOs.ProgramaDAO;
import DAOsDTOs.ProgramaDTO;
import interfaces.Crud;
import stack.StackArray;

public class ProgramaController
{
	private ProgramaDAO dao;
	private ProgramaDTO dto;
	
	
	
	public ProgramaController() {
		super();
		this.dao = new ProgramaDAO();		
	}

	public void createDto(int codigo_programa, String nombre_programa, int numero_creditos)
	{
		dto = new ProgramaDTO(codigo_programa, nombre_programa, numero_creditos);
	}
	
	public void createDtoId(int codigo_programa)	
	{
		dto = new ProgramaDTO(codigo_programa);
	}
	
	public void createDtoEmpty()	
	{
		dto = new ProgramaDTO();
	}
	
	public void setDto(ProgramaDTO dto)
	{
		this.dto = dto;
	}
	
	public ProgramaDTO getDto()
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
