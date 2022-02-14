package ejercicio4;

public class LineaDeVenta {
	
	private Producto p;
	private int cantidad;
	
	public LineaDeVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}
	
	public Producto getP() {
		return p;
	}
	
	public void setP(Producto p) {
		this.p = p;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	public double calcularPrecioLinea() {
		return cantidad * p.calcularPrecio();
	}
	
	public void imprimirLinea() {
		System.out.printf("%d\t\t%s\t\t\t%.2f€\t\t\t%.2f€\n", cantidad, p.getNombre(), p.getPrecioUnitario(), calcularPrecioLinea());
	}

}
