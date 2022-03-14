package ejercicio3;

import java.util.Objects;

public class Alumno {
	
	private int idAlumno;
	private String nombre;
	private double notaMedia;
	
	public Alumno(int idAlumno, String nombre, double notaMedia) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlumno, nombre, notaMedia);
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
		return idAlumno == other.idAlumno && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
	}
	
	

	
}
