package controller;

import java.util.Comparator;

import model.Empleados;

public class CompararPorNombre implements Comparator<Empleados> {

	@Override
	public int compare(Empleados e1, Empleados e2) {
		
		String nombree1 = e1.getNombre();
		String nombree2 = e2.getNombre();
		
		return (nombree1.toLowerCase().compareTo(nombree2.toLowerCase()));
	}

}
