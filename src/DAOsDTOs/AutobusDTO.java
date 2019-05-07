package DAOsDTOs;

import interfaces.*;

public class AutobusDTO implements Crud
{
	private int codigo_autobus;
	private int codigo_centro_estudio;	
	private String matricula;
	private int num_asientos;
	private String nombre_compañia;
		
	public AutobusDTO()
	{
		
	}
		
	public AutobusDTO(int codigoAutobus, int codigoCentroEstudio, String matricula,
			int numAsientos, String nombreCompañia) {
		super();
		this.codigo_autobus = codigoAutobus;
		this.codigo_centro_estudio = codigoCentroEstudio;		
		this.matricula = matricula;
		this.num_asientos = numAsientos;
		this.nombre_compañia = nombreCompañia;
	}
	
	
	public AutobusDTO(int codigo_autobus) {
		super();
		this.codigo_autobus = codigo_autobus;
	}

	public int get_codigo_autobus() {
		return codigo_autobus;
	}

	public void set_codigo_autobus(int codigoAutobus) {
		this.codigo_autobus = codigoAutobus;
	}

	public int get_codigo_centro_estudio() {
		return codigo_centro_estudio;
	}

	public void set_codigo_centro_estudio(int codigoCentroEstudio) {
		this.codigo_centro_estudio = codigoCentroEstudio;
	}

	public String get_matricula() {
		return matricula;
	}

	public void set_matricula(String matricula) {
		this.matricula = matricula;
	}

	public int get_num_asientos() {
		return num_asientos;
	}

	public void set_num_asientos(int numAsientos) {
		this.num_asientos = numAsientos;
	}

	public String get_nombre_compañia() {
		return nombre_compañia;
	}

	public void set_nombre_compañia(String nombreCompañia) {
		this.nombre_compañia = nombreCompañia;
	}

	@Override
	public String insert() {
		return "INSERT INTO Autobus(codigo_autobus, codigo_centro_estudio, matricula, num_asientos, nombre_compañia) "
				+ "VALUES ('"+codigo_autobus+"','"+codigo_centro_estudio+"',  '"+matricula.trim()+"', '"+num_asientos+"', '"+nombre_compañia.trim()+"');";	
	}

	@Override
	public String update() {
		return "UPDATE Autobus set codigo_centro_estudio = '"+codigo_centro_estudio+"', matricula = '"+matricula.trim()+"', num_asientos = '"+num_asientos+"', nombre_compañia = '"+nombre_compañia.trim()+"'"
				+ "where codigo_autobus = "+codigo_autobus+";";		
	}

	@Override
	public String delete() {
		return "DELETE from Autobus where codigo_autobus = "+codigo_autobus+";";		
	}

	@Override
	public String findById() {
		return "select * from Autobus where codigo_autobus = "+codigo_autobus+";";		
	}

	@Override
	public String findAll() {
		return "select * from autobus;";		
	}

	@Override
	public String toString() {
		return "AutobusDTO [codigoAutobus=" + codigo_autobus + ", codigoCentroEstudio=" + codigo_centro_estudio
				+  ", matricula=" + matricula + ", numAsientos="
				+ num_asientos + ", nombreCompañia=" + nombre_compañia + "]";
	}

	
	
}
