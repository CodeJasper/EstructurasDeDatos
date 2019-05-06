package DAOsDTOs;
import genericity.*;
import stack.StackArray;
import stack.StackEmpty;

public class AutobusDAO extends GenericDao<AutobusDTO>
{
	public AutobusDAO()
	{
		super(AutobusDTO.class);
	}
	
	
	public static void main(String[] args)
	{
		
		AutobusDAO autobusDao = new AutobusDAO();
		
		/**
		AutobusDTO datoDto = new AutobusDTO(11, 99, 99, "123456", 99, "UPDATE");
		
		System.out.println("antes del insert");
		
		autobusDao.update(datoDto);
		
		System.out.println("desúes del insert");
		**/
		
		
		AutobusDTO datoDto = new AutobusDTO();
		
		StackArray<AutobusDTO> lista = autobusDao.getFindAll(datoDto);	
		
		System.out.println(lista.getTop());
		
		for(int i = 0; i <lista.getSize();i++)
			try {
				System.out.println(lista.pop().toString() + "\n");
			} catch (StackEmpty e) {
				e.printStackTrace();
			}
			
	
		
		
	}
}
