package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
	
	private List<Alumno> lista = new ArrayList<Alumno>();

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}
	
	

}
