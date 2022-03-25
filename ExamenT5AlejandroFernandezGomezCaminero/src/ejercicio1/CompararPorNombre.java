package ejercicio1;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Mensaje> {

	@Override
	public int compare(Mensaje m1, Mensaje m2) {
		
		String nombrem1 = m1.getNombreContacto();
		String nombrem2 = m2.getNombreContacto();
		
		return (nombrem1.toLowerCase().compareTo(nombrem2.toLowerCase()));
		
	}

}
