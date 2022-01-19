package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam,nMs=0,opcion,seguir,numV;
		
		double precioU;
		String marca,modelo;
		int vendido;
		
		Movil listado[];
		Vendedor v;
		
		System.out.println("Bienvenido a nuestra tienda de moviles");
		System.out.println("Diga cuantos moviles quieres comprar:");
		tam = Leer.datoInt();
		listado = new Movil[tam];
		v = new Vendedor(listado);
		do {
		System.out.println("¿Qué acción quieres realizar?");
		System.out.println("1. Rellenar listado");
		System.out.println("2. Listar moviles");
		System.out.println("3. Imprimir moviles en Stock");
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
				System.out.println("Diga 1 si está vendido y 0 no está vendido");
				vendido=Leer.datoInt();
				listado[nMs]=new Movil(marca,modelo,vendido,precioU);
				nMs++;
			} while (listado.length > nMs);
			break;
		case 2:
			for (int i = 0; i < listado.length; i++) {
				System.out.println(listado[i]);
			}
			break;
		case 3:
			v.imprimirVendido(nMs);
			break;
		case 4:
			break;
		default:
			System.out.println("Error, opcion incorrecta");
			break;
		}
		}while(opcion!=0);
	}

}
