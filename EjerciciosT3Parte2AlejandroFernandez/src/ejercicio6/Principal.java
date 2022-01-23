package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, tam = 0, nEs = 0;
		double nuevoPrecio = 20.0;
		String pelicula = "Spiderman: No Way Home";

		int id = 0, fila = 0, butaca = 0, numP = 0;
		boolean disponible = false;

		Entradas listado[];
		Sala s;

		System.out.println("Bienvenido a nuestro cine:\tMegaocio");
		do {
			System.out.println("Cuántas entradas podemos vender");
			tam = Leer.datoInt();
			listado = new Entradas[tam];
			s = new Sala(listado, 1);
			do {
				System.out.println("¿Qué acción quieres realizar?");
				System.out.println("1. Mostrar cartelera");
				System.out.println("2. Comprar entrada");
				System.out.println("3. Modificar precio entrada");
				System.out.println("4.");
				System.out.println("0. Salir");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					System.out.println(pelicula);
					break;
				case 2:
					id++;
					System.out.println("¿Qué fila quiere?");
					fila = Leer.datoInt();
					System.out.println("¿Qué butaca quieres?");
					butaca = Leer.datoInt();
					System.out.println("Diga 1 si está disponible y 0 si no esta");
					if (numP == 1) {
						disponible = true;
					} else if (numP == 0) {
						disponible = false;
					}
					listado[nEs] = new Entradas(id, 10.0, disponible, fila, butaca);
					nEs++;
					break;
				case 3:
					s.modificarEntrada(nuevoPrecio);
					break;
				case 4:
					System.out.printf("El total es de unos %d €\n",s.contarRecaudacion());
					break;
				case 0:
					System.out.println("Hasta luego");
					break;
				default:
					System.out.println("Error,opcion incorrecta");
					break;
				}
			} while (opcion != 0);
		} while (tam != 0);
	}

}
