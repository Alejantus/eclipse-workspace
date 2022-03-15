package ejercicio4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Agenda {
	
	private Map <Contacto, String> lista;

	public Agenda(Map<Contacto, String> lista) {
		super();
		this.lista = lista;
	}

	public Agenda() {
		super();
		this.lista = new HashMap<Contacto, String>();;
	}

	public Map<Contacto, String> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}
	
	public void agregarConTacto(Contacto c, String s) {
		lista.put(c, s);
	}
	
	public Contacto buscarPorNombre(String nombre) {
		Contacto c;
		Iterator<Contacto> it = lista.keySet().iterator();
		boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			c=it.next();
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				encontrado=true;
				return c;
			}
		}
		return null;
	}
	
	public boolean quitarContacto(String nombre) {
		Contacto c = buscarPorNombre(nombre);
		if(c!=null) {
			lista.remove(c);
			return true;
		}
		return false;
	}
	
	
	public boolean modificarContacto(String nombre) {
		Contacto c = buscarPorNombre(nombre);
		if(c!=null) {
			c.setNombre(nombre);
			return true;
		}
		return false;
	}
	
	public void mostrarConfirmacionEliminar(boolean b) {
		if(b) {
			System.out.println("Eliminado");
		}else {
			System.out.println("No se pudo eliminar");
		}
	}
	
	

}
