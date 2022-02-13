package ejercicio4;

public class Electronica extends Producto{
	
	//Atributos
	
	private int impuesto;

	//Constructor
	
	public Electronica(double precioUnitario, String nombre, int codigo, int impuesto) {
		super(precioUnitario, nombre, codigo);
		this.impuesto = impuesto;
	}

	//Getters y setters
	
	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	//Métodos
	
	@Override
	public String toString() {
		return super.toString() + "Electronica [impuesto=" + impuesto + "]";
	}
	
	public double calcularPrecio() {
		return super.getPrecioUnitario() + super.getPrecioUnitario() * impuesto / 100;
	}
	
	public void imprimirPrecio() {
		System.out.printf("El precio del dispositivo es de %.2f€.\n", calcularPrecio());
	}
	
}
