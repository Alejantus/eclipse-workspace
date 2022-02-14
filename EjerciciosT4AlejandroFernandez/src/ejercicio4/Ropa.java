package ejercicio4;

public class Ropa extends Producto {
	
	private String talla;

	public Ropa(double precioUnitario, String nombre, int codigo, String talla) {
		super(precioUnitario, nombre, codigo);
		this.talla = talla;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Ropa [talla=" + talla + "]";
	}

	@Override
	public double calcularPrecio() {
		double precioL = 1;
		double precioXL = 2;
		
		if(talla.equals("M")) {
			return super.getPrecioUnitario();
		}else if(talla.equals("L")) {
			return super.getPrecioUnitario() + precioL;
		}else {
			return super.getPrecioUnitario() + precioXL;
		}	}	

}
