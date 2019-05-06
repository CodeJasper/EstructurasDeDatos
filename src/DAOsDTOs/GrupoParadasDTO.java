package DAOsDTOs;

import interfaces.Crud;

public class GrupoParadasDTO implements Crud{
	
	private int codigo_parada;
	private int codigo_autobus;
	
	

	public GrupoParadasDTO() {

	}

	public GrupoParadasDTO(int codigo_parada, int codigo_autobus) {
		super();
		this.codigo_parada = codigo_parada;
		this.codigo_autobus = codigo_autobus;
	}

	public int get_codigo_parada() {
		return codigo_parada;
	}



	public void set_codigo_parada(int codigo_parada) {
		this.codigo_parada = codigo_parada;
	}



	public int get_codigo_autobus() {
		return codigo_autobus;
	}



	public void set_codigo_autobus(int codigo_autobus) {
		this.codigo_autobus = codigo_autobus;
	}



	@Override
	public String insert() {
		return "INSERT INTO grupo_paradas(codigo_parada, codigo_autobus) "
				+ "VALUES ('"+codigo_parada+"','"+codigo_autobus+"');";
	}

	@Override
	public String update() {
		return "UPDATE grupo_paradas set codigo_parada = '"+codigo_parada+"', codigo_autobus = '"+codigo_autobus+"';";
	}

	@Override
	public String delete() {
		return "DELETE from grupo_paradas where codigo_parada = "+codigo_parada+" AND codigo_autobus = "+codigo_autobus+" ;";
	}

	@Override
	public String findById() {
		return "select * from grupo_paradas where codigo_parada = "+codigo_parada+" AND codigo_autobus = "+codigo_autobus+" ;";
	}

	@Override
	public String findAll() {
		return "select * from grupo_paradas;";
	}



	@Override
	public String toString() {
		return "GrupoParadasDTO [codigo_parada=" + codigo_parada + ", codigo_autobus="
				+ codigo_autobus + "]";
	}

}
