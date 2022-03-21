package ej1;

import java.util.Iterator;
import java.util.Map;

public class CrudHash {
	
	Map<Integer,Habitacion> lista;

	public CrudHash(Map<Integer, Habitacion> lista) {
		super();
		this.lista = lista;
	}

	public Map<Integer, Habitacion> getLista() {
		return lista;
	}

	public void setLista(Map<Integer, Habitacion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudHash [lista=" + lista + "]";
	}
	
	public void agregarHabitacion(Habitacion h, int numHab) {
		lista.put(numHab, h);
	}
	
	public void buscarHabitacion(double precioBase) {
		boolean salir = false;
		Integer h = null;
		Iterator<Integer> it = lista.keySet().iterator();
		while(it.hasNext() && !salir) {
			h = it.next();
		}
	}

}
