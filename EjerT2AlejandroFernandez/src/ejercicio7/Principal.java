package ejercicio7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicion = 0, tope = 10, tablaMult = 0, mult = 0, opcion = 0;

		System.out.println("Bienvenido, vamos a mostrar una tabla de multiplicación");

		do {
			System.out.println("Introduzca un número, que este relacionado al menú");
			System.out.println("1. Enseñar tabla");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca la tabla que quiere multiplicar");
				tablaMult = Leer.datoInt();

				while (condicion < tope) {
					condicion++;
					mult = condicion * tablaMult;
					System.out.printf("\n%d x %d = %d\n", tablaMult, condicion, mult);
				}
				break;

			case 0:
				System.out.println("Adiós");
				break;

			default:
				System.out.println("Error,número de menú incorrecto");
				break;
			}

		} while (opcion != 0);
	}

}
