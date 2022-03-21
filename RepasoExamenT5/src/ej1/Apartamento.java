package ej1;

public class Apartamento extends Habitacion {
	
	private double m2;
	private double precioServicio;
	private boolean servicioHabitaciones;
	
	public Apartamento(double precioBase, boolean ocupacion, String nombre, int dias, int numOcupantes, double m2,
			double precioServicio, boolean servicioHabitaciones) {
		super(precioBase, ocupacion, nombre, dias, numOcupantes);
		this.m2 = m2;
		this.precioServicio = precioServicio;
		this.servicioHabitaciones = servicioHabitaciones;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getPrecioServicio() {
		return precioServicio;
	}

	public void setPrecioServicio(double precioServicio) {
		this.precioServicio = precioServicio;
	}

	public boolean isServicioHabitaciones() {
		return servicioHabitaciones;
	}

	public void setServicioHabitaciones(boolean servicioHabitaciones) {
		this.servicioHabitaciones = servicioHabitaciones;
	}

	@Override
	public String toString() {
		return "Apartamento [m2=" + m2 + ", precioServicio=" + precioServicio + ", servicioHabitaciones="
				+ servicioHabitaciones + "]";
	}
	
	public double calcularHabitaciones(double porc) {
		if(servicioHabitaciones) {
			return super.calcularHabitacion(porc)+precioServicio;
		}else {
			return super.calcularHabitacion(porc);
		}
	}
	
	

}
