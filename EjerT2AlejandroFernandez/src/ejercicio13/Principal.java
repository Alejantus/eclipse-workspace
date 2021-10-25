package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 10, num = 0;

		int edades[] = new int[tam];
		
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
