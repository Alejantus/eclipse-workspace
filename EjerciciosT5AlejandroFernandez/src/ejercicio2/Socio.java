package ejercicio2;

public class Socio {
	
	private String nombre;
	private String dni;
	private String nSocio;
	
	public Socio(String nombre, String dni, String nSocio) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nSocio = nSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getnSocio() {
		return nSocio;
	}

	public void setnSocio(String nSocio) {
		this.nSocio = nSocio;
	}

	@Override
	public String toString() {
		return "nSocio [nombre=" + nombre + ", dni=" + dni + ", nSocio=" + nSocio + "]";
	}
}
