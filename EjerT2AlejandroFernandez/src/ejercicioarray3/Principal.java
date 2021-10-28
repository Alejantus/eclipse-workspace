package ejercicioarray3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 8, num = 0, media = 0, suma = 0, opcion = 0, cero = 0, uno = 1;

		int enteros[] = new int[tam];

		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Realizar media");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			if (opcion != 0) {
				for (int i = 0; i < enteros.length; i++) {
					System.out.println("Introduzca un número");
					num = Leer.datoInt();
					suma += num;
					if (num == 0) {
						cero = cero + uno;
						System.out.println("El número de 0 es de: " + (cero));
					}
				}
				
				media = suma / tam;

				System.out.println("La media es de: " + media);
			}

		} while (opcion != 0);
		System.out.println("Hasta luego.");
	}

}
