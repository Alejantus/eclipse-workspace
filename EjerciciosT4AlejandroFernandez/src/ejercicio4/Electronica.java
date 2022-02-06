package ejercicio4;

public class Electronica extends Producto {

	private double peso;

	public Electronica(double precioUnitario, String nombre, int codigo, double peso) {
		super(precioUnitario, nombre, codigo);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electronica [peso=" + peso + "]";
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
