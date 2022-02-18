package ejercicio;

public class Familiar extends Visitante {

	private int hijos;

	public Familiar(String nombre, int id, double precioEntrada, int edad, int hijos) {
		super(nombre, id, precioEntrada, edad);
		this.hijos = hijos;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	@Override
	public String toString() {
		return super.toString() + "Familiar [hijos=" + hijos + "]";
	}

	public double calcularPrecioEntrada() {
		double euro = 1.0;
		return super.calcularPrecioEntrada() - (euro * hijos);
	}

}
