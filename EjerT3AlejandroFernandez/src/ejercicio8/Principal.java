package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int decimo = 0, opcion = 0,desde=0,hasta=0;

		Sorteo s1 = new Sorteo();

		System.out.println("Bienvenido, al sorteo de Navidad de los Salesianos");
		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Comprar decimo");
			System.out.println("2. Hacer sorteo");
			System.out.println("3. Comprobar decimo");
			System.out.println("4. Mostrar ganador");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Escoja su décimo de lotería");
				decimo=Leer.datoInt();
				System.out.printf("El número de su boleto es ");
				System.out.println(s1.comprarDecimo(decimo));
				break;
			case 2:
				System.out.println("Introduzca el número minimo de decimos");
				desde=Leer.datoInt();
				System.out.println("Introduzca el número máximo de decimos");
				hasta=Leer.datoInt();
				System.out.printf("Se han generado ");
				System.out.println(Sorteo.generarDecimos(desde, hasta));
				break;
			case 3:
				System.out.println("Vamos a comprobar tu decimo de lotería");
				System.out.println(s1.comprobarDecimo(hasta, desde));
				break;
			case 4:
				System.out.println("Vamos a decir quien es el ganador del sorteo de Navidad");
				System.out.printf("Y el ganador del sorteo es el ");
				System.out.println(Sorteo.generarGanador(desde, hasta));
				System.out.printf("Enhorabuena a la/las personas que tengan el decimo");
				System.out.println(Sorteo.generarGanador(desde, hasta));
				break;
			default:
				System.out.println("Error,opción incorrecta");
				break;
			}
		} while (opcion != 0);

	}

}
