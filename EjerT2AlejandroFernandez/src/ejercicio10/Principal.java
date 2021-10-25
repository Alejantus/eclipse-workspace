package ejercicio10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, num = 0, factorial = 1;

		System.out.println("En esta actividad vamos a calcular el factorial de un número");

		do {
			System.out.println("¿Qué acción quieres hacer?");
			System.out.println("1. Hacer el factorial de un número");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			System.out.println("Introduzca un numero");
			num = Leer.datoInt();
			while (num != 0) {
				factorial *= num;
				num--;
			}
			System.out.printf("El factorial es: %d\n",factorial);
		} while (opcion != 0);
		System.out.println("Adiós");

	}

}
