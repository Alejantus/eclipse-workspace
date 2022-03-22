package ej1;

import java.util.Iterator;
import java.util.List;

public class CrudLista {

	private List<Habitacion> lista;

	public CrudLista(List<Habitacion> lista) {
		super();
		this.lista = lista;
	}

	public List<Habitacion> getLista() {
		return lista;
	}

	public void setLista(List<Habitacion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudLista [lista=" + lista + "]";
	}

	public boolean agregarHabitacion(Habitacion h) {
		return lista.add(h);
	}

	public Habitacion buscarHabitacion(double precioBase) {
		boolean salir = false;
		Habitacion h = null;
		Iterator<Habitacion> it = lista.iterator();
		while(it.hasNext() && !salir) {
			h = it.next();
			if (h.getPrecioBase()==(precioBase)) {
				salir = true;
			}
		}
		if(!salir) {
			h = null;
		}
		return h;
	}

	public boolean eliminarHabitacion(double precioBase) {
		Habitacion habitacion = buscarHabitacion(precioBase);
		if (habitacion!=null) {
			lista.remove(habitacion);
			return true;
		}
		return false;
	}

	public boolean modificarHabitacion(double precioBase, String nombreNuevo) {
		Habitacion habitacion = buscarHabitacion(precioBase);
		if (habitacion != null) {
			habitacion.setNombre(nombreNuevo);
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
	
	public void mostrarUnaHabitacion(double precioBase) {
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
