package ejercicio4;

public class Ropa extends Producto{

	//Atributos
	
	private String talla;

	//Constructor
	
	public Ropa(double precioUnitario, String nombre, int codigo, String talla) {
		super(precioUnitario, nombre, codigo);
		this.talla = talla;
	}

	//Getters y setters
	
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return super.toString() + "Ropa [talla=" + talla + "]";
	}
	
	public double calcularPrecio() {
		double precioL = 1;
		double precioXL = 2;
		
		if(talla.equals("M")) {
			return super.getPrecioUnitario();
		}else if(talla.equals("L")) {
			return super.getPrecioUnitario() + precioL;
		}else {
			return super.getPrecioUnitario() + precioXL;
		}
	}
	
	public void imprimirPrecio() {
		System.out.printf("El precio de la prenda es de %.2f€.\n", calcularPrecio());
	}
	
}
