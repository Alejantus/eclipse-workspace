package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero,climatizador;
	
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	
	public String dime_largo() {
		return "El largo del coche es "+largo;
	}

	public void establece_color(String color_coche) {
		color=color_coche;
	}
	
	public String dime_color() {
		return "El color del coche es "+color;
	}
}
