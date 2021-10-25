package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radioCircuf = 3, dos = 2;
		double radioCirculo = 5.2, pi = 3.14;
		double areaCirculo,longitudCircunf;
		
		System.out.println("Bienvenido, en este programa lo que vamos hacer es calcular"
				+ " el area de un circulo y la longitud de una circunferencia");
		
		
		areaCirculo = pi * radioCirculo * radioCirculo;
		
		System.out.printf("\nEl area del Circulo es de %.2f metros cuadrados",areaCirculo);
		
		longitudCircunf = dos * radioCircuf * pi;
		
		System.out.printf("\nLa longitud de la circunferencia es de %.2f metros",longitudCircunf);

	}

}
