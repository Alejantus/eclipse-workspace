package ej1;

import java.util.Objects;

public class Habitacion implements Comparable<Habitacion> , IHotel {
	
	private double precioBase;
	private boolean ocupacion;
	private String nombre;
	private int dias;
	private int numOcupantes;
	
	public Habitacion(double precioBase, boolean ocupacion, String nombre, int dias, int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupacion = ocupacion;
		this.nombre = nombre;
		this.dias = dias;
		this.numOcupantes = numOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupacion=" + ocupacion + ", nombre=" + nombre + ", dias="
				+ dias + ", numOcupantes=" + numOcupantes + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dias, nombre, numOcupantes, ocupacion, precioBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		return dias == other.dias && Objects.equals(nombre, other.nombre) && numOcupantes == other.numOcupantes
				&& ocupacion == other.ocupacion
				&& Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(other.precioBase);
	}

	@Override
	public int compareTo(Habitacion h) {
		if(precioBase < h.getPrecioBase()) {
			return -1;
		}else if (precioBase > h.getPrecioBase()) {
			return 1;
		}
		return 0;
	}
	
	public double calcularHabitacion(double porc) {
		return precioBase * dias;
	}	

}
