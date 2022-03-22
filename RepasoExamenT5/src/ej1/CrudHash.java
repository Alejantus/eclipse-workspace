package ej1;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CrudHash {
	
	Map<Habitacion,Integer> lista;

	public CrudHash(Map<Habitacion, Integer> lista) {
		super();
		this.lista = lista;
	}

	public Map<Habitacion, Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Habitacion, Integer> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudHash [lista=" + lista + "]";
	}
	
	public void agregarHabitacion(Habitacion h, int numHab) {
		lista.put(h, numHab);
	}
	
	public Habitacion buscarHabitacion(double precioBase) {
		boolean salir = false;
		Habitacion h = null;
		Iterator<Habitacion> it = lista.keySet().iterator();
		while(it.hasNext() && !salir) {
			h = it.next();
			if(h.getPrecioBase()==precioBase) {
				salir = true;				
			}
		}
		if(!salir) {
			h = null;
		}
		return h;
	}
	
	public void eliminarHabitacion(double precioBase) {
		Habitacion h = buscarHabitacion(precioBase);
		if(h!=null) {
			lista.remove(h);
		}
	}
	
	public void modificarHabitacion(double precioBase,String nombre) {
		Habitacion h = buscarHabitacion(precioBase);
		if(h!=null) {
			h.setNombre(nombre);
		}
	}
	
	public void mostrarHabitaciones(Map<Habitacion,Integer> lista3) {
		for (Habitacion h : lista.keySet()) {
			System.out.println("*******************************");
			System.out.println("Precio : " + h.getPrecioBase());
			System.out.println("Nombre : " + h.getNombre());
			System.out.println("Ocupado : " + h.isOcupacion());
			System.out.println("Dias : " + h.getDias());
			System.out.println("Ocupacion : " + h.getNumOcupantes());
			System.out.println("*******************************\n");
		}
	}
	public void mostrarHabitacionesOrdenado(Map<Habitacion,Integer>lista3) {
		SortedMap<Habitacion, Integer> ordenado3 = new TreeMap<Habitacion, Integer>(lista3);
		for(Habitacion h : ordenado3.keySet()) {
			System.out.println("*******************************");
			System.out.println("Precio : " + h.getPrecioBase());
			System.out.println("Nombre : " + h.getNombre());
			System.out.println("Ocupado : " + h.isOcupacion());
			System.out.println("Dias : " + h.getDias());
			System.out.println("Ocupacion : " + h.getNumOcupantes());
			System.out.println("*******************************\n");
		}
	}
	
	public void mostrarHabitacionesOrdenadoNombre(Map<Habitacion,Integer>lista3) {
		SortedMap<Habitacion, Integer> ordenado3 = new TreeMap<Habitacion, Integer>(new CompararNombre());
		ordenado3.putAll(lista3);
		for(Habitacion h : ordenado3.keySet()) {
			System.out.println("*******************************");
			System.out.println("Precio : " + h.getPrecioBase());
			System.out.println("Nombre : " + h.getNombre());
			System.out.println("Ocupado : " + h.isOcupacion());
			System.out.println("Dias : " + h.getDias());
			System.out.println("Ocupacion : " + h.getNumOcupantes());
			System.out.println("*******************************\n");
		}
	}
	
	public void mostrarConfirmacionCreacion(boolean b) {
		if (b) {
			System.out.println("Se ha agregado una habitacion");
		}else {
			System.out.println("No se ha creado una habitacion");
		}
	}
	
	public void mostrarConfirmacionEliminacion(boolean b) {
		if (b) {
			System.out.println("Se ha eliminado una habitacion");
		}else {
			System.out.println("No se ha eliminado una habitacion");
		}
	}
	
	public void mostrarconfirmacionModificacion(boolean b) {
		if (b) {
			System.out.println("Se ha modificado una habitacion");
		}else {
			System.out.println("No se ha modificado una habitacion");
		}
	}

}
