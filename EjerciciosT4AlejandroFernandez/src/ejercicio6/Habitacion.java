package ejercicio6;

public class Habitacion {
	
	private double precioBase;
	private boolean ocupado;
	private String nombreCliente;
	private int diasOcupacion;
	private int numOcupantes;
	
	public Habitacion(double precioBase, boolean ocupado, String nombreCliente, int diasOcupacion, int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupado = ocupado;
		this.nombreCliente = nombreCliente;
		this.diasOcupacion = diasOcupacion;
		this.numOcupantes = numOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupacion() {
		return diasOcupacion;
	}

	public void setDiasOcupacion(int diasOcupacion) {
		this.diasOcupacion = diasOcupacion;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupado=" + ocupado + ", nombreCliente=" + nombreCliente
				+ ", diasOcupacion=" + diasOcupacion + ", numOcupantes=" + numOcupantes + "]";
	}
	
	public double calcularHabitacion() {
		return precioBase*diasOcupacion;
	}
	
	

}
