package model;

import java.util.Objects;

public class Empleados implements Comparable<Empleados> {
	
	private int id;
	private String nombre;
	private String apellido;
	private String nombreSector;
	private int horasTrabajadas;
	
	public Empleados(int id, String nombre, String apellido, String nombreSector, int horasTrabajadas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreSector = nombreSector;
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreSector() {
		return nombreSector;
	}

	public void setNombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nombreSector="
				+ nombreSector + ", horasTrabajadas=" + horasTrabajadas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, horasTrabajadas, id, nombre, nombreSector);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(apellido, other.apellido) && horasTrabajadas == other.horasTrabajadas && id == other.id
				&& Objects.equals(nombre, other.nombre) && Objects.equals(nombreSector, other.nombreSector);
	}

	@Override
	public int compareTo(Empleados e) {
		if(id < e.getId()) {
			return -1;
		}else if(id > e.getId()) {
			return 1;
		}
		return 0;
	}
	
	
	

}
