package ejercicio2;

public class Pista {

	private boolean alquilada;
	private double precio;
	
	public Pista(boolean alquilada, double precio) {
		super();
		this.alquilada = alquilada;
		this.precio = precio;
	}

	public Pista() {
		super();
	}

	public boolean isAlquilada() {
		return alquilada;
	}

	public void setAlquilada(boolean alquilada) {
		this.alquilada = alquilada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pista [alquilada=" + alquilada + ", precio=" + precio + "]";
	}
	
	
	
}
