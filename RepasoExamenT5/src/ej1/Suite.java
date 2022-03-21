package ej1;

public class Suite extends Habitacion{
	
	private double m2;
	private double servicioHabitaciones;
	
	public Suite(double precioBase, boolean ocupacion, String nombre, int dias, int numOcupantes, double m2,
			double servicioHabitaciones) {
		super(precioBase, ocupacion, nombre, dias, numOcupantes);
		this.m2 = m2;
		this.servicioHabitaciones = servicioHabitaciones;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getServicioHabitaciones() {
		return servicioHabitaciones;
	}

	public void setServicioHabitaciones(double servicioHabitaciones) {
		this.servicioHabitaciones = servicioHabitaciones;
	}

	@Override
	public String toString() {
		return "Suite [m2=" + m2 + ", servicioHabitaciones=" + servicioHabitaciones + "]";
	}
	
	public double calcularHabitacion(double porc) {
		double div = 100;
		return super.calcularHabitacion(porc)*porc/div;
	}
	
	
	
	

}
