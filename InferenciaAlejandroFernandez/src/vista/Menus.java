package vista;

import java.util.HashSet;
import java.util.Set;

import model.Empleados;

public class Menus {
	
	private Set<Empleados> lista = new HashSet<Empleados>();
	
	public void mostrarMenus() {
		System.out.println("\n¿Qué quieres hacer hoy?");
		System.out.println("1. Añadir un empleado");
		System.out.println("2. Mostrar empleados");
		System.out.println("3. Eliminar un empleado");
		System.out.println("4. Buscar un empleado");
		System.out.println("5. Modificar un empleado");
		System.out.println("6. Ordenar por empleado");
		System.out.println("7. Ordenar por id");
		System.out.println("8. Ordernar por sector");
		System.out.println("9. Calcular sueldo");
	}
	
	public void mostrarBienvenida() {
		System.out.println("\t\tBienvenido a Grupo MAS");
	}
	
	public void mostrarPorDefecto() {
		System.out.println("Opción incorrecta, introduzca otra opción por favor");
	}
	
	public void mostrarLista(Set<Empleados> lista) {
		for(Empleados e : lista) {
			System.out.println("***********************************");
			System.out.printf("Id : %d\n",e.getId());
			System.out.printf("Nombre : %s\n",e.getNombre());
			System.out.printf("Apellidos : %s\n",e.getApellido());
			System.out.printf("Sector : %s\n",e.getNombreSector());
			System.out.printf("Horas : %d\n",e.getHorasTrabajadas());
			System.out.println("***********************************\n");
		}
	}

}
