package ejercicio1;

public class Apartamento extends Habitacion{
	
	private int m2;
	private double precioServicio;
	private boolean servExtra;
	
	public Apartamento(double precioBase, boolean ocupacion, String nombre, int numOcupantes, int numDias, int m2,
			double precioServicio, boolean servExtra) {
		super(precioBase, ocupacion, nombre, numOcupantes, numDias);
		this.m2 = m2;
		this.precioServicio = precioServicio;
		this.servExtra = servExtra;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public double getPrecioServicio() {
		return precioServicio;
	}

	public void setPrecioServicio(double precioServicio) {
		this.precioServicio = precioServicio;
	}
	public boolean isServExtra() {
		return servExtra;
	}
	public void setServExtra(boolean servExtra) {
		this.servExtra = servExtra;
	}

	@Override
	public String toString() {
		return super.toString()+"Apartamento [m2=" + m2 + ", precioServicio=" + precioServicio + "]";
	}
	
	@Override
	public double calcularPrecio(double porc) {
		if(servExtra) {
			return super.calcularPrecio(porc)+precioServicio;	
		}else {
			return super.calcularPrecio(porc); 
		}
		 
	}
	
}
