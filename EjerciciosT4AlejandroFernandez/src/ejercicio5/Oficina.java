package ejercicio5;

import java.util.Arrays;

public class Oficina {
	
	private Empleado lista[];

	
	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularSueldoUnEmpleado(int numE,double porc) {
		double sueldo=0.0;
		for (int i = 0; i < lista.length; i++) {
			sueldo = lista[numE-1].calcularSueldo(porc);
			
		}
		return sueldo;
	}
	
	public double calcularEurosGastado(int tam) {
		double sueldo=0.0;
		for (int i = 0; i < lista.length; i++) {
			sueldo+=lista[i].getSueldoBase();
		}
		
		sueldo=sueldo/(double)tam;
		
		return sueldo;
	}
	/*
	public String felicitarEmpleado(int numE) {
		if(lista[numE-1] instanceof EmpleadoAComision) {
			if(lista[numE-i])
		}
	}*/
}
