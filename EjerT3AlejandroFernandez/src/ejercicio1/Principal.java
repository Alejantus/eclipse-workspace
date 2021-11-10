package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio=5.75;
		int dos=2,divisor=10000;
		
		Circulo centimetros;
		
		centimetros=new Circulo(radio);
		
		System.out.println("Bienvenido, en este programa vamos a realizar el área de un circulo en centimetro y metro cuadrado.");
		
		System.out.printf("El área de nuestro circulo en centimetro cuadrado es de: %.2f\n",centimetros.calcularCmCuadrado(radio, dos));
		System.out.printf("Mientras que el área del circulo en metro cuadrado es de: %.2f",centimetros.calcularMCuadrado(radio, dos, divisor));

	}

}
