package ejercicio4;

public class Ropa extends Producto {
	
	private char talla;

	public Ropa(double precioUnitario, String nombre, int codigo, char talla) {
		super(precioUnitario, nombre, codigo);
		this.talla = talla;
	}

	public char getTalla() {
		return talla;
	}

	public void setTalla(char talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Ropa [talla=" + talla + "]";
	}

	@Override
	public double calcularPrecio(double por) {
		return 0;
	}	

}
