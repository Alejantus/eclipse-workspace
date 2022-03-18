package ejercicio6;

import java.util.Comparator;

public class CompararNombre implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		
		String nombret1 = t1.getNombre();
		String nombret2 = t2.getNombre();
		
		return (nombret1.toLowerCase().compareTo(nombret2.toLowerCase()));
	}

}
