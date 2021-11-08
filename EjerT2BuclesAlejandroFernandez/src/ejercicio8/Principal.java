package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicion = 0, tope = 10, suma = 0, num = 0, mult = 1, opcion = 0;
		
		System.out.println("Bienvenido, vamos a calcular una secuencia de 10 números.");

		do {
			condicion = 0; 
			tope = 10;
			suma = 0;
			num = 0;
			mult = 1;
			opcion = 0;
			
			System.out.println("\n¿Qué operación quieres realizar?");
			System.out.println("1. Realizar el ejercicio");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			while (condicion < tope) {
				condicion++;
				System.out.println("Introduzca el número "+condicion);
				num = Leer.datoInt();
				suma += num;
				mult *= num;
			}
			System.out.println("La suma de todos los números es de: " + suma);
			System.out.println("La multiplicación de todos los números es de: " + mult);

		} while (opcion != 0);
		System.out.println("Hasta luego");
	}

}
