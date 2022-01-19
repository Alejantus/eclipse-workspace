package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam,nMs,opcion,seguir,numV;
		
		double precioU;
		String marca,modelo,vendido;
		
		Movil listado[];
		Vendedor v;
		
		System.out.println("Bienvenido a nuestra tienda de moviles");
		System.out.println("Diga cuantos moviles quieres comprar:");
		tam = Leer.datoInt();
		listado = new Movil[tam];
		v = new Vendedor(listado);
		System.out.println("¿Qué acción quieres realizar?");
		System.out.println("1. Rellenar listado");
		System.out.println("2. Listar moviles");
		opcion = Leer.datoInt();
		switch (opcion) {
		case 1:
			do {
				System.out.println("¿Qué marca quieres?");
				marca = Leer.dato();
				System.out.println("¿Qué modelo quieres?");
				modelo = Leer.dato();
				System.out.println("¿Cuánto crees que cuesta el móvil?");
				precioU = Leer.datoDouble();
				System.out.println("Está vendido el móvil sí/no");
				vendido=Leer.dato();
				System.out.println("Para poder continuar 1 y para terminar 0");
				seguir = Leer.datoInt();
			} while (seguir != 0 && listado < nMs);
			break;

		default:
			System.out.println("Error, opcion incorrecta");
			break;
		}
	}

}
