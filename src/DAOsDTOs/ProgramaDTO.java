package DAOsDTOs;

import interfaces.Crud;

public class ProgramaDTO implements Crud{
	
	
	private int codigo_programa;
	private String nombre_programa;
	private int numero_creditos;

	public ProgramaDTO() {

	}

	public ProgramaDTO(int codigo_programa, String nombre_programa, int numero_creditos) {
		super();
		this.codigo_programa = codigo_programa;
		this.nombre_programa = nombre_programa;
		this.numero_creditos = numero_creditos;
	}

	public ProgramaDTO(int codigo_programa) {
		super();
		this.codigo_programa = codigo_programa;
	}

	public int get_codigo_programa() {
		return codigo_programa;
	}

	public void set_codigo_programa(int codigo_programa) {
		this.codigo_programa = codigo_programa;
	}

	public String get_nombre_programa() {
		return nombre_programa;
	}

	public void set_nombre_programa(String nombre_programa) {
		this.nombre_programa = nombre_programa;
	}

	public int get_numero_creditos() {
		return numero_creditos;
	}

	public void set_numero_creditos(int numero_creditos) {
		this.numero_creditos = numero_creditos;
	}


	@Override
	public String insert() {
		return "INSERT INTO programa(codigo_programa, nombre_programa, numero_creditos) "
				+ "VALUES ('"+codigo_programa+"','"+nombre_programa+"', '"+numero_creditos+"');";
	}

	@Override
	public String update() {
		return "UPDATE programa set codigo_programa = '"+codigo_programa+"', nombre_programa = '"+nombre_programa+"', numero_creditos = '"+numero_creditos+"';";
	}

	@Override
	public String delete() {
		return "DELETE from programa where codigo_programa = "+codigo_programa+";";	
	}

	@Override
	public String findById() {
		return "select * from programa where codigo_programa = "+codigo_programa+";";
	}

	@Override
	public String findAll() {
		return "select * from programa;";
	}

	@Override
	public String toString() {
		return "ProgramaDTO [codigo_programa=" + codigo_programa + ", nombre_programa=" + nombre_programa
				+ ", numero_creditos=" + numero_creditos + "]";
	}

	
	
	
}
