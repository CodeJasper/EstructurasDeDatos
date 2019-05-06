package DAOsDTOs;

import interfaces.Crud;

public class ParadaDTO implements Crud{
	
	private int codigo_parada;
	private String calle;
	
	

	public ParadaDTO() {

	}

	
	
	public ParadaDTO(int codigo_parada, String calle) {
		super();
		this.codigo_parada = codigo_parada;
		this.calle = calle;
	}



	public ParadaDTO(int codigo_parada) {
		this.codigo_parada = codigo_parada;
	}



	public int get_codigo_parada() {
		return codigo_parada;
	}



	public void set_codigo_parada(int codigo_parada) {
		this.codigo_parada = codigo_parada;
	}



	public String get_calle() {
		return calle;
	}



	public void set_calle(String calle) {
		this.calle = calle;
	}


	@Override
	public String insert() {
		return "INSERT INTO parada(codigo_parada, calle) "
				+ "VALUES ('"+codigo_parada+"','"+calle+"');";
	}

	@Override
	public String update() {
		return "UPDATE parada set codigo_parada = '"+codigo_parada+"', calle = '"+calle+"';";
	}

	@Override
	public String delete() {
		return "DELETE from parada where codigo_parada = "+codigo_parada+" ;";
	}

	@Override
	public String findById() {
		return "select * from parada where codigo_parada = "+codigo_parada+";";
	}

	@Override
	public String findAll() {
		return "select * from parada;";
	}



	@Override
	public String toString() {
		return "ParadaDTO [codigo_parada=" + codigo_parada + ", calle=" + calle + "]";
	}
	
	
}
