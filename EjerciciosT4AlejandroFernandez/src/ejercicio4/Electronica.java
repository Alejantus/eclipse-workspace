package ejercicio4;

public class Electronica extends Producto {

	private int	impuesto;

	public Electronica(double precioUnitario, String nombre, int codigo, int impuesto) {
		super(precioUnitario, nombre, codigo);
		this.impuesto = impuesto;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + "]";
	}

	public double calcularPrecio() {
		double div=100;
		if(super.getPrecioUnitario()>impuesto) {
			return super.getPrecioUnitario()+super.getPrecioUnitario()*(impuesto/div);
		}else {
			return super.getPrecioUnitario();
		}
	}

	public void imprimirPrecio() {
		System.out.printf("El precio del dispositivo es de %.2f€.\n", calcularPrecio());
	}	
	
}
