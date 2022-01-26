package ejercicio1;

public class Portatil extends Ordenador {

	private int descuento;

	public Portatil(double precioBase, double frecuencia, int capacidad, int descuento) {
		super(precioBase, frecuencia, capacidad);
		this.descuento = descuento;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Portatil [descuento=" + descuento + ", toString()=" + super.toString() + "]";
	}

	public double calcularPrecioVenta(int porcentaje) {
		double division=100.0;
		return super.calcularPrecioVenta(porcentaje)*descuento/division;
	}

}
