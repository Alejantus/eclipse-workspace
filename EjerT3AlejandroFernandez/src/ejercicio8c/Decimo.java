package ejercicio8c;

public class Decimo {

	private double precio;
	private int num;

	public Decimo(double precio, int num) {
		this.precio = precio;
		this.num = num;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Decimo [precio=" + precio + ", num=" + num + "]";
	}

}
