package ejercicio4;

public class Alimentación extends Producto{

	private int alergias;

	public Alimentación(double precioUnitario, String nombre, int codigo, int alergias) {
		super(precioUnitario, nombre, codigo);
		this.alergias = alergias;
	}

	public int getAlergias() {
		return alergias;
	}

	public void setAlergias(int alergias) {
		this.alergias = alergias;
	}

	@Override
	public String toString() {
		return "Alimentación [alergias=" + alergias + "]";
	}
	
	public double calcularPrecio(double porc) {
		double div=100;
		return super.getPrecioUnitario()-super.getPrecioUnitario()*(porc/div);
	}
}
