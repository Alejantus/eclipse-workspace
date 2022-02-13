package ejercicio4;

public class Alimentacion extends Producto{

	//Atributos
	
	private int caducidad;

	//Constructor
	
	public Alimentacion(double precioUnitario, String nombre, int codigo, int caducidad) {
		super(precioUnitario, nombre, codigo);
		this.caducidad = caducidad;
	}

	//Getters y setters
	
	public int getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}

	//Metodos
	
	@Override
	public String toString() {
		return super.toString() + "Alimentacion [caducidad=" + caducidad + "]";
	}
	
	public double calcularPrecio() {
		int porcentaje = 20;
		
		if(caducidad <= 2) {
			return super.getPrecioUnitario() - super.getPrecioUnitario() * porcentaje / 100;
		}else if(caducidad <= 0) {
			return 0;
		}else {
			return super.getPrecioUnitario();
		}
		
	}
	
	public void imprimirPrecio() {
		if(calcularPrecio() == 0) {
			System.out.println("El producto ha caducado y no puede ser vendido.");
		}else {
			System.out.printf("El precio es de %.2f€.\n", calcularPrecio());
		}
	}
	
	public void avisarCaducidad() {
		if(caducidad <= 2) {
			System.out.printf("El producto: %s caducará en %d dias.\n", super.getNombre(), caducidad);
		}else if(caducidad <= 0){
			System.out.printf("El producto: %s ha caducado.\n", super.getNombre());
		}else {
			System.out.printf("El producto: %s no ha caducado, lo hará en %d días.\n", super.getNombre(), caducidad);
		}
		
	}
	
}
