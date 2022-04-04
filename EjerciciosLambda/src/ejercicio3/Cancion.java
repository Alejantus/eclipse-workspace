package ejercicio3;

import java.time.LocalTime;
import java.util.Objects;

public class Cancion {
	
	private String nombre;
	private String autor;
	private int genero;
	private LocalTime duracion;
	
	public Cancion(String nombre, String autor, int genero, LocalTime duracion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getGenero() {
		return genero;
	}
	
	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	public LocalTime getDuracion() {
		return duracion;
	}
	
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "*********************\n"
				+ "Nombre : "+nombre+"\n"
				+ "Autor : "+autor+"\n"
				+ "Genero : "+genero+"\n"
				+ "Duracion : "+duracion+"\n"
				+ "*********************\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, duracion, genero, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(duracion, other.duracion) && genero == other.genero
				&& Objects.equals(nombre, other.nombre);
	}

}
