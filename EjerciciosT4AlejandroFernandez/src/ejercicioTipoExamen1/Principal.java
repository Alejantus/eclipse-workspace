package ejercicioTipoExamen1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0,tam=3,numH=0;
		double porc=0.0;
		
		Habitacion [] lista = new Habitacion[tam];
		GestionHabitaciones gh = new GestionHabitaciones(lista);
		
		System.out.println("Bienvenido al Hotel Palace");
		
		do {
			System.out.println("¿Qué acción quieres hacer?");
			System.out.println("1. Calcular precio de una habitación");
			System.out.println("2. Calcular recaudado");
			System.out.println("3. Mostrar factura");
			System.out.println("4. Mostrar habitaciones libres");
			System.out.println("5. Añadir habitaciones");
			System.out.println("0. Salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego, vuelva pronto");
				break;
			case 1:
				System.out.println("¿Qué habitación quieres ver?");
				numH=Leer.datoInt();
				System.out.println(gh.calcularPrecioUnaHab(porc,lista[numH-1]));
				break;
			case 2:
				System.out.println("¿Cuánto ha sido lo recaudado?");
				System.out.printf("Lo recaudado son unos %.2f €",gh.calcularRecaudado(porc,numH));
				break;
			case 3:
				gh.mostrarFactura(numH);
				break;
			case 4:
				gh.mostrarHabDisp(numH);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
