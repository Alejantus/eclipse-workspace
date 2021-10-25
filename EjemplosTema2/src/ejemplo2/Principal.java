package ejemplo2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Siempre hay que inicializar las variables
		
		int a = 0;
		int b = 0;
		int suma = 0;
		
		System.out.println("Hola, vamos a sumar dos números");
		System.out.println("Introduzca el primer valor");
		
		a = Leer.datoInt();
		
		System.out.println("Introduzca el segundo valor");
		
		b = Leer.datoInt();
		
		suma = a + b;
		
		System.out.println("La suma de los dos valores es de "+suma);
		
		
		
		

	}

}
