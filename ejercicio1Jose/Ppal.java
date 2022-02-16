package ejercicio1;

import lectura.Leer;

public class Ppal {
	
	public static void main(String[] args) {
		
		int menu1=0, numHab=0, tam=6;
		double porc=0.0;
		Habitacion[] lista = new Habitacion[tam];
		GestionHotel gestion = new GestionHotel(lista);
		
		lista[numHab++] = new Habitacion(500, false, "Juan", 4, 7);
		lista[numHab++] = new Suite(1000, false, "Pedro", 5, 6, 50, 50);
		lista[numHab++] = new Apartamento(550, true, "Miguel", 6, 5, 50, 50, true);
		lista[numHab++] = new Habitacion(20, false, "Adolfo", 3, 3);
		lista[numHab++] = new Suite(5000, true, "Jose", 2, 10, 50, 50);
		lista[numHab++] = new Apartamento(510, false, "Maylor", 7, 8, 50, 50, false);
		
		System.out.println("Bienvenido a este programa");
		
		do {
			imprimirMenu();
			menu1=Leer.datoInt();
			switch (menu1) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					System.out.println("Diga la habitación de la que desea calcular el precio");
					gestion.mostrarLibres(numHab);
					numHab=Leer.datoInt();
					System.out.println("Diga el porcentaje");
					porc=Leer.datoDouble();
					System.out.printf("El precio de la habitacion "
							+ "es: %.2f",gestion.calcularUna(lista[numHab-1], porc));
					break;
				case 2:
					System.out.printf("El total recuadado es: %.2f",gestion.calcularTotalRecaudado(porc, numHab));
					break;
				case 3:
					gestion.mostrarTicket();
					break;
				case 4:
					gestion.mostrarOcupadas(numHab);
					break;

				default:
					System.out.println("Introduzca un número correcto.");
					break;
			}
		}while (menu1!=0);
	}
	
	public static void imprimirMenu() {
		System.out.println("\n1. Calcular el precio de una habitacion");
		System.out.println("2. Calcular el total recuadado");
		System.out.println("3. Mostrar ticket");
		System.out.println("4. Mostrar habitaciones ocupadas");
		System.out.println("0. Para salir");
	}
	
}
