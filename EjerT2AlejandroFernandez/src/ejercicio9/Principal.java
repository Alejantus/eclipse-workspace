package ejercicio9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicion = 0, tope = 10, suma = 0, num = 0, opcion = 0;

		System.out.println("Bienvenido, vamos a calcular una serie de números");

		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Realizar operaciones numéricas");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			if (opcion == 0) {
				System.out.println("Adiós");
			} else {
				while (condicion < tope) {
					condicion++;
					System.out.println("Introduzca el " + condicion + " número:");
					num = Leer.datoInt();
					if (num > 0) {
						suma += num;
					} else {
						System.out.println("No, introduzcas números negativos.");
					}

				}
				System.out.println("La suma de todos esos números es de: " + suma);
			}

		} while (opcion != 0);

	}

}
