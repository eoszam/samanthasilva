package clases;

public class Empleados {
	private int codigo;
	private String nombre;
	private String dni;
	private int cantVentas;
	private double comisionVentas;
	private int estado;
	
	public Empleados (int codigo, String nombre, String dni, int cantVentas, double comisionVentas, int estado) {
		 this.codigo = codigo;
	        this.nombre = nombre;
	        this.dni = dni;
	        this.cantVentas = cantVentas;
	        this.comisionVentas = comisionVentas;
	        this.estado = estado;     
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getComisionVentas() {
		return comisionVentas;
	}

	public void setComisionVentas(double comisionVentas) {
		this.comisionVentas = comisionVentas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public double calcularSueldoBruto() {
		return cantVentas * comisionVentas;
	}
	
	
}
