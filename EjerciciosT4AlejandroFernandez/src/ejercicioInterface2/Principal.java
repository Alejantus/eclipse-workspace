package ejercicioInterface2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int tam=0,opcion=0;
		
		ArrayReales [] num = new ArrayReales[tam];
		
		System.out.println("Bienvenido, a nuestro programa sobre estadisticas");
		do {
			System.out.println("Diga un tamaño para el array");
			tam=Leer.datoInt();
			do {
				System.out.println("Acciones");
				System.out.println("1. Generar aleatorios");
				System.out.println("2. Saber el mayor de los aleatorios");
				System.out.println("3. Saber el menor de los aleatorios");
				System.out.println("4. Calcular sumatorio");
				System.out.println("0. Salir");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 0:
					System.out.println("Hasta luego, que tenga un buen día");
					break;
				case 1:
					
					break;
				default:
					break;
				}
			} while (opcion!=0);
		} while (tam!=0);
	}

}
