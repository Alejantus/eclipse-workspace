package ejercicio6;

import java.util.Arrays;

public class Sala {
	
	Entradas lista[];
	private int id;
	private static int totalButacas;
	Entradas e;
	
	public Sala(Entradas[] lista, int id, Entradas e) {
		super();
		this.lista = lista;
		this.id = id;
		this.e = e;
	}

	public Entradas[] getLista() {
		return lista;
	}

	public void setLista(Entradas[] lista) {
		this.lista = lista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotalButacas() {
		return totalButacas;
	}

	public static void setTotalButacas(int totalButacas) {
		Sala.totalButacas = totalButacas;
	}

	public Entradas getE() {
		return e;
	}

	public void setE(Entradas e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Sala [lista=" + Arrays.toString(lista) + ", id=" + id + ", e=" + e + "]";
	}
	
	
	
	
	
	

}
