package ejercicio2;

public class Socio {

	private String dni;
	private String nombre;
	private int numSocio;
	
	public Socio() {
		super();
	}

	public Socio(String dni, String nombre, int numSocio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.numSocio = numSocio;
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

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", numSocio=" + numSocio + "]";
	}
	
	public int compareTo(Socio s) {
		if (this.dni.equalsIgnoreCase(s.getDni())
				&& this.nombre.equalsIgnoreCase(s.getNombre())
				&& this.numSocio == s.getNumSocio())
			return 0;

		return 1;
	}
	
}
