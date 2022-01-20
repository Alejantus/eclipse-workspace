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

	public void comprobarLista() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println("Puede seguir con la venta");
			}
		}
	}

	public void imprimirLista() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public void imprimirVendido() {
		for (int i = 0; i < lista.length; i++) {

			if (lista[i].isVendido()) {

			} else {
				for (int j = 0; j < lista.length; j++) {
					System.out.println(lista[j]);
				}
			}
		}
	}
}
