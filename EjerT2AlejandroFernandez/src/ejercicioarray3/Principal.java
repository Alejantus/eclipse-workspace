package ejercicioarray3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El tama�o siempre se tiene que definir nombre del array.length despues de
		// declarar el tama�o del
		// array.

		int tam = 8, suma = 0, opcion = 0, cero = 0,num=0;
		double media = 0.0;

		int enteros[] = new int[tam];

		do {
			cero = 0;
			suma = 0;
			num = 0;
			
			System.out.println("�Qu� acci�n quieres realizar?");
			System.out.println("1. Realizar media");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			if (opcion != cero) {
				for (int i = 0; i < enteros.length; i++) {
					System.out.println("Introduzca el n�mero " + (i + 1));
					enteros[i] = Leer.datoInt();
					suma += enteros[i];
					if (enteros[i] == cero) {
						num++;
					}
				}

				media = suma / enteros.length;

				System.out.println("La media es de: " + media);

				System.out.println("El n�mero de 0 es de: " + num);
			}

		} while (opcion != 0);
		System.out.println("Hasta luego.");
	}

}
