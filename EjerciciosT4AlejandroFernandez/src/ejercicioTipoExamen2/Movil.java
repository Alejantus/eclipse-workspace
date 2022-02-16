package ejercicioTipoExamen2;

public class Movil extends Producto {
	
	private String marca;

	public Movil(double precioBase, int cantidad, String nombre, String marca) {
		super(precioBase, cantidad, nombre);
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
		return "Movil [marca=" + marca + "]";
	}

	public double calcularPVP(double porc) {
		double div=100.0;
		return super.getPrecioBase()*porc/div;
	}
	
	

}
