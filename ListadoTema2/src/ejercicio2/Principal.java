package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 0.0, b = 0.0, division = 0.0,cero=0.0;
		
		System.out.println("Bienvenido, vamos a hacer una division de dos numeros leídos por teclado");
		
		System.out.println("Por favor, introduzca un número:");
		
		a=Leer.datoDouble();
		
		System.out.println("Por favor, introduzca un número:");
		
		b=Leer.datoDouble();
		
		if (b==cero) {
			System.out.println("Error, introduzca otro número por favor:");
			
			b=Leer.datoDouble();
		}else {
			System.out.println("Lo siento le pedimos que reinicie el programa y por favor deje de poner ceros");
		}
		
		division = a / b;
		
		System.out.printf("El resultado de la división es de %.2f",division);
		
		System.out.println("Muchas gracias, le agredecemos su colaboración");
	}

}
