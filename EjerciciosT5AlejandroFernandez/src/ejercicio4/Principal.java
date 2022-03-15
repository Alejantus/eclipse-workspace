package ejercicio4;

import java.util.HashMap;
import java.util.Map;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String nombre,nombre2,numero;
		boolean b = false;
		
		Map<Contacto,String> lista = new HashMap<Contacto, String>();
		Agenda a = new Agenda(lista);
		
		a.agregarConTacto(new Contacto("Ale"), "1");
		a.agregarConTacto(new Contacto("Ángel"), "2");
		a.agregarConTacto(new Contacto("Pedro"), "3");
		a.agregarConTacto(new Contacto("Manolo"), "4");
		a.agregarConTacto(new Contacto("Jose"), "5");
		
		System.out.println("Bienvenido a la agenda de tu teléfono");
		
		do {
			System.out.println("¿Qué quieres hacer el día de hoy?");
			System.out.println("1. Añadir un contacto");
			System.out.println("2. Buscar contacto por nombre");
			System.out.println("3. Eliminar contacto");
			System.out.println("4. Modificar un contacto");
			System.out.println("5. Mostrar todos los contactos");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Diga su número");
				numero = Leer.dato();
				System.out.println("Introduzca un nombre");
				nombre = Leer.dato();
				a.agregarConTacto(new Contacto(nombre),numero);
				break;
			case 2:
				System.out.println("Busca el nombre de la persona");
				nombre2 = Leer.dato();
				a.buscarPorNombre(nombre2);
				break;
			case 3:
				System.out.println("¿Qué contacto quieres eliminar?");
				nombre2 = Leer.dato();
				a.quitarContacto(nombre2);
				a.mostrarConfirmacionEliminar(b);
				break;
			case 4:
				System.out.println("¿Qué contacto quieres modificar?");
				nombre = Leer.dato();
				System.out.println("Diga el nuevo nombre");
				nombre2 = Leer.dato();
				a.modificarContacto(nombre,nombre2);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
