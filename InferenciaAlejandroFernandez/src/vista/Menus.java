package vista;

import java.util.HashMap;
import java.util.Map;

import model.Empleados;
import model.Sector;

public class Menus {
	
	private Map<Empleados,Sector> lista = new HashMap<Empleados, Sector>();
	
	public void mostrarMenus() {
		System.out.println("\n¿Qué quieres hacer hoy?");
		System.out.println("1. Añadir un empleado");
		System.out.println("2. Mostrar empleados");
		System.out.println("3. Eliminar un empleado");
		System.out.println("4. Buscar un empleado");
		System.out.println("5. Ordenar por empleado");
		System.out.println("6. Ordenar por id");
		System.out.println("7. Ordernar por sector");
	}
	
	public void mostrarBienvenida() {
		System.out.println("\t\tBienvenido a Grupo MAS");
	}
	
	public void mostrarPorDefecto() {
		System.out.println("Opción incorrecta");
	}

}
