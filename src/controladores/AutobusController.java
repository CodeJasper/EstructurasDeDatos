package controladores;
import DAOsDTOs.*;
import interfaces.Crud;
import stack.StackArray;

public class AutobusController
{
	private AutobusDAO dao;
	private AutobusDTO dto;

	public AutobusController() 
	{
		this.dao = new AutobusDAO();				
	}

	public void createDto(int codigoAutobus, int codigoCentroEstudio, int codigoGrupoParada, String matricula, int numAsientos, String nombreCompañia)	
	{
		dto = new AutobusDTO(codigoAutobus, codigoCentroEstudio, codigoGrupoParada, matricula, numAsientos, nombreCompañia);
	}
	
	public void createDtoId(int codigoAutobus)	
	{
		dto = new AutobusDTO(codigoAutobus);
	}
	
	public void createDtoEmpty()	
	{
		dto = new AutobusDTO();
	}
	
	public void setDto(AutobusDTO dto)
	{
		this.dto = dto;
	}
	
	public AutobusDTO getDto()
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
	



