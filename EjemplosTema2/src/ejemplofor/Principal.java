package ejemplofor;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope = 0;
		String nombre;

		System.out.println("�Cu�ntas veces quiere que se repita su nombre?");
		tope = Leer.datoInt();
		System.out.println("Diga qu� nombre");
		nombre = Leer.dato();

		for (int i = 0; i < tope; i++) {
			System.out.println("N�mero "+(i+1)+": "+nombre);
			for (int j = 0; j < tope; j++) {
				System.out.println("Hola");
				
			}
		}
		
		

	}

}
