package controller;

import java.util.Comparator;

import model.Empleados;

public class CompararPorHoras implements Comparator<Empleados>{
	
	
	/*
	 * Reescribiendo el método compare de la interface Comparator
	 * haciendo que compare dos valores de la clase Empleados
	 * en este caso son las horas de un empleado ordenandolas 
	 * de menor a mayor, si hay algún caso en el que dos empleados 
	 * tengan las mismas horas que lo compare por el nombre de A a Z.
	 */
	@Override
	public int compare(Empleados e1, Empleados e2) {
		if(e1.getHorasTrabajadas() < e2.getHorasTrabajadas()) {
			return -1;
		}else if(e1.getHorasTrabajadas() == e2.getHorasTrabajadas()) {
			return (e1.getNombre().toLowerCase().compareTo(e2.getNombre().toLowerCase()));
		}
		return 0;
	}

}
