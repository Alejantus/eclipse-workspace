package ejercicio1;

public class Circulo {
	
	private double radio;
	
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double calcularAreaCm(int dos) {
		
		return Math.PI*Math.pow(radio, dos);
		 
	}
	
	public double calcularAreaM(double areaMetro,int dos,int divisor) {
		
		return Math.PI*Math.pow(radio, dos)/divisor;

	}

}
