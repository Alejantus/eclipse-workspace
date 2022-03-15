package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionClub {

	private List<Socio>lista;

	public GestionClub(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public GestionClub() {
		super();
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionClub [lista=" + lista + "]";
	}
	
	
}
