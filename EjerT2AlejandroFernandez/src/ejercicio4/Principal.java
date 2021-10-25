package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0,b = 2, div = 0, c = 0;
		
		System.out.println("Bienvenido, vamos a calcular si un numero es par o impar ");
		
		System.out.println("Introduzca un número:");
		
		a = Leer.datoInt();
		
		div = a % b;
		
		if (div == c) {
			System.out.println("Este número es par");
		}else {
			System.out.println("Este número es impar");
		}
	}

}
