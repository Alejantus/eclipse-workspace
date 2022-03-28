package ejercicio1;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String nombreCurso;
	private double notaMedia;
	private int edad;
	
	public Alumno(String nombre, String apellidos, String nombreCurso, double notaMedia, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCurso = nombreCurso;
		this.notaMedia = notaMedia;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", nombreCurso=" + nombreCurso + ", notaMedia="
				+ notaMedia + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre, nombreCurso, notaMedia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Objects.equals(nombreCurso, other.nombreCurso)
				&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
	}	
}
