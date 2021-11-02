package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		double a = 0, b = 0, suma = 0, resta = 0, multi = 0, divi = 0;

		System.out.println("Bienvenido, en este programa vamos a hacer una mini-calculadora");

		do {
			System.out.println("\n¿Qué operación quieres realizar?");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca un número");
				a = Leer.datoDouble();
				System.out.println("Introduzca un número");
				b = Leer.datoDouble();
				suma = a + b;
				System.out.printf("El resultado es %.2f", suma);
				break;

			case 2:
				System.out.println("Introduzca un número");
				a = Leer.datoDouble();
				System.out.println("Introduzca un número");
				b = Leer.datoDouble();
				resta = a - b;
				System.out.printf("El resultado es %.2f", resta);
				break;

			case 3:
				System.out.println("Introduzca un número");
				a = Leer.datoDouble();
				System.out.println("Introduzca un número");
				b = Leer.datoDouble();
				multi = a * b;
				System.out.printf("El resultado es %.2f", multi);
				break;

			case 4:
				System.out.println("Introduzca un número");
				a = Leer.datoDouble();
				System.out.println("Introduzca un número");
				b = Leer.datoDouble();
				if (a != 0 && b != 0) {
					divi = a / b;
					System.out.printf("El resultado es %.2f", divi);
				}else {
					System.out.println("Introduzca un número que no sea cero, por favor");
				}
				break;

			default:
				System.out.println("Error,operacion no encontrada\n");
				break;
			}
		} while (opcion != 0);

	}

}
