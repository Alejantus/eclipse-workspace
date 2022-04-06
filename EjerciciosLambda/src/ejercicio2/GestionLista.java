package ejercicio2;

import java.util.List;

public class GestionLista {
	
	private List<Palabras> listaPalabras;

	public GestionLista(List<Palabras> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List<Palabras> getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List<Palabras> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	@Override
	public String toString() {
		return "GestionLista [listaPalabras=" + listaPalabras + "]";
	}
	
	public void agregarPalabra(Palabras p) {
		listaPalabras.add(p);
	}
	

}
