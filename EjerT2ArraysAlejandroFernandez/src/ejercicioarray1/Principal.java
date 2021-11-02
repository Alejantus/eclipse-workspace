package ejercicioarray1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 3;		
		String nombres[] = {"Alejandro","Mario","David","Roberto","Jose Joaquín"};
		
		String listaNombres[]=new String [tam];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		for (int i = 0; i < listaNombres.length; i++) {
			System.out.println("Diga nombres");
			listaNombres[i] = Leer.dato();
		}
		
		for (int i = 0; i < listaNombres.length; i++) {
			System.out.println("Nombre: "+listaNombres[i]);
		}

	}

}
