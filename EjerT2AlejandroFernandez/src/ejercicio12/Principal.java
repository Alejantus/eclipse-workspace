package ejercicio12;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope = 6, nota = 0, media = 0, opcion = 0,sumaNotas = 0;

		System.out.println("Bienvenido, vamos a gestionar las notas de un alumno");

		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Hacer media");
			System.out.println("0.Salir");
			opcion = Leer.datoInt();
			for (int i = 0; i < tope; i++) {
				System.out.println("Introduzca la " + (i + 1) + " nota");
				nota = Leer.datoInt();
				sumaNotas += nota;
				if (nota < 5) {
					System.out.println("Has suspendido");
				}
			}
			media = sumaNotas / tope;
			System.out.printf("Tu media es de %d\n",media);
		} while (opcion != 0);
		System.out.println("Adiós");

	}

}
