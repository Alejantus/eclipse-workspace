package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0,tam=3;
		
		Empleado [] lista = new Empleado [tam];
		
		System.out.println("Bienvenido a las oficinas del Grupo Mas");
		
		do {
		System.out.println("¿Qué acción quieres realizar?");
		opcion = Leer.datoInt();
		}while(opcion != 0);
	}

}
