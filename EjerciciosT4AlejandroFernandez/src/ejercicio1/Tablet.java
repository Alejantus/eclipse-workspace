package ejercicio1;

public class Tablet extends Ordenador {
	
	private double precioSeguro;

	public Tablet(double precioBase, double frecuencia, int capacidad, double precioSeguro) {
		super(precioBase, frecuencia, capacidad);
		this.precioSeguro = precioSeguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return "Tablet [precioSeguro=" + precioSeguro + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPrecioVenta(int porcentaje) {
		return super.calcularPrecioVenta(porcentaje)+precioSeguro;
	}
}
