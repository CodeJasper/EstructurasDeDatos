package DAOsDTOs;

import interfaces.Crud;

public class EstudianteDTO implements Crud{
	
	private int codigo_estudiante;
	private int programa;
	private String nombre;
	private String apellido;
	private String direccion;
	
	public EstudianteDTO() {
	}

	public EstudianteDTO(int codigo_estudiante,int programa,
			String nombre, String apellido, String direccion) {
		super();		
		this.codigo_estudiante = codigo_estudiante;
		this.programa = programa;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public EstudianteDTO(int codigo_estudiante) {	
		this.codigo_estudiante = codigo_estudiante;
	}

	public int get_codigo_estudiante() {
		return codigo_estudiante;
	}

	public void set_codigo_estudiante(int codigo_estudiante) {
		this.codigo_estudiante = codigo_estudiante;
	}

	public int get_programa() {
		return programa;
	}

	public void set_programa(int programa) {
		this.programa = programa;
	}

	public String get_nombre() {
		return nombre;
	}

	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}

	public String get_apellido() {
		return apellido;
	}

	public void set_apellido(String apellido) {
		this.apellido = apellido;
	}

	public String get_direccion() {
		return direccion;
	}

	public void set_direccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String insert() {
		return "INSERT INTO estudiante(codigo_estudiante, programa, nombre, direccion, apellido) "
				+ "VALUES ('"+codigo_estudiante+"','"+programa+"', '"+nombre.trim()+"', '"+direccion.trim()+"',  '"+apellido.trim()+"');";
	}

	@Override
	public String update() {
		return "UPDATE estudiante set codigo_estudiante = '"+codigo_estudiante+"', programa = '"+programa+"', nombre = '"+nombre.trim()+"',direccion = '"+direccion.trim()+"', apellido = '"+apellido.trim()+"' where codigo_estudiante = '"+codigo_estudiante+"';";
	}

	@Override
	public String delete() {
		return "DELETE from estudiante where codigo_estudiante = "+codigo_estudiante+";";	
	}

	@Override
	public String findById() {
		return "select * from estudiante where codigo_estudiante = "+codigo_estudiante+";";
	}

	@Override
	public String findAll() {
		return "select * from estudiante;";
	}

	@Override
	public String toString() {
		return "EstudianteDTO [codigo_estudiante=" + codigo_estudiante
				+ ", programa=" + programa + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}

	
}
