package ejercicio2;

import java.util.Objects;

public class Palabras {
	
	private String cadena;

	public Palabras(String cadena) {
		super();
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		return "Palabras [cadena=" + cadena + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cadena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palabras other = (Palabras) obj;
		return Objects.equals(cadena, other.cadena);
	}
}
