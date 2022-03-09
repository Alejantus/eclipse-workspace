package ejercicio3;

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

	
}
