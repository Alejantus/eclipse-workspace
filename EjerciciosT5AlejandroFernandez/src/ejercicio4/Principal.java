package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String nombre,numero;
		
		Agenda a = new Agenda();
		Contacto c;
		
		System.out.println("Bienvenido a la agenda de tu teléfono");
		
		do {
			System.out.println("¿Qué quieres hacer el día de hoy?");
			System.out.println("1. Añadir un contacto");
			System.out.println("2. Buscar contacto por nombre");
			System.out.println("3. Eliminar contacto");
			System.out.println("");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Diga su número");
				numero = Leer.dato();
				System.out.println("Introduzca un nombre");
				nombre = Leer.dato();
				c = new Contacto(nombre);
				a.agregarConTacto(c, numero);
				break;
			case 2:
				System.out.println("Busca el nombre de la persona");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
