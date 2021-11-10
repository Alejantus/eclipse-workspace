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
	
	public double calcularCmCuadrado(double areaCm,int dos) {
		
		areaCm=Math.PI*Math.pow(radio, dos);
		
		return areaCm;
	}
	
	public double calcularMCuadrado(double areaMetro,int dos,int divisor) {
		areaMetro=Math.PI*Math.pow(radio, dos)/divisor;
		
		return areaMetro;
	}

}
