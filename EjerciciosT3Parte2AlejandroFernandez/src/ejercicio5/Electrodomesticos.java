package ejercicio5;

public class Electrodomesticos {
	
	private double precioB;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	public Electrodomesticos(double precioB, String color, char consumoEner, double peso) {
		this.precioB = precioB;
		this.color = color;
		this.consumoEnergetico = consumoEner;
		this.peso = peso;
	}

	public Electrodomesticos() {
		this.precioB = 100.0;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5.0;
	}

	public Electrodomesticos(double precioB,double peso) {
		super();
		this.precioB = precioB;
		this.color="blanco";
		this.consumoEnergetico='F';
		this.peso = peso;
	}

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEner() {
		return consumoEnergetico;
	}

	public void setConsumoEner(char consumoEner) {
		this.consumoEnergetico = consumoEner;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [precioB=" + precioB + ", color=" + color + ", consumoEner=" + consumoEnergetico + ", peso="
				+ peso + "]";
	}
	
	public char comprobarConsumoEnergetico(char letra) {
		if(letra=='A') {
			return letra;
		}else if(letra=='B') {
			return letra;
		}else if(letra=='C') {
			return letra;
		}else if(letra=='D') {
			return letra;
		}else if(letra=='E') {
			return letra;
		}else {
			return letra;
		}
	}
	
	public String comprobarColor(String color) {
		if(color.equalsIgnoreCase("negro")) {
			return color;
		}else if(color.equalsIgnoreCase("rojo")) {
			return color;
		}else if(color.equalsIgnoreCase("azul")) {
			return color;
		}else if(color.equalsIgnoreCase("gris")) {
			return color;
		}else {
			return color;
		}
	}
	
	public double precioFinal(double resultado) {
		double precioFinalA=100.0,precioFinalB=80.0,precioFinalC=60.0,
				precioFinalD=50.0,precioFinalE=30.0,precioFinalF=10.0;
		if(consumoEnergetico=='A') {
			resultado=precioB+precioFinalA;
			return resultado;
		}else if (consumoEnergetico=='B') {
			resultado=precioB+precioFinalB;
			return resultado;
		}else if (consumoEnergetico=='C') {
			resultado=precioB+precioFinalC;
			return resultado;
		}else if (consumoEnergetico=='D') {
			resultado=precioB+precioFinalD;
			return resultado;
		}else if (consumoEnergetico=='E') {
			resultado=precioB+precioFinalE;
			return resultado;
		}else {
			resultado=precioB+precioFinalF;
			return resultado;
		}
			
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
