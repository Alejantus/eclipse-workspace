package ejemploHerencia3;

public abstract class Figura {

	private double x;
	private double y;
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public abstract double calcularArea();
}
