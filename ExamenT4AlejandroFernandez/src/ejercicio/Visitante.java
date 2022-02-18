package ejercicio;

public class Visitante implements IEntrada {

	private String nombre;
	private int id;
	private double precioEntrada;
	private int edad;

	public Visitante(String nombre, int id, double precioEntrada, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.precioEntrada = precioEntrada;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Visitante [nombre=" + nombre + ", id=" + id + ", precioEntrada=" + precioEntrada + ", edad=" + edad
				+ "]";
	}

	public double calcularPrecioEntrada() {
		int menor = 18, mayor = 65;
		double gratis = 0.0, div = 100.0, porc = 50.0, total = 0.0;
		if (edad < menor) {
			total = gratis;
		} else if (edad <= mayor) {
			total = precioEntrada;
		} else if (edad > mayor) {
			total = precioEntrada - (precioEntrada * porc / div);
		}
		return total;
	}

}
