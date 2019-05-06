package DAOsDTOs;

import interfaces.Crud;

public class SuscripcionAutobusesDTO implements Crud{

	
	private int codigo_estudiante;
	private int codigo_centro_estudio;
	private int codigo_autobus;
	
	
	public SuscripcionAutobusesDTO() {
		
	}

	public SuscripcionAutobusesDTO(int codigo_estudiante, int codigo_centro_estudio, int codigo_autobus) {
		super();
		this.codigo_estudiante = codigo_estudiante;
		this.codigo_centro_estudio = codigo_centro_estudio;
		this.codigo_autobus = codigo_autobus;
	}

	
	public int get_codigo_estudiante() {
		return codigo_estudiante;
	}

	public void set_codigo_estudiante(int codigo_estudiante) {
		this.codigo_estudiante = codigo_estudiante;
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
		return "INSERT INTO suscripcion_autobuses(codigo_estudiante, codigo_centro_estudio, codigo_autobus) "
				+ "VALUES ('"+codigo_estudiante+"','"+codigo_centro_estudio+"', '"+codigo_autobus+"');";
	}

	@Override
	public String update() {
		return "UPDATE suscripcion_autobuses set codigo_estudiante = '"+codigo_estudiante+"', codigo_centro_estudio = '"+codigo_centro_estudio+"', codigo_autobus = '"+codigo_autobus+"';";
	}

	@Override
	public String delete() {
		return "DELETE from suscripcion_autobuses where codigo_estudiante = "+codigo_estudiante+" AND codigo_centro_estudio = "+codigo_centro_estudio+" AND codigo_autobus = "+codigo_autobus+";";	
	}

	@Override
	public String findById() {
		return "select * from suscripcion_autobuses where codigo_estudiante = "+codigo_estudiante+" AND codigo_centro_estudio = "+codigo_centro_estudio+" AND codigo_autobus = "+codigo_autobus+";";
	}

	@Override
	public String findAll() {
		return "select * from suscripcion_autobuses;";
	}

	@Override
	public String toString() {
		return "SuscripcionAutobusesDTO [codigo_estudiante=" + codigo_estudiante + ", codigo_centro_estudio="
				+ codigo_centro_estudio + ", codigo_autobus=" + codigo_autobus + "]";
	}

	
	
	
}
