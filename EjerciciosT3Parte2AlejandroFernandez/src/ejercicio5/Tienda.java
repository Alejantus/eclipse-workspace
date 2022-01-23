package ejercicio5;

import java.util.Arrays;

public class Tienda {

	private Electrodomesticos lista[];
	private static double totalPrecio;
	private static int totalContador;

	public Tienda(Electrodomesticos[] lista) {
		super();
		this.lista = lista;
	}

	public Electrodomesticos[] getLista() {
		return lista;
	}

	public void setLista(Electrodomesticos[] lista) {
		this.lista = lista;
	}

	public static double getTotalPrecio() {
		return totalPrecio;
	}

	public static void setTotalPrecio(double totalPrecio) {
		Tienda.totalPrecio = totalPrecio;
	}

	public static int getTotalContador() {
		return totalContador;
	}

	public static void setTotalContador(int totalContador) {
		Tienda.totalContador = totalContador;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularTodosPrecios() {
		double precioFinal=0;
		for (int i = 0; i < lista.length; i++) {
			precioFinal+=lista[i].getPrecioB();
		}
		return precioFinal;
	}
	
	public double calcularMediaPrecio() {
		double precioFinal=0,media=0;
		for (int i = 0; i < lista.length; i++) {
			precioFinal+=lista[i].getPrecioB();
			totalContador++;
			totalPrecio=precioFinal;
		}
		media=totalPrecio/totalContador;
		return media;
	}
	
	public double calcularPrecioElegido(int numE,double resultado) {
		return lista[numE-1].precioFinal(resultado);
	}
}
