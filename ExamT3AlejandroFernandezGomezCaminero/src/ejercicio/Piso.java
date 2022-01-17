package ejercicio;

public class Piso {
	
	private String direccion;
	private int metros;
	private boolean reforma;
	private double precio;
	
	public Piso(String direccion, int metros, boolean reforma, double precio) {
		super();
		this.direccion = direccion;
		this.metros = metros;
		this.reforma = reforma;
		this.precio = precio;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getMetros() {
		return metros;
	}
	public void setMetros(int metros) {
		this.metros = metros;
	}
	public boolean isReforma() {
		return reforma;
	}
	public void setReforma(boolean reforma) {
		this.reforma = reforma;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metros=" + metros + ", reforma=" + reforma + ", precio=" + precio
				+ "]";
	}	
	
}
