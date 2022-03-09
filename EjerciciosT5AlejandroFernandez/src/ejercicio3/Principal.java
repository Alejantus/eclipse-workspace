package ejercicio3;

import java.util.HashSet;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Alumno> lista = new HashSet<Alumno>(); 
		lista.add(new Alumno(1,"Alejandro",0.0));
		
		
		int opcion=0,idAlumno=0;
		String nombre;
		double notaMedia=0.0;
		
		
		GestionClase gc = new GestionClase(lista);
		Alumno a;
		
		System.out.println("Bienvenido a nuestra lista de alumnos");
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Añadir un alumno");
			System.out.println("2. Mostrar alumnos");
			System.out.println("3. Eliminar alumno");
			System.out.println("4. Buscar alumno");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego");
				break;
			case 1:
				System.out.println("Introduzca un idAlumno");
				idAlumno = Leer.datoInt();
				System.out.println("Introduzca un nombre");
				nombre = Leer.dato();
				System.out.println("Introduzca una nota media");
				notaMedia = Leer.datoDouble();
				a = new Alumno(idAlumno, nombre, notaMedia);
				gc.agregarAlumno(a);
				break;
			case 2:
				gc.mostrarAlumno();
				break;
			case 3:
				System.out.println("Introduzca del Alumno");
				idAlumno = Leer.datoInt();
				gc.quitarAlumno(idAlumno);
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != 0);
	}

}
