package DAOsDTOs;

import interfaces.Crud;

public class GrupoAutobusesDTO implements Crud{
	
	
	private int codigo_centro_estudio;
	private int codigo_autobus;
	


	public GrupoAutobusesDTO() {

	}

	public GrupoAutobusesDTO(int codigo_centro_estudio, int codigo_autobus) {
		super();
		this.codigo_centro_estudio = codigo_centro_estudio;
		this.codigo_autobus = codigo_autobus;
	}



	public int get_codigo_centro_estudio() {
		return codigo_centro_estudio;
	}



	public void set_codigo_centro_estudio(int codigo_centro_estudio) {
		this.codigo_centro_estudio = codigo_centro_estudio;
	}



	public int get_codigo_autobus() {
		return codigo_autobus;
	}



	public void set_codigo_autobus(int codigo_autobus) {
		this.codigo_autobus = codigo_autobus;
	}



	@Override
	public String insert() {
		return "INSERT INTO grupo_autobuses(codigo_centro_estudio, codigo_autobus) "
				+ "VALUES ('"+codigo_centro_estudio+"','"+codigo_autobus+"');";
	}

	@Override
	public String update() {
		return "UPDATE grupo_autobuses set codigo_centro_estudio = '"+codigo_centro_estudio+"', codigo_autobus = '"+codigo_autobus+"';";
	}

	@Override
	public String delete() {
		return "DELETE from grupo_autobuses where codigo_centro_estudio = "+codigo_centro_estudio+" AND codigo_autobus = "+codigo_autobus+" ;";
	}

	@Override
	public String findById() {
		return "select * from grupo_autobuses where codigo_centro_estudio = "+codigo_centro_estudio+" AND codigo_autobus = "+codigo_autobus+" ;";
	}

	@Override
	public String findAll() {
		return "select * from grupo_autobuses;";
	}



	@Override
	public String toString() {
		return "GrupoAutobusesDTO [codigo_centro_estudio=" + codigo_centro_estudio + ", codigo_autobus="
				+ codigo_autobus + "]";
	}
	
	

}
