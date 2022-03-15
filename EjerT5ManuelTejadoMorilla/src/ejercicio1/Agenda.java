package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private int idAgenda;
	private List <Nota> lista;
	
	public Agenda(int idAgenda, List<Nota> lista) {
		super();
		this.idAgenda = idAgenda;
		this.lista = lista;
	}
	
	public Agenda(int idAgenda) {
		super();
		this.idAgenda = idAgenda;
		this.lista = new ArrayList<Nota>();
	}

	public Agenda() {
		super();
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [idAgenda=" + idAgenda + ", lista=" + lista + "]";
	}

	public void mostrarLista() {
		for (Nota nota : lista) {
			System.out.println(nota);
		}
	}
	
	public void addNotas(Nota e) {
		lista.add(e);
	}
	
	public void borrarComprobar(int id) {//para comprobar usar el .isEmpty
		if(lista == null || lista.size() == 0)
		{
		  
		}
		else{
			lista.remove(id);
		}
	}
	
	public void eliminarNota(int numNota, int eleccion) { //del compañero
		if(!lista.isEmpty() && lista.get(numNota-1) != null) {
			lista.remove(numNota-1);
		}
	}
	
	public void mostrarLongitud() {
		lista.size();
	}
	
}
