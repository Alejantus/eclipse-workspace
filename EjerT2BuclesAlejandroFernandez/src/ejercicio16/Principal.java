package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		double a = 0.0, b = 0.0, operacion = 0.0;

		System.out.println("Bienvenido, en este programa vamos a hacer una mini-calculadora");

		do {
			System.out.println("\n?Qu? operaci?n quieres realizar?");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca un n?mero");
				a = Leer.datoDouble();
				System.out.println("Introduzca un n?mero");
				b = Leer.datoDouble();
				operacion = a + b;
				System.out.printf("El resultado es %.2f\n", operacion);
				break;

			case 2:
				System.out.println("Introduzca un n?mero");
				a = Leer.datoDouble();
				System.out.println("Introduzca un n?mero");
				b = Leer.datoDouble();
				operacion = a - b;
				System.out.printf("El resultado es %.2f\n", operacion);
				break;

			case 3:
				System.out.println("Introduzca un n?mero");
				a = Leer.datoDouble();
				System.out.println("Introduzca un n?mero");
				b = Leer.datoDouble();
				operacion = a * b;
				System.out.printf("El resultado es %.2f\n", operacion);
				break;

			case 4:
				System.out.println("Introduzca un n?mero");
				a = Leer.datoDouble();
				System.out.println("Introduzca un n?mero");
				b = Leer.datoDouble();
				if (b != 0) {
					operacion = a / b;
					System.out.printf("El resultado es %.2f\n", operacion);
				} else {
					System.out.println("Introduzca un n?mero que no sea cero, por favor");
				}
				break;

			default:
				System.out.println("Error,operacion no encontrada\n");
				break;
			}
		} while (opcion != 0);

	}

}
