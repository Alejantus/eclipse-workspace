package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, expo = 0, num = 0, base=1;

		System.out.println("Bienvenido, vamos a introducir un n�mero y multiplicarlo por su exponente");

		do {
			System.out.println("\n�Qu� acci�n quiere realizar?");
			System.out.println("1. Hacer operaci�n de un n�mero con su exponente");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
				System.out.println("Introduzca el n�mero que quiere calcular");
				num = Leer.datoInt();
				System.out.println("Introduzca el exponente que quiere calcular");
				expo = Leer.datoInt();

				for (int i = 0; i < expo; i++) {
					base *=num;
				}
				System.out.println("El resultado del c�lculo es de: " + base);
			
			
		} while (opcion != 0);
		System.out.println("Adi�s");

	}

}
