package DAOsDTOs;

import interfaces.Crud;

public class CentroDeEstudioDTO implements Crud{
	
	private int codigo_centro_estudio;	
	private String nombre;
	private String direccion;
	
	public CentroDeEstudioDTO() {
	
	}

	public CentroDeEstudioDTO(int codigoCentroEstudio,  String nombre,
			String direccion) {
		super();
		this.codigo_centro_estudio = codigoCentroEstudio;		
		this.nombre = nombre;
		this.direccion = direccion;
	}

	
	
	public CentroDeEstudioDTO(int codigo_centro_estudio) {
		super();
		this.codigo_centro_estudio = codigo_centro_estudio;
	}

	public int get_codigo_centro_estudio() {
		return codigo_centro_estudio;
	}

	public void set_codigo_centro_estudio(int codigoCentroEstudio) {
		this.codigo_centro_estudio = codigoCentroEstudio;
	}

	public String get_nombre() {
		return nombre;
	}

	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}

	public String get_direccion() {
		return direccion;
	}

	public void set_direccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String insert() {
		return "INSERT INTO centro_de_estudio(codigo_centro_estudio,nombre, direccion) "
				+ "VALUES ('"+codigo_centro_estudio+"','"+nombre.trim()+"', '"+direccion.trim()+"');";
	}

	@Override
	public String update() {
		return "UPDATE centro_de_estudio set nombre = '"+nombre.trim()+"', direccion = '"+direccion.trim()+"' where codigo_centro_estudio = '"+codigo_centro_estudio+"';";
	}

	@Override
	public String delete() {
		return "DELETE from centro_de_estudio where codigo_centro_estudio = "+codigo_centro_estudio+";";	
	}

	@Override
	public String findById() {
		return "select * from centro_de_estudio where codigo_centro_estudio = "+codigo_centro_estudio+";";
	}

	@Override
	public String findAll() {
		return "select * from centro_de_estudio;";
	}

	@Override
	public String toString() {
		return "CentroDeEstudioDTO [codigoCentroEstudio=" + codigo_centro_estudio 
				+ ", nombre=" + nombre + ", direccion=" + direccion
				+ "]";
	}
	
	
	
	

}
