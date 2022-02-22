package ejemplo1Colecciones;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}	

}
