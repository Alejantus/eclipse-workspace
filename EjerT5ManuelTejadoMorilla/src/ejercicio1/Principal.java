package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1) Realizar un programa que permita gestionar notas de texto (como las de un
		 * móvil, no son calificaciones de clase). Usaremos la clase ArrayList y el
		 * listado debe guardar objetos tipo Nota (tú decides las características que
		 * debe tener una nota). Debe permitir almacenar un número infinito de notas
		 * (significa que se deben usar colecciones), se podrán mostrar de manera
		 * individual (mostrar una nota buscándola), dar información del número de notas
		 * guardadas, agregar una nueva nota, un método que borre una de las notas
		 * guardadas comprobando antes que la lista no está vacía. Se borrará por número
		 * (la nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con
		 * todas las notas (en un método) y su número correspondiente, el usuario
		 * introducirá el número de la que quiera borrar. Realmente, esto se debe hacer
		 * buscando la nota, pero al ser el primer ejercicio, no es necesario hacer los
		 * métodos buscar.
		 */
		int id=0;
		List<Nota>lista=new ArrayList<Nota>();
		Agenda a = new Agenda(1, lista);
		
		a.addNotas(new Nota(1, "Carrefour", "Hacer reclamación", true));
		a.addNotas(new Nota(2, "Mercadona", "Hacer reclamación", true));
		a.addNotas(new Nota(3, "Cita dentista", "Hacer reclamación", true));
		a.mostrarLista();
		
		System.out.println("Indique cual quiere borrar");
		id=Leer.datoInt();
		
		a.borrarComprobar(id-1);
		a.mostrarLista();
		
		
		
	}

}
