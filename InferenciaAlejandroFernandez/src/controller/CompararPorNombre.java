package controller;

import java.util.Comparator;

import model.Empleados;

public class CompararPorNombre implements Comparator<Empleados> {

	/*
	 * Reescribiendo el método compare de la interface Comparator
	 * haciendo que compare dos valores de la clase Empleados
	 * en este caso son los nombres de los empleados de esta forma 
	 * lo que queremos hacer es ordenar los empleados de A a Z.
	 */
	@Override
	public int compare(Empleados e1, Empleados e2) {
		
		String nombree1 = e1.getNombre();
		String nombree2 = e2.getNombre();
		
		return (nombree1.toLowerCase().compareTo(nombree2.toLowerCase()));
	}

}
