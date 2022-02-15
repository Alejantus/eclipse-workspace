package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0,tam=3,numH=0;
		
		GestionHabitaciones [] lista = new GestionHabitaciones[tam];
		
		System.out.println("Bienvenido al Hotel Palace");
		
		do {
			System.out.println("¿Qué acción quieres hacer?");
			System.out.println("1. Calcular precio de una habitación");
			System.out.println("2. Calcular recaudado");
			System.out.println("3. Mostrar factura");
			System.out.println("4. Mostrar habitaciones libres");
			System.out.println("0. Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego, vuelva pronto");
				break;
			case 1:
				System.out.println("¿Qué habitacion quieres ver?");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
