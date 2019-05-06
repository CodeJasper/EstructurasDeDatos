package controladores;

import DAOsDTOs.GrupoParadasDTO;
import DAOsDTOs.MatriculaDAO;
import DAOsDTOs.MatriculaDTO;
import interfaces.Crud;
import stack.StackArray;

public class MatriculaController {

	private MatriculaDAO dao;
	private MatriculaDTO dto;
	
	public MatriculaController() {
		super();
		this.dao = new MatriculaDAO();		
	}

	public void createDto(int codigo_centro_estudio, int codigo_estudiante)
	{
		dto = new MatriculaDTO(codigo_centro_estudio, codigo_estudiante);
	}
	
	public void createDtoId(int codigo_centro_estudio, int codigo_estudiante)	
	{
		dto = new MatriculaDTO(codigo_centro_estudio, codigo_estudiante);
	}
	
	public void createDtoEmpty()	
	{
		dto = new MatriculaDTO();
	}
	
	public void setDto(MatriculaDTO dto)
	{
		this.dto = dto;
	}
	
	public MatriculaDTO getDto()
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
