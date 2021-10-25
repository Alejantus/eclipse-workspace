package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0,opcion2=0,personas=0;
		double salaVip=10.0,sala3D = 7.50,salaNormal=5.0,salaNinios=3.50,
				precioFVip=0.0,precioF3D=0.0,precioFNormal=0.0,precioFNinios=0.0;
		
		
		System.out.println("Bienvenido al cine Megaocio");
		
		System.out.println("¿Qúe peli quiere ver?");
		
		System.out.println("1. Avatar");
		
		System.out.println("2. Avengers Endgame");
		
		System.out.println("3. Titanic");
		
		System.out.println("4. Spiderman: No Way Home");
				
		opcion = Leer.datoInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Muy bien. ¿En qué sala lo quiere ver?");
				System.out.println("1. Sala normal");
				System.out.println("2. Sala 3D");
				
				opcion2 = Leer.datoInt();
				
				switch (opcion2) {
					case 1:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioFNormal = salaNormal * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f",precioFNormal);
						break;
						
					case 2:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioF3D = sala3D * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f",precioF3D);
						break;
						
					default:
						System.out.println("No existe la sala que ha elegido.");
						break;
				}
				break;
				
			case 2:				
				System.out.println("Muy bien. ¿En qué sala lo quiere ver?");
				System.out.println("1. Sala normal");
				System.out.println("2. Sala Vip");
				
				opcion2 = Leer.datoInt();
				
				switch (opcion2) {
					case 1:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioFNormal = salaNormal * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f€",precioFNormal);
						break;
						
					case 2:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioFVip = salaVip * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f€",precioFVip);
						break;
						
					default:
						System.out.println("No existe la sala que ha elegido.");
						break;
					}
				
			case 3:
				System.out.println("Muy bien. ¿En qué sala lo quiere ver?");
				System.out.println("1. Sala 3D");
				System.out.println("2. Sala Vip");
				
				opcion2 = Leer.datoInt();
				
				switch (opcion2) {
					case 1:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioF3D = sala3D * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f€",precioF3D);
						break;
						
					case 2:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioFVip = salaVip * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f€",precioFVip);
						break;
						
					default:
						System.out.println("No existe la sala que ha elegido.");
						break;
					}
				
			case 4:
				System.out.println("Muy bien. ¿En qué sala lo quiere ver?");
				System.out.println("1. Sala normal");
				System.out.println("2. Sala Niños");
				
				opcion2 = Leer.datoInt();
				
				switch (opcion2) {
					case 1:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioFNormal = salaNormal * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f€",precioFNormal);
						break;
						
					case 2:
						System.out.println("Muy bien. ¿Cuántas entradas quieres?");
						
						personas = Leer.datoInt();
						
						precioFNinios = salaNinios * personas;
						
						System.out.printf("El precio de su/s entradas es de %.2f€",precioFNinios);
						break;
						
					default:
						System.out.println("No existe la sala que ha elegido.");
						break;
					}
	
			default:
				System.out.println("No existe la película que ha elegido.");
				break;
		}

	}

}
