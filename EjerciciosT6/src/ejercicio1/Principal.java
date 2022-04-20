package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void comprobarEdad(int edad) throws Ecuacion2GradoExc {
		if (edad < 0) {
			throw new Ecuacion2GradoExc("No puede haber edad negativa, de momento");
		}
	}

	public static void main(String[] args) {
		int a, b, c;
		double x1, x2;
		String aux;
		CEcuacion2Grado ec = new CEcuacion2Grado();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de a");
		aux = sc.nextLine();
		a = Integer.parseInt(aux);
		System.out.println("Introduzca el valor de b");
		aux = sc.nextLine();
		b = Integer.parseInt(aux);
		System.out.println("Introduzca el valor de c");
		aux = sc.nextLine();
		c = Integer.parseInt(aux);
		ec.calcularDiscriminante(a, b, c);
		x1 = ec.calcularEcX1(a, b, c);
		x2 = ec.calcularEcX2(a, b, c);

		System.out.printf("El resultado de x1 es %.2f\n" ,x1);
		System.out.printf("El resultado de x2 es %.2f" ,x2);
	}
}
