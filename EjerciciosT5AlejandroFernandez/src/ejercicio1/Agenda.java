package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private int idAgenda; 
	private List <Notas> lista;
	
	public Agenda(int idAgenda, List<Notas> lista) {
		super();
		this.idAgenda = idAgenda;
		this.lista = lista;
	}
	
	public Agenda() {
		super();
		this.lista = new ArrayList<Notas>();
	}
	
	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public List<Notas> getLista() {
		return lista;
	}

	public void setLista(List<Notas> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [idAgenda=" + idAgenda + ", lista=" + lista + "]";
	}

	public void agregarNota(Notas n) {
		lista.add(n);
	}
	
	public void quitarNota(int idAgenda) {
		if (lista.isEmpty() && lista.get(idAgenda-1) != null) {
			lista.remove(idAgenda-1);
		}
	}
	
	public void mostrarNotas() {

		for (Notas n : lista) {
			System.out.printf("ID : %d\n",n.getId());
			System.out.printf("TITULO : %s\n",n.getTitulo());
			System.out.printf("CUERPO : %s\n",n.getCuerpo());
		}
	}
	
	public boolean comprobarUrgente(int urgenteDisp) {
		if(urgenteDisp==1) {
			return true;
		}else {
			return false;
		}

	}

}
