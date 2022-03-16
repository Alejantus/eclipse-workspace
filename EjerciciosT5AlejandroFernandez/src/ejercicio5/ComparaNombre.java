package ejercicio5;

import java.util.Comparator;

public class ComparaNombre implements Comparator <Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {		
		return (p1.getNombre().toLowerCase().compareTo(p2.getNombre().toLowerCase()));
	}

}
