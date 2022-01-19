package ejercicio3;

import java.util.Arrays;

public class Vendedor {

	Movil lista[];
	private static double totalVendido;

	public Vendedor(Movil[] lista) {
		super();
		this.lista = lista;
	}

	public Movil[] getLista() {
		return lista;
	}

	public void setLista(Movil[] lista) {
		this.lista = lista;
	}

	public static double getTotalVendido() {
		return totalVendido;
	}

	public static void setTotalVendido(double totalVendido) {
		Vendedor.totalVendido = totalVendido;
	}

	@Override
	public String toString() {
		return "Vendedor [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void imprimirVendido(int numV) {
		if (lista[numV-1].getVendido()==0) {
			System.out.println(lista[numV-1].getVendido());
		}else {
			System.out.println(lista[numV-1].getVendido());
		}
	}
}
