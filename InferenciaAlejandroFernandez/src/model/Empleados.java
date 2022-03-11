package model;

public class Empleados {
	
	private String nombre;
	private int horasRealizadas;
	private int numHijos;
	
	public Empleados(String nombre, int horasRealizadas, int numHijos) {
		super();
		this.nombre = nombre;
		this.horasRealizadas = horasRealizadas;
		this.numHijos = numHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasRealizadas() {
		return horasRealizadas;
	}

	public void setHorasRealizadas(int horasRealizadas) {
		this.horasRealizadas = horasRealizadas;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", horasRealizadas=" + horasRealizadas + ", numHijos=" + numHijos + "]";
	}	

}
