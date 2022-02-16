package ejercicio1;

public class Suite extends Habitacion{
	
	private int m2;
	private double precioExtra;
	
	public Suite(double precioBase, boolean ocupacion, String nombre, int numOcupantes, int numDias, int m2,
			double precioExtra) {
		super(precioBase, ocupacion, nombre, numOcupantes, numDias);
		this.m2 = m2;
		this.precioExtra = precioExtra;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public double getPrecioExtra() {
		return precioExtra;
	}

	public void setPrecioExtra(double precioExtra) {
		this.precioExtra = precioExtra;
	}

	@Override
	public String toString() {
		return super.toString()+"Suite [m2=" + m2 + ", precioExtra=" + precioExtra + "]";
	}
	
	@Override
	public double calcularPrecio(double porc) {
		double div=100.0;
		return super.calcularPrecio(porc)+precioExtra-(super.calcularPrecio(porc)*porc/div);
	}

}
