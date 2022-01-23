package ejercicio3;

import java.util.Arrays;

public class Vendedor {

	Movil lista[];
	public static int totalVendido;
	public static double totalRecaudado;

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

	public static int getTotalVendido() {
		return totalVendido;
	}

	public static void setTotalVendido(int totalVendido) {
		Vendedor.totalVendido = totalVendido;
	}

	public static double getTotalRecaudado() {
		return totalRecaudado;
	}

	public static void setTotalRecaudado(double totalRecaudado) {
		Vendedor.totalRecaudado = totalRecaudado;
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
				System.out.println(lista[i]);
			}
		}
	}
	
	public double calcularPrecioFinal(int numV,int descuento) {
		int div = 100;
		double precioFinal=0;
		
		precioFinal=lista[numV-1].getPrecio()-(lista[numV-1].getPrecio()*descuento/div);
		lista[numV-1].setVendido(false);
		totalRecaudado=precioFinal;
		totalVendido++;
		return precioFinal;
	}
	
}
