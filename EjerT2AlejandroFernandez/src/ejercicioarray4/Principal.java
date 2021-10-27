package ejercicioarray4;

import java.util.Iterator;
import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primero declaramos el array y despues podemos instanciarlo
		// Cuando Angel diga elemento no es el indice sino el valor del indice
		// El .length indica el indice del array

		int hasta = 0, desde = 0, tam = 0,op=0;

		Random r = new Random(System.nanoTime());

		int enteros[];

		System.out.println("Bienvenido, en este programa vamos a rellenar un array con aleatorios");
		do {
			System.out.println("Diga la cantidad de números o 0 para terminar");
			tam = Leer.datoInt();
			enteros= new int[tam];
			System.out.println("\nDesde donde quieres empezar");
			desde = Leer.datoInt();
			System.out.println("Y hasta donde quieres terminar");
			hasta = Leer.datoInt();
			for (int i = 0; i < enteros.length; i++) {
				enteros[i] = r.nextInt(hasta - desde + 1) + desde;
			}
			
			System.out.println("Diga el elemento que quiere ver");
			op = Leer.datoInt();
			if(op<enteros.length+1) {
			System.out.println("El elemento es: "+enteros[op-1]);
			}else {
				System.out.println();
			}
			

		} while (tam != 0);

	}

}
