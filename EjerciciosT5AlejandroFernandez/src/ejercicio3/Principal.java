package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		String nombre;
		
		
		GestionClase gc = new GestionClase();
		Alumno a;
		
		System.out.println("Bienvenido a nuestra lista de alumnos");
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Añadir un alumno");
			System.out.println("2. Mostrar alumnos");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego");
				break;
			case 1:
				System.out.println("Introduzca un nombre");
				nombre = Leer.dato();
				a = new Alumno(nombre);
				gc.agregarAlumno(a);
				break;
			case 2:
				gc.mostrarAlumno();
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != 0);
	}

}
