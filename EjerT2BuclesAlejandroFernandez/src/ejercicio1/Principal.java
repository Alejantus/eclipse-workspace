package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0;
		
		System.out.println("En este programa vamos a determinar el mayor de dos números");
		
		System.out.println("Introduzca, un número:");
		
		a=Leer.datoInt();
		
		System.out.println("Introduzca, otro número");
		
		b=Leer.datoInt();
		
		if (a == b) {
			System.out.println("Los dos números son iguales");
		}else if (a > b) {
			System.out.printf("El mayor número es el %d\n",a);
		}else {
			System.out.printf("El mayor número es el %d\n",b);
		}
		
		System.out.println("Muchas gracias, por su colaboración");
	}

}
