package ejercicio2;

public class Moviles extends Producto{
	
	private String marca;

	public Moviles(double precioBase, int cantUni, String nombre, boolean vendido, String marca) {
		super(precioBase, cantUni, nombre, vendido);
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
		return super.toString()+"Moviles [marca=" + marca + "]";
	}
	
	@Override
	public double calcularPvp(double porc) {
		return getPrecioBase()+porc;
	}
	
}
