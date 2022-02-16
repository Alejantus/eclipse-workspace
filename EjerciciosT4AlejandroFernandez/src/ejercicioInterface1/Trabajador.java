package ejercicioInterface1;

public class Trabajador implements Impuesto {

	private String nombre;
	
	public Trabajador(String nombre) {
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
		return "Trabajador [nombre=" + nombre + "]";
	}

	public double calculoIva(double precio, int iva) {
		return 0;
	}

	public double calculoIrpf(double sueldo) {
		double cuota = 6.111,div=100;
		return cuota/ sueldo *div;
	}
	
	

}
