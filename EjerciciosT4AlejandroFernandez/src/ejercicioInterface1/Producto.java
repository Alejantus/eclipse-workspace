package ejercicioInterface1;

public class Producto implements Impuesto {
	
	private String nombre;

	public Producto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + "]";
	}

	public double calculoIva(double precio, int iva) {
		double div=100;
		return precio+precio*iva/div;
	}

	
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
