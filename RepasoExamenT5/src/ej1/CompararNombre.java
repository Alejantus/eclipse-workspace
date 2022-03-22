package ej1;

import java.util.Comparator;

public class CompararNombre implements Comparator<Habitacion> {

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
			String nombreh1 = h1.getNombre();
			String nombreh2 = h2.getNombre();
		
		return (nombreh1.toLowerCase().compareTo(nombreh2.toLowerCase()));
	}

}
