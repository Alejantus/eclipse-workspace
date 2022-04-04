package ejercicio3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0,hora=0,min=0,seg=0,opcion2=0,genero=0;
		String nombreCancion = "",nombreAutor = "";
		LocalTime duracion;
		
		List<Cancion> lista = new ArrayList<Cancion>();
		
		PlayList p = new PlayList(lista);
		
		
		System.out.println("Bienvenido a tu reproductor de confianza");
		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Añadir una canción");
			System.out.println("2. Mostrar lista");
			System.out.println("3. Eliminar una canción");
			System.out.println("4. Buscar por nombre de la canción");
			System.out.println("5. Buscar canciones por nombre de autor");
			System.out.println("6. Buscar canciones por género");
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre de la canción");
				nombreCancion = Leer.dato();
				System.out.println("Introduzca el nombre del autor");
				nombreAutor = Leer.dato();
				System.out.println("Introduzca las hora, los minutos y los segundos de la canción");
				hora = Leer.datoInt();
				min = Leer.datoInt();
				seg = Leer.datoInt();
				duracion = LocalTime.of(hora, min, seg);
				System.out.println("Indique a que género pertenece");
				System.out.println("1. Pop");
				System.out.println("2. Rock");
				System.out.println("3. Disco");
				System.out.println("4. Heavy Metal");
				opcion2 = Leer.datoInt();
				switch (opcion2) {
				case 1:
					genero = 1;
					break;
				case 2:
					genero = 2;
					break;
				case 3:
					genero = 3;
					break;
				case 4:
					genero = 4;
					break;
				default:
					System.out.println("Género no encontrado");
					break;
				}
				p.agregarUnaCancion(new Cancion(nombreCancion, nombreAutor, genero, duracion));
				break;
			case 2:
				p.mostrarCanciones();
				break;
			case 3:
				System.out.println("Diga el nombre de la canción que quiere eliminar");
				nombreCancion = Leer.dato();
				p.eliminarUnaCancion(nombreCancion);
				break;
			case 4:
				System.out.println("Diga el nombre de la canción");
				nombreCancion = Leer.dato();
				p.buscarPorNombreCancion(nombreCancion);
				p.mostrarCanciones();
				break;
			case 5:
				System.out.println("Diga el nombre del autor");
				nombreAutor = Leer.dato();
				p.buscarPorNombreAutor(nombreAutor);
				p.mostrarCanciones();
				break;
			case 6:
				System.out.println("Diga el genero que quiere buscar");
				System.out.println("1. Pop");
				System.out.println("2. Rock");
				System.out.println("3. Disco");
				System.out.println("4. Heavy Metal");
				genero = Leer.datoInt();
				p.buscarPorGenero(genero);
				p.mostrarCanciones();
			default:
				System.out.println("Error, función no encontrada");
				break;
			}
		} while (opcion!=0);

	}

}
