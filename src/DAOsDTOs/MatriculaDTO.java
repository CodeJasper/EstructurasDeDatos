package DAOsDTOs;

import interfaces.Crud;

public class MatriculaDTO implements Crud{

	private int codigo_centro_estudio;
	private int codigo_estudiante;
	


	public MatriculaDTO() {

	}

	
	
	public MatriculaDTO(int codigo_centro_estudio, int codigo_estudiante) {	
		this.codigo_centro_estudio = codigo_centro_estudio;
		this.codigo_estudiante = codigo_estudiante;
	}



	public int get_codigo_centro_estudio() {
		return codigo_centro_estudio;
	}



	public void set_codigo_centro_estudio(int codigo_centro_estudio) {
		this.codigo_centro_estudio = codigo_centro_estudio;
	}



	public int get_codigo_estudiante() {
		return codigo_estudiante;
	}



	public void set_codigo_estudiante(int codigo_estudiante) {
		this.codigo_estudiante = codigo_estudiante;
	}



	@Override
	public String insert() {
		return "INSERT INTO matricula(codigo_centro_estudio, codigo_estudiante) "
				+ "VALUES ('"+codigo_centro_estudio+"','"+codigo_estudiante+"');";
	}

	@Override
	public String update() {
		return "UPDATE matricula set codigo_centro_estudio = '"+codigo_centro_estudio+"', codigo_estudiante = '"+codigo_estudiante+"';";
	}

	@Override
	public String delete() {
		return "DELETE from matricula where codigo_centro_estudio = "+codigo_centro_estudio+" AND codigo_estudiante = "+codigo_estudiante+" ;";
	}

	@Override
	public String findById() {
		return "select * from matricula where codigo_centro_estudio = "+codigo_centro_estudio+" AND codigo_estudiante = "+codigo_estudiante+" ;";
	}

	@Override
	public String findAll() {
		return "select * from matricula;";
	}



	@Override
	public String toString() {
		return "MatriculaDTO [codigo_centro_estudio=" + codigo_centro_estudio + ", codigo_estudiante="
				+ codigo_estudiante + "]";
	}
	


}
