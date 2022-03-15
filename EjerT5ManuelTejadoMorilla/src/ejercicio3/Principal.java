package ejercicio3;

import java.util.HashSet;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que guarde los nombres de los alumnos de la clase. Se deben poder mostrar, 
		modificar y borrar los que se quiera de forma individual, es decir, el usuario debe decir quién quiere 
		mostrar, modificar o borrar. Se puede crear otra clase con funcionalidades como sacar nota media del 
		curso, dar el número de suspensos en total, media de suspensos, etc. Usa la interfaz Set implementada 
		por hashset.*/
		String nombre="";
		int opcion=0, cero=0;
		Set <Alumno> lista = new HashSet<Alumno>();
		CrudAlumno ca;
		
		System.out.println("Bienvenido al programa que gestiona las notas de los alumnos de una clase");
		do {
			System.out.println("0. Salir");
			System.out.println("1. Añadir alumno");
			System.out.println("2. Mostrar un alumno");
			System.out.println("3. Modificar un alumno");
			System.out.println("4. Borrar un alumno");
			System.out.println("5. Sacar nota media del curso");
			System.out.println("6. Dar el número de suspensos en total");
			System.out.println("7. Calcular la media de suspensos");
			
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					break;
						
				case 1:
					System.out.println("Diga el nombre del alumno");
					nombre=Leer.dato();
					//Alumno a = new Alumno(nombre);
					//lista.add(a);
					
					break;
					
				case 2:
					ca=new CrudAlumno(lista);
					ca.mostrarAlumnos();
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
					
				default:
						System.out.println("Error. Introduzca un número entre 0 y 6");
				
			}
		}while(opcion!=cero);
		
	}

}
