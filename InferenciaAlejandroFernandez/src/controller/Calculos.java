package controller;

import java.util.HashSet;
import java.util.Set;

import crud.CrudEmpleado;
import model.Empleados;

public class Calculos {
	
	Set<Empleados> lista = new HashSet<Empleados>();
	CrudEmpleado cd = new CrudEmpleado(lista);
	
	/*
	 * Un método para poder calcular el sueldo de un empleado
	 * pasándole el id de un empleado para poder asi obtener las horas
	 * de un empleado.
	 */
	public double calcularSueldo(double sueldo,int id) {
		Empleados e = cd.buscarEmpleadoPorId(id);
		
		return sueldo * e.getHorasTrabajadas();
	}

}
