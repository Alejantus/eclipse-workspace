package ejercicio4;

import java.util.HashMap;
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
	
	public void quitarContacto(Contacto c) {
		lista.remove(c);
	}
	
	

}
