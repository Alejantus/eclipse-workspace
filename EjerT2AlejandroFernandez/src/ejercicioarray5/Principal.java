package ejercicioarray5;

import java.util.Iterator;
import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primero declaramos el array y despues podemos instanciarlo
		// Cuando Angel diga elemento no es el indice sino el valor del indice
		// El .length indica el indice del array
		//

		int hasta = 0, desde = 0, tam = 0, mayor = 0, menor = 0, suma = 0;

		Random r = new Random(System.nanoTime());

		int enteros[];

		System.out.println("Bienvenido, en este programa vamos a rellenar un array con aleatorios");
		do {
			suma = 0;
			System.out.println("Diga la cantidad de números o 0 para terminar");
			tam = Leer.datoInt();
			if (tam != 0) {

				enteros = new int[tam];
				System.out.println("\nDesde donde quieres empezar");
				desde = Leer.datoInt();
				System.out.println("Y hasta donde quieres terminar");
				hasta = Leer.datoInt();
				menor = 0;
				mayor = 0;
				for (int i = 0; i < enteros.length; i++) {
					enteros[i] = r.nextInt(hasta - desde + 1) + desde;
					suma += enteros[i];
					if (i==0) {
						menor = enteros[i];
					}
					if (enteros[i] > mayor) {
						mayor = enteros[i];
					}
					if (enteros[i]<menor) {
						menor = enteros[i];
					}
				}
				for (int i = 0; i < enteros.length; i++) {
					System.out.println(enteros[i]);
				}
				
				System.out.println("La suma de todos los elementos es: "+suma);
				System.out.println("El mayor valor es: "+mayor);
				System.out.println("El menor valor es: "+menor);

			}
		} while (tam != 0);

	}

}
