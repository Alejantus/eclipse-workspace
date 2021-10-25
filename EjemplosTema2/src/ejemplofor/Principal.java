package ejemplofor;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope = 0;
		String nombre;

		System.out.println("¿Cuántas veces quiere que se repita su nombre?");
		tope = Leer.datoInt();
		System.out.println("Diga qué nombre");
		nombre = Leer.dato();

		for (int i = 0; i < tope; i++) {
			System.out.println("Número "+(i+1)+": "+nombre);
			for (int j = 0; j < tope; j++) {
				System.out.println("Hola");
				
			}
		}
		
		

	}

}
