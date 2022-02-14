package ejercicio4;

public abstract class Producto {
	
	private double precioUnitario;
	private String nombre;
	private int codigo;
	
	public Producto(double precioUnitario, String nombre, int codigo) {
		super();
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	public abstract double calcularPrecio();
	

}
