package ejercicio2;

public abstract class Producto {
	
	private double precioBase;
	private int cantUni;
	private String nombre;
	private boolean vendido;
	
	public Producto(double precioBase, int cantUni, String nombre, boolean vendido) {
		super();
		this.precioBase = precioBase;
		this.cantUni = cantUni;
		this.nombre = nombre;
		this.vendido = vendido;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantUni() {
		return cantUni;
	}

	public void setCantUni(int cantUni) {
		this.cantUni = cantUni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isVendido() {
		return vendido;
	}
	
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantUni=" + cantUni + ", nombre=" + nombre + "]";
	}
	
	public abstract double calcularPvp(double porc);
	
}
