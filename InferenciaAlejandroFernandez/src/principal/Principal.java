package principal;

import java.util.HashSet;

import crud.CrudEmpleado;
import lectura.Leer;
import model.Empleados;
import vista.Menus;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var opcion = 0;
		var id = 0;
		var nombre = "";
		var apellidos = "";
		var nombreSector = "";
		var nuevoNombre = "";
		var horasTrabajadas = 0;
		var sueldo = 0.0D;

		var m = new Menus();

		var lista = new HashSet<Empleados>();
		
		lista.add(new Empleados(1, "Alejandro", "Fdez", "Info",15));
		lista.add(new Empleados(2, "Jose Luis", "Fdez", "Info",48));
		lista.add(new Empleados(3, "Beatriz", "Gomez", "Seg",40));
		
		var cd = new CrudEmpleado(lista);
		
		m.mostrarBienvenida();

		do {
			m.mostrarMenus();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el id de un empleado");
				id = Leer.datoInt();
				System.out.println("Introduzca el nombre del empleado");
				nombre = Leer.dato();
				System.out.println("Introduzca los apellidos del empleado");
				apellidos = Leer.dato();
				System.out.println("Introduzca el sector que pertenece el empleado");
				nombreSector = Leer.dato();
				System.out.println("Introduza cuantas horas ha trabajado el empleado");
				horasTrabajadas = Leer.datoInt();
				lista.add(new Empleados(id, nombre, apellidos, nombreSector,horasTrabajadas));
				break;
			case 2:
				m.mostrarLista(lista);
				break;
			case 3:
				System.out.println("Introduzca el id de un empleado para poder eleminarlo");
				id = Leer.datoInt();
				cd.eliminarEmpleado(id);
				break;
			case 4:
				System.out.println("Introduzca el id de un empleado para poder buscarlo");
				id = Leer.datoInt();
				cd.buscarEmpleadoPorId(id);
				break;
			case 5:
				System.out.println("Introduzca el id de un empleado para poder modificarlo");
				id = Leer.datoInt();
				System.out.println("Introduzca el nuevo nombre");
				nuevoNombre = Leer.dato();
				cd.modificarEmpleado(id, nuevoNombre);
				break;
			case 6:
				cd.ordenarPorId();
				break;
			case 7:
				cd.ordenarPorNombre();
				break;
			case 8:
				cd.ordenarPorHoras();
				break;
			case 9:
				System.out.println("Diga el nombre del empleado");
				id = Leer.datoInt();
				System.out.println("Diga cuanto es el sueldo del empleado");
				sueldo = Leer.datoDouble();
				cd.calcularSueldo(sueldo, id);
				break;
			default:
				m.mostrarPorDefecto();
				break;
			}

		} while (opcion != 0);

	}

}
