package ejercicio6;

import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {
	
	private String dni;
	private String nombre;
	private int horasTrabajadas;
	private double sueldoFinal;
	
	public Trabajador(String dni, String nombre, int horasTrabajadas, double sueldoFinal) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoFinal=" + sueldoFinal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, horasTrabajadas, nombre, sueldoFinal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni) && horasTrabajadas == other.horasTrabajadas
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldoFinal) == Double.doubleToLongBits(other.sueldoFinal);
	}

	@Override
	public int compareTo(Trabajador t) {
		return dni.compareTo(t.getDni());
	}
}
