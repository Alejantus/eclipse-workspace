package ej1;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CrudSet {
	
	Set<Habitacion> lista;

	public CrudSet(Set<Habitacion> lista) {
		super();
		this.lista = lista;
	}

	public Set<Habitacion> getLista() {
		return lista;
	}

	public void setLista(Set<Habitacion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudSet []";
	}
	
	public void agregarHabitacion(Habitacion h) {
		lista.add(h);
	}
	
	public Habitacion buscarHabitacion(double precioBase) {
		Habitacion h = null;
		boolean salir = false;
		Iterator<Habitacion> it = lista.iterator();
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
	
	public boolean eliminarHabitacion(double precioBase) {
		Habitacion h = buscarHabitacion(precioBase);
		if (h!=null) {
			lista.remove(h);
			return true;
		}
		return false;
	}
	
	public boolean modificarHabitacion(double precioBase,String nombre) {
		Habitacion h = buscarHabitacion(precioBase);
		if (h!=null) {
			h.setNombre(nombre);
			return true;
		}
		return false;
	}
	
	public void mostrarHabitaciones() {
		for (Habitacion h : lista) {
			System.out.println("*******************************");
			System.out.println("Precio : " + h.getPrecioBase());
			System.out.println("Nombre : " + h.getNombre());
			System.out.println("Ocupado : " + h.isOcupacion());
			System.out.println("Dias : " + h.getDias());
			System.out.println("Ocupacion : " + h.getNumOcupantes());
			System.out.println("*******************************\n");
		}
	}
	/*
	public void mostrarHabitacionesOrdenado(Set<Habitacion>lista2) {
		SortedSet<Habitacion> ordenado2 = new TreeSet<Habitacion>(lista2);
		for(Habitacion h : ordenado2) {
			System.out.println("*******************************");
			System.out.println("Precio : " + h.getPrecioBase());
			System.out.println("Nombre : " + h.getNombre());
			System.out.println("Ocupado : " + h.isOcupacion());
			System.out.println("Dias : " + h.getDias());
			System.out.println("Ocupacion : " + h.getNumOcupantes());
			System.out.println("*******************************\n");
		}
	}*/
	
	public SortedSet<Habitacion> ordenado(){
		SortedSet<Habitacion> ordenado = new TreeSet<Habitacion>(lista);
		return ordenado;
	}
	
	public void mostrarHabitacionesOrdenadoNombre(Set<Habitacion>lista2) {
		SortedSet<Habitacion> ordenado2 = new TreeSet<Habitacion>(new CompararNombre());
		ordenado2.addAll(lista2);
		for(Habitacion h : ordenado2) {
			System.out.println("*******************************");
			System.out.println("Precio : " + h.getPrecioBase());
			System.out.println("Nombre : " + h.getNombre());
			System.out.println("Ocupado : " + h.isOcupacion());
			System.out.println("Dias : " + h.getDias());
			System.out.println("Ocupacion : " + h.getNumOcupantes());
			System.out.println("*******************************\n");
		}
	}
	
	public void mostarUnaHabitacion(double precioBase) {
		Habitacion h = buscarHabitacion(precioBase);
		
		System.out.println("*******************************");
		System.out.println("Precio : " + h.getPrecioBase());
		System.out.println("Nombre : " + h.getNombre());
		System.out.println("Ocupado : " + h.isOcupacion());
		System.out.println("Dias : " + h.getDias());
		System.out.println("Ocupacion : " + h.getNumOcupantes());
		System.out.println("*******************************\n");

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
