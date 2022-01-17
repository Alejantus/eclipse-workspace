package ejercicio8c;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sorteo s;
		int desde = 1, hasta = 99999;
		int decimo = 0, ganador = 0, opcion = 0;

		s = new Sorteo();

		System.out.println("Bienvenido a nuestro sorteo de la lotería");

		do {
			System.out.println("\nQué acción quieres realizar");
			System.out.println("1. Comprar decimo");
			System.out.println("2. Realizar sorteo");
			System.out.println("3. Comprobar decimo");
			System.out.println("4. Revelar decimo ganador");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Tu decimo es el ");
				System.out.print(s.comprarDecimo(hasta, desde));
				break;
			case 2:
				System.out.println("Vamos a realizar el sorteo estad atentos");
				s.sortear(hasta, desde);
				break;
			case 3:
				System.out.println("Vamos a comprobar tu decimo");
				s.mostrarComprobarDecimo(s.comprobarDecimo(s.comprarDecimo(hasta, desde), s.sortear(hasta, desde)));
				break;
			case 4:
				System.out.println("Vamos a enseñar el ganador del sorteo ");
				System.out.print(s.sortear(hasta, desde));
				System.out.println("\nFelcidades a la persona que tenga el decimo");
				break;
			case 0:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Error,opción incorrecta");
				break;
			}
		} while (opcion != 0);

	}

}
