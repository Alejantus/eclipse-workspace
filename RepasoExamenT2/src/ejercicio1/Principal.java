package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 0, opcion = 0, mult = 0;

		System.out.println("Bienvenido, vamos a calcular el doble de un número");

		do {
			System.out.println("Introduzca el valor de la base");
			base = Leer.datoInt();
			while (base>0) {
				mult = base * base;
				System.out.printf("El cuadrado del número %d es: %d",base,mult);
			}
						
		} while (opcion != 0);

	}

}
