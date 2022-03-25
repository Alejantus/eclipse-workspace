package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		double cent=0.0;
		String nombre=null,nuevoMensaje=null;
		
		List<Mensaje> lista = new ArrayList<Mensaje>();
		
		lista.add(new Mensaje(1, "Alejandro", "Hola como estas"));
		lista.add(new Mensaje(3, "Pedro", "Como te encuentras"));
		lista.add(new Mensaje(2, "David", "Hasta luego"));
		lista.add(new Mensaje(4, "Arturo", "Como te va la vida"));
		lista.add(new Mensaje(6, "Luismi", "Como estas"));
		lista.add(new Mensaje(8, "Victor", "Hasta nunca"));
		lista.add(new Mensaje(7, "Mario", "Cuanto tiempo"));
		lista.add(new Mensaje(9, "Nicolas", "Hola y adios"));
		lista.add(new Mensaje(10, "Manolo", "Como te va la vida"));
		lista.add(new Mensaje(5, "Luismi", "Adios"));
		
		WhatsApp w = new WhatsApp(lista);
		
		System.out.println("Bienvenido a nuestro programa para gestionar mensajes de WhatsApp");
		do {
			System.out.println("\n¿Qué quieres hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Buscar por nombre");
			System.out.println("2. Ordenar por id");
			System.out.println("3. Ordenar por nombre");
			System.out.println("4. Borrar mensaje");
			System.out.println("5. Modificar mensaje");
			System.out.println("6. Mostrar lista");
			System.out.println("7. Calcular mensajes contacto");
			op = Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Diga el nombre de la persona que quiere buscar");
				nombre = Leer.dato();
				System.out.println(w.buscarPorNombre(nombre));
				break;
			case 2:
				w.ordenarNatural();
				w.mostrarLista(lista);
				break;
			case 3:
				w.ordenarNoNatural();
				w.mostrarLista(lista);
				break;
			case 4:
				System.out.println("Diga el nombre del contacto");
				nombre = Leer.dato();
				w.borrarMensaje(nombre);
				w.mostrarLista(lista);
				break;
			case 5:
				System.out.println("Diga el nombre del contacto");
				nombre = Leer.dato();
				System.out.println("Diga el nuevo mensaje");
				nuevoMensaje = Leer.dato();
				w.modificarMensaje(nombre, nuevoMensaje);
			case 6:
				w.mostrarLista(lista);
				break;
			case 7:
				System.out.println("Diga el nombre del contacto");
				nombre = Leer.dato();
				System.out.println("Diga cuántos céntimos va a cobrar");
				cent = Leer.datoDouble();
				w.calcularMensaje(cent, nombre);
				System.out.printf("%.2f €",w.calcularMensaje(cent, nombre));
				break;
			default:
				System.out.println("Opción incorrecta, por favor elija otra opción");
				break;
			}
		} while (op!=0);

	}

}
