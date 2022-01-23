package ejercicio1;

public class Producto {
	
	private double precio;
	private String forma;
	private String tamanio;
	private String marca;
	private String calidad;
	
	public Producto() {
		super();
	}

	public Producto(double precio, String forma, String tamanio, String marca, String calidad) {
		super();
		this.precio = precio;
		this.forma = forma;
		this.tamanio = tamanio;
		this.marca = marca;
		this.calidad = calidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", forma=" + forma + ", tamanio=" + tamanio + ", marca=" + marca
				+ ", calidad=" + calidad + "]";
	}

}
