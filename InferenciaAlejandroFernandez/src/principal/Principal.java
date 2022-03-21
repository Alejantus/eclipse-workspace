package principal;

import java.util.Collections;
import java.util.HashMap;

import controller.CompararPorNombre;
import crud.CrudEmpleado;
import lectura.Leer;
import model.Empleados;
import model.Sector;
import vista.Menus;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var opcion = 0;
		var id = "";
		var nombre = "";
		var apellidos = "";
		var nombreSector = "";
		var idNuevo = "";
		var b = false;
		
		var m = new Menus();
		
		var lista = new HashMap<Empleados, Sector>();
		
		var cd = new CrudEmpleado(lista);
		
		m.mostrarBienvenida();
		
		do {
		m.mostrarMenus();
		opcion = Leer.datoInt();		
		switch (opcion) {
		case 1:
			System.out.println("Introduzca el id de un empleado");
			id = Leer.dato();
			System.out.println("Introduzca el nombre del empleado");
			nombre = Leer.dato();
			System.out.println("Introduzca los apellidos del empleado");
			apellidos = Leer.dato();
			System.out.println("Introduzca el sector que pertenece el empleado");
			nombreSector = Leer.dato();
			lista.put(new Empleados(id,nombre,apellidos), new Sector(nombreSector));
			break;
		case 2 :
			break;
		case 3:
			System.out.println("Introduzca el dni de un empleado para poder eleminarlo");
			idNuevo = Leer.dato();
			cd.eliminarEmpleado(idNuevo);
			cd.mostrarConfirmacionEliminar(b);
			break;
		case 4:
			System.out.println("Introduzca el dni de un empleado para poder buscarlo");
			idNuevo = Leer.dato();
			cd.buscarEmpleadoPorId(idNuevo);
			break;
		case 5:
			
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			m.mostrarPorDefecto();
			break;
		}
		
		}while (opcion!=0);

	}

}
