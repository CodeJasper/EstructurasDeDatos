package DAOsDTOs;

import interfaces.Crud;

public class CentroDeEstudioDTO implements Crud{
	
	private int codigo_centro_estudio;
	private int codigo_matricula;
	private int codigo_grupo_autobuses;
	private String nombre;
	private String direccion;
	
	public CentroDeEstudioDTO() {
	
	}

	public CentroDeEstudioDTO(int codigoCentroEstudio, int codigoMatricula, int codigoGrupoAutobuses, String nombre,
			String direccion) {
		super();
		this.codigo_centro_estudio = codigoCentroEstudio;
		this.codigo_matricula = codigoMatricula;
		this.codigo_grupo_autobuses = codigoGrupoAutobuses;
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

	public int get_codigo_matricula() {
		return codigo_matricula;
	}

	public void set_codigo_matricula(int codigoMatricula) {
		this.codigo_matricula = codigoMatricula;
	}

	public int get_codigo_grupo_autobuses() {
		return codigo_grupo_autobuses;
	}

	public void set_codigo_grupo_autobuses(int codigoGrupoAutobuses) {
		this.codigo_grupo_autobuses = codigoGrupoAutobuses;
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
		return "INSERT INTO centro_de_estudio(codigo_centro_estudio, codigo_matricula, codigo_grupo_autobuses, nombre, direccion) "
				+ "VALUES ('"+codigo_centro_estudio+"','"+codigo_matricula+"', '"+codigo_grupo_autobuses+"', '"+nombre.trim()+"', '"+direccion.trim()+"');";
	}

	@Override
	public String update() {
		return "UPDATE centro_de_estudio set codigo_matricula = '"+codigo_matricula+"', codigo_grupo_autobuses = '"+codigo_grupo_autobuses+"', nombre = '"+nombre.trim()+"', direccion = '"+direccion.trim()+"' where codigo_centro_estudio = '"+codigo_centro_estudio+"';";
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
		return "CentroDeEstudioDTO [codigoCentroEstudio=" + codigo_centro_estudio + ", codigoMatricula=" + codigo_matricula
				+ ", codigoGrupoAutobuses=" + codigo_grupo_autobuses + ", nombre=" + nombre + ", direccion=" + direccion
				+ "]";
	}
	
	
	
	

}
