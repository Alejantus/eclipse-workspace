package ejercicio4;

public class Electronica extends Producto {

	private String	marca;

	public Electronica(double precioUnitario, String nombre, int codigo, String marca) {
		super(precioUnitario, nombre, codigo);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Electronica [marca=" + marca + "]";
	}

	public double calcularPrecio(double porc) {
		double impuesto=1000,div=100;
		if(super.getPrecioUnitario()>impuesto) {
			return super.getPrecioUnitario()+super.getPrecioUnitario()*(porc/div);
		}else {
			return super.getPrecioUnitario();
		}
	}
	
	
}
