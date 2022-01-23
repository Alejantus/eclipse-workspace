package ejercicio2;

public class Habitacion {
	
	private double precioB;
	private String nombreCliente;
	private boolean ocupado,limpia,extras;
	private int numDias,tipo;
	
	public Habitacion(double precioB, String nombreCliente, boolean ocupado, boolean limpia, boolean extras,
			int numDias, int tipo) {
		super();
		this.precioB = precioB;
		this.nombreCliente = nombreCliente;
		this.ocupado = ocupado;
		this.limpia = limpia;
		this.extras = extras;
		this.numDias = numDias;
		this.tipo = tipo;
	}

	public Habitacion() {
		super();
	}

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Habitacion [precioB=" + precioB + ", nombreCliente=" + nombreCliente + ", ocupado=" + ocupado
				+ ", limpia=" + limpia + ", extras=" + extras + ", numDias=" + numDias + ", tipo=" + tipo + "]";
	}
	
}
