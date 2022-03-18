package ejercicio6;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		String dni,nombre,dniBuscar,nombreNuevo;
		int horasTrabajadas = 0;
		double sueldoFinal = 0.0;
		boolean b = false;
		
		List<Trabajador> lista = new ArrayList<Trabajador>();
		
		Empresa e = new Empresa(lista);
		
		System.out.println("\t\tBienvenido a nuestro programa");
		
		do {
			System.out.println("\n¿Qué quieres hacer?");
			System.out.println("1. Añadir un trabajador");
			System.out.println("2. Buscar un trabajador");
			System.out.println("3. Eliminar un trabajador");
			System.out.println("4. Modificar un trabajador");
			System.out.println("5. Mostrar lista de los trabajadores");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca un dni");
				dni = Leer.dato();
				System.out.println("Introduzca un nombre");
				nombre = Leer.dato();
				System.out.println("Introduzca el número de horas trabajadas");
				horasTrabajadas = Leer.datoInt();
				System.out.println("Introduzca el sueldo que cobra el empleado");
				sueldoFinal = Leer.datoDouble();
				e.agregarTrabajador(new Trabajador(dni,nombre,horasTrabajadas,sueldoFinal));
				break;
			case 2:
				System.out.println("Introduzca el dni del empleado que quiere buscar");
				dniBuscar = Leer.dato();
				e.buscarPorDni(dniBuscar);
				break;
			case 3:
				System.out.println("Introduzca el dni del empleado que quiere eliminar");
				dniBuscar = Leer.dato();
				e.eliminarTrabajador(dniBuscar);
				e.mensajeEliminacion(b);
				break;
				
			case 4:
				System.out.println("Introduzca el dni del empleado que quiere modificar");
				dniBuscar = Leer.dato();
				System.out.println("Y el nuvo nombre del empleado");
				nombreNuevo = Leer.dato();
				e.modificarTrabajador(dniBuscar, nombreNuevo);
				break;

			case 5:
				e.mostrarTrabajadores();
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
