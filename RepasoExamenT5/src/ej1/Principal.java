package ej1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		double precioBase=0.0;
		
		
		List<Habitacion> lista1 = new ArrayList<Habitacion>();
		Set<Habitacion> lista2 = new HashSet<Habitacion>();
		Map<Habitacion, Integer> lista3 = new HashMap<Habitacion, Integer>();
		
		CrudLista cl = new CrudLista(lista1);
		CrudSet cs = new CrudSet(lista2);
		CrudHash ch = new CrudHash(lista3);
		
		lista1.add(new Habitacion(16.3, true, "Jose Luis", 5, 1));
		lista1.add(new Habitacion(15.5, false, "Ángel", 7, 2));
		lista1.add(new Habitacion(20.0, true, "Manolo", 15, 4));


		lista2.add(new Habitacion(10.4, false, "Alejandro", 5, 1));
		lista2.add(new Habitacion(18.4, false, "David", 2, 2));
		lista2.add(new Habitacion(15.5, true, "Victor", 4, 3));
		
		lista3.put(new Habitacion(12.3, true, "Pedro", 5, 1),101);
		lista3.put(new Habitacion(100.7, false, "Alvaro", 8, 4),102);
		lista3.put(new Habitacion(189.2, true, "Nicolas", 9, 2),103);
		
		
		System.out.println("Bienvenido a nuestro programa");
		do {
			System.out.println("¿Qué acción quieres hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Mostrar lista List");
			System.out.println("2. Mostrar lista Set");
			System.out.println("3. Mostrar lista Hash");
			System.out.println("4. Ordenar lista List");
			System.out.println("5. Ordenar lista Set");
			System.out.println("6. Ordenar lista Hash");
			System.out.println("7. Buscar lista List");
			System.out.println("8. Buscar lista Set");
			System.out.println("9. Buscar lista Hash");
			System.out.println("10. Ordenar por nombre List");
			System.out.println("11. Ordenar por nombre Set");
			System.out.println("12. Ordenar por nombre Hash");
			op = Leer.datoInt();
			switch (op) {
			case 0:
				System.out.println("Hasta luego");
				break;
			case 1:
				cl.mostrarHabitaciones();
				break;
			case 2:
				cs.mostrarHabitaciones();
				break;
			case 3:
				ch.mostrarHabitaciones(lista3);
				break;
			case 4:
				Collections.sort(lista1);
				cl.mostrarHabitaciones();
				break;
			case 5:
				//cs.mostrarHabitacionesOrdenado(lista2);
				cs.ordenado();
				cs.mostrarHabitaciones();
				break;
			case 6:
				ch.mostrarHabitaciones(lista3);
				break;
			case 7:
				System.out.println("Diga un precioBase");
				precioBase = Leer.datoDouble();
				cl.mostrarUnaHabitacion(precioBase);
				break;
			case 8:
				System.out.println("Diga un precioBase");
				precioBase = Leer.datoDouble();
				cs.mostarUnaHabitacion(precioBase);
				break;
			case 9:
				System.out.println("Diga un precioBase");
				precioBase = Leer.datoDouble();
				ch.buscarHabitacion(precioBase);
				ch.mostrarHabitaciones(lista3);
				break;
			case 10:
				Collections.sort(lista1,new CompararNombre());
				cl.mostrarHabitaciones();
				break;
			case 11:
				cs.mostrarHabitacionesOrdenadoNombre(lista2);
				break;
			case 12:
				ch.mostrarHabitacionesOrdenadoNombre(lista3);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (op!=0);
	}

}
