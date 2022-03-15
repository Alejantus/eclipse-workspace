package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Crear un programa para gestionar los socios de un club de Campo “de categoría”. Se debe poder 
		 guardar Socios con sus datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos. Usar 
		 la clase ArrayList. Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se 
		 podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc. (¡Para aburridos!). 
		 Debemos usar la clase Socio, la clase gestión Club y la principal como mínimo*/
		int opcion=0, cero=0, numSocio=0, posicion=0;
		String nombre = "", dni="";
		List<Socio> lista = new ArrayList<Socio>();
		GestionClub g = new GestionClub(lista);
		CrudSocio cs = new CrudSocio(lista);
		
		System.out.println("Bienvenido al club de campo");
		do {
			System.out.println("0. Salir");
			System.out.println("1. Guardar socio");
			System.out.println("2. Buscar socio");
			System.out.println("3. Mostrar datos");
			System.out.println("4. Modificar datos");
			System.out.println("5. Eliminar socio");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					break;
					
				case 1:
					System.out.println("Introduzca el número de socio");
					numSocio=Leer.datoInt();
					System.out.println("Introduzca el nombre del socio");
					nombre=Leer.dato();
					System.out.println("Introduzca el dni");
					dni=Leer.dato();
					Socio s = new Socio(dni,nombre,numSocio);
					cs.aniadirSocio(s);
					break;
					
				case 2:
					System.out.println("Introduzca el número de socio");
					numSocio=Leer.datoInt();
					System.out.println("Introduzca el nombre del socio");
					nombre=Leer.dato();
					System.out.println("Introduzca el dni");
					dni=Leer.dato();
					Socio s1 = new Socio(dni,nombre,numSocio);
					cs.imprimirBusqueda(cs.findSocio(s1));
					break;
					
					
				case 3:
					cs.mostrarDatos();
					break;
					
				case 4:
					System.out.println("Diga a qué usuario desea modificar su nombre");
					cs.mostrarDatos();
					posicion=Leer.datoInt();
					System.out.println("Diga el nuevo nombre");
					nombre=Leer.dato();
					cs.editNombre(nombre, lista.get(posicion-1));
					break;
					
				case 5:
					System.out.println("Diga que usuario desea eliminar");
					posicion=Leer.datoInt();
					cs.eliminarUsuario(posicion-1);
					break;
					
				default:
					System.out.println("Error. Introduzca un número entre 0 y 5");
					break;
			}
		}while(opcion!=cero);
		System.out.println("Gracias por usar la aplicación");
	}

}
