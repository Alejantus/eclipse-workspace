package ejercicio1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WhatsApp {
	
	private List<Mensaje> lista;

	public WhatsApp(List<Mensaje> lista) {
		super();
		this.lista = lista;
	}

	public List<Mensaje> getLista() {
		return lista;
	}

	public void setLista(List<Mensaje> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "WhatsApp [lista=" + lista + "]";
	}
	
	//Métodos
	
	public Mensaje buscarPorNombre(String nombre) {
		boolean salir = false;
		Mensaje m = null;
		Iterator<Mensaje> it = lista.iterator();
		while(it.hasNext() && !salir) {
			m = it.next();
			if(m.getNombreContacto().equalsIgnoreCase(nombre)) {
				salir = true;
			}
		}
		if(!salir) {
			m = null;
		}
		return m;
	}	
	
	public void borrarMensaje(String nombre) {
		Mensaje m = buscarPorNombre(nombre);
		
		lista.remove(m);
	}
	
	public void modificarMensaje(String nombre, String nuevoMensaje) {
		Mensaje m = buscarPorNombre(nombre);
		
		m.setTextoMensaje(nuevoMensaje);
	}
	
	public List<Mensaje> ordenarNatural(){
		Collections.sort(lista);
		return lista;
	}
	
	public List<Mensaje> ordenarNoNatural(){
		Collections.sort(lista, new CompararPorNombre());
		return lista;
	}
	
	public void mostrarLista(List<Mensaje> lista) {
		for(Mensaje m : lista) {
			System.out.println("*************************");
			System.out.printf("ID : %d\n",m.getId());
			System.out.printf("Nombre : %s\n",m.getNombreContacto());
			System.out.printf("Mensaje : %s\n",m.getTextoMensaje());
			System.out.println("*************************");
		}
	}
	
	public double calcularMensaje(double cent,String nombre) {
		Mensaje m = buscarPorNombre(nombre);
		return cent * (int)m.getId();
	}

}
