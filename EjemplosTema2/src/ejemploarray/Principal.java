package ejemploarray;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// En los arrays el Eclipse mete 0 en todas las posiciones del array,

		int tam = 10, dos = 2, num = 0;

		int edades[] = new int[tam];
		/*
		 * System.out.println("Diga el número"); num = Leer.datoInt(); edades[dos]=num;
		 * 
		 * System.out.println(edades[dos]);
		 */

		// For para cargar el array
		for (int i = 0; i < tam; i++) {
			System.out.println("Introduzca un número");
			num = Leer.datoInt();
			edades[i] = num;
		}

		// Bucle para cargar el array
		for (int i = 0; i < tam; i++) {
			System.out.println("El número es: "+edades[i]);
		}
	}

}
