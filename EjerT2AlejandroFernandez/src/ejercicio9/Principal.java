package ejercicio9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicion = 0, tope = 10, suma = 0, num = 0, opcion = 0;

		System.out.println("Bienvenido, vamos a calcular una serie de n�meros");

		do {
			System.out.println("�Qu� acci�n quieres realizar?");
			System.out.println("1. Realizar operaciones num�ricas");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			if (opcion == 0) {
				System.out.println("Adi�s");
			} else {
				while (condicion < tope) {
					condicion++;
					System.out.println("Introduzca el " + condicion + " n�mero:");
					num = Leer.datoInt();
					if (num > 0) {
						suma += num;
					} else {
						System.out.println("No, introduzcas n�meros negativos.");
					}

				}
				System.out.println("La suma de todos esos n�meros es de: " + suma);
			}

		} while (opcion != 0);

	}

}
