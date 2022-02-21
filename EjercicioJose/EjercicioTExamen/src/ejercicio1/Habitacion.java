package ejercicio1;

public class Habitacion {
	
	private double precioBase;
	private boolean ocupacion;
	private String nombre;
	private int numOcupantes;
	private int numDias;
	
	public Habitacion(double precioBase, boolean ocupacion, String nombre, int numOcupantes, int numDias) {
		super();
		this.precioBase = precioBase;
		this.ocupacion = ocupacion;
		this.nombre = nombre;
		this.numOcupantes = numOcupantes;
		this.numDias = numDias;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupacion=" + ocupacion + ", nombre=" + nombre
				+ ", numOcupantes=" + numOcupantes + ", numDias=" + numDias + "]";
	}
	
	public double calcularPrecio(double porc) {
		return precioBase*numDias;
	}
	
}
