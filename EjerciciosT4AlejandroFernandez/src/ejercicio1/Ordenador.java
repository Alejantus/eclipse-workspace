package ejercicio1;

public class Ordenador {
	
	private double precioBase;
	private double frecuencia;
	private int capacidad;
	
	public Ordenador(double precioBase, double frecuencia, int capacidad) {
		super();
		this.precioBase = precioBase;
		this.frecuencia = frecuencia;
		this.capacidad = capacidad;
	}

	public double getprecioBase() {
		return precioBase;
	}

	public void setprecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Ordenador [precioBase=" + precioBase + ", frecuencia=" + frecuencia + ", capacidad=" + capacidad + "]";
	}
	
	public double calcularPrecioVenta(int porcentaje) {
		double division=100.0;
		return precioBase+precioBase*porcentaje/division;
	}
}
