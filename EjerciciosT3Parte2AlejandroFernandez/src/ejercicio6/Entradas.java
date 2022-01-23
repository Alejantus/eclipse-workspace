package ejercicio6;

public class Entradas {
	
	private int id;
	private double precio;
	private boolean disponible;
	private int fila;
	private int butaca;
	
	
	public Entradas(int id, double precio, boolean disponible, int fila, int butaca) {
		super();
		this.id = id;
		this.precio = precio;
		this.disponible = disponible;
		this.fila = fila;
		this.butaca = butaca;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getButaca() {
		return butaca;
	}
	public void setButaca(int butaca) {
		this.butaca = butaca;
	}

	@Override
	public String toString() {
		return "Entradas [id=" + id + ", precio=" + precio + ", disponible=" + disponible + ", fila=" + fila
				+ ", butaca=" + butaca + "]";
	}	

}
