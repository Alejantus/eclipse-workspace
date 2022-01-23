package ejercicio6;

import java.util.Arrays;

public class Sala {
	
	Entradas lista[];
	private int id;
	private static int totalButacas;
	
	public Sala(Entradas[] lista, int id) {
		super();
		this.lista = lista;
		this.id = id;
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

	@Override
	public String toString() {
		return "Sala [lista=" + Arrays.toString(lista) + ", id=" + id + "]";
	}
	
	public void modificarEntrada(double nuevoPrecio) {
		for (int i = 0; i < lista.length; i++) {
			lista[i].setPrecio(nuevoPrecio);
		}
	}
	
	public void comprarEntrada() {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].isDisponible()) {
				lista[i].setDisponible(false);
			}
		}
	}
	
	public double contarRecaudacion() {
		double recaudacion=0.0;
		for (int i = 0; i < lista.length; i++) {
			recaudacion+=lista[i].getPrecio();
		}
		return recaudacion;
	}

}
