package ejercicio4;

public class LineaVenta {

	//Atributos
	
	private int cantidad;
	private Producto linea;
	
	//Constructor
	
	public LineaVenta(int cantidad, Producto linea) {
		super();
		this.cantidad = cantidad;
		this.linea = linea;
	}
	
	//Getters y setters

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getLinea() {
		return linea;
	}

	public void setLinea(Producto linea) {
		this.linea = linea;
	}

	//Métodos
	
	@Override
	public String toString() {
		return "LineaVenta [cantidad=" + cantidad + ", linea=" + linea + "]";
	}
	
	public void imprimirLinea() {
		System.out.printf("%d\t\t%s\t\t\t%.2f€\t\t\t%.2f€\n", cantidad, linea.getNombre(), linea.getPrecioUnitario(), calcularPrecioLinea());
	}
	
	public double calcularPrecioLinea() {
		return cantidad * linea.calcularPrecio();
	}
	
}
