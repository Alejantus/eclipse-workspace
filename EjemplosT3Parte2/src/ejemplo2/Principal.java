package ejemplo2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nVs = 0, seguir, tam = 3;// Contador de objetos Veh�culo, variable para salir del
		// bucle y tama�o
		
		String modelo;
		
		boolean cRuedas;

		Vehiculo lista[] = new Vehiculo[tam];
		
		String aux;

		do {
			System.out.print("Introduce el modelo del veh�culo: ");
			
			modelo = Leer.dato();
			
			System.out.print("Introduce la potencia: ");
			
			double potencia = Leer.datoDouble();
			
			lista[nVs] = new Vehiculo(modelo, potencia);
			
			nVs++;// Aumentamos en uno el n�mero de veh�culos
			
			System.out.println("Si desea terminar pulse 0, cualquier n�mero para seguir");
			
			seguir = Leer.datoInt();
			
		} while (seguir != 0 && nVs < lista.length);

		//Cuando quiero acceder a solo un valor del array solo tengo que indicar la posicion del array
		//y despues poner el atributo que queremos ense�ar.
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
	}

}
