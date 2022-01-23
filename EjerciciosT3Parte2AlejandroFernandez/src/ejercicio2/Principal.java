package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam,numH;
		Habitacion listado[] = {new Habitacion (50.0,"Miguel",false,true,true,2,1),new Habitacion (200.0,"Luismi",true,false,true,4,2)};
		Hotel h;
		
		System.out.println("Bienvenido al hotel");

		System.out.println("¿Cuántas habitaciones vas a alquilar?");
		tam = Leer.datoInt();
		//listado = new Habitacion[tam];
		
		h = new Hotel(listado);
		//Imprimir la lista
		h.imprimirListado();
		
		//decidimos que habitacion consultar
		System.out.println("Que habitacion quiere consultar");
		numH = Leer.datoInt();
		h.imprimirLimpia(numH);

	}

}
