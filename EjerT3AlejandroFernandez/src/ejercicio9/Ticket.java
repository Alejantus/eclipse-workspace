package ejercicio9;

public class Ticket {
	
	private double precio;
	private double cantidad;
	
	public Ticket(double precio, double cantidad) {
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
