package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Club {
	
	private int id;
	private List<Socio> lista;
	
	public Club(int id, List<Socio> lista) {
		super();
		this.id = id;
		this.lista = new ArrayList<Socio>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", lista=" + lista + "]";
	}
	
	public void agregarSocio(Socio s) {
		lista.add(s);
	}
	
	public void quitarSocio(int idSocio) {
		if (lista.isEmpty() && lista.get(idSocio-1) != null) {
			lista.remove(idSocio-1);
		}
	}
	
	public void modificarSocio(int idSocio) {
	
	}
}
