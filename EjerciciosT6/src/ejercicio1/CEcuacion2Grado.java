package ejercicio1;

public class CEcuacion2Grado {

	public CEcuacion2Grado() {
		super();
	}

	public double calcularDiscriminante(int a, int b, int c) {
		double total = 0;
		total = (Math.pow(b, 2) - 4 * a * c);
		return total;
	}

	public double calcularEcX1(int a, int b, int c) {
		double total = 0;
		total = (-b + Math.sqrt(calcularDiscriminante(a, b, c)) / (2 * a));
		return total;
	}

	public double calcularEcX2(int a, int b, int c) {
		double total = 0;
		total = (-b - Math.sqrt(calcularDiscriminante(a, b, c)) / (2 * a));
		return total;
	}

}
