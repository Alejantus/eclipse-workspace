package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicion = 0, tope = 10, suma = 0, num = 0, mult = 1, opcion = 0;
		
		System.out.println("Bienvenido, vamos a calcular una secuencia de 10 n�meros.");

		do {
			condicion = 0; 
			tope = 10;
			suma = 0;
			num = 0;
			mult = 1;
			opcion = 0;
			
			System.out.println("\n�Qu� operaci�n quieres realizar?");
			System.out.println("1. Realizar el ejercicio");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			while (condicion < tope) {
				condicion++;
				System.out.println("Introduzca el n�mero "+condicion);
				num = Leer.datoInt();
				suma += num;
				mult *= num;
			}
			System.out.println("La suma de todos los n�meros es de: " + suma);
			System.out.println("La multiplicaci�n de todos los n�meros es de: " + mult);

		} while (opcion != 0);
		System.out.println("Hasta luego");
	}

}
