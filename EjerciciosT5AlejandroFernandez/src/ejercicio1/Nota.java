package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Nota {
	
	private String texto;

	List<Nota>lista;
	
	public Nota(String texto) {
		this.texto = texto;
		lista = new ArrayList<Nota>();
	}
	
	public void agregarNombre(String valor) {
		lista.add(valor);
	}
	
	public int obetnerTamanio() {
		return lista.size();
	}
	

}
