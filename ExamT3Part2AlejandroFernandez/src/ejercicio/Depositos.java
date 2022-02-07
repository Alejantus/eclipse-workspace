package ejercicio;

public class Depositos {
	
	private double altura;
	private double radio;
	private int litros;
	private double precio;
	
	public Depositos(double altura, double radio, int litros, double precio) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.litros = litros;
		this.precio = precio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Depositos [altura=" + altura + ", radio=" + radio + ", litros=" + litros + ", precio=" + precio + "]";
	}
	
	public double calcularVolumen() {
		int potencia=2;
		double volumen=0;
		volumen=(altura*Math.PI*Math.pow(radio, potencia));			
		return volumen;
	}

}
