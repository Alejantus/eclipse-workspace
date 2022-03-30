package ejemploSum;

import java.util.Objects;

public class Peliculas {
	
	private String nombre;
	private int horas;
	
	public Peliculas(String nombre, int horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Nombre : " + nombre + ", Horas :" + horas ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		return horas == other.horas && Objects.equals(nombre, other.nombre);
	}
}
