package ejercicioTipoExamen2;

public abstract class Producto {
	
	private double precioBase;
	private int cantidad;
	private String nombre;
	
	public Producto(double precioBase, int cantidad, String nombre) {
		super();
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidad=" + cantidad + ", nombre=" + nombre + "]";
	}
	
	public abstract double calcularPVP(double porc);

}
