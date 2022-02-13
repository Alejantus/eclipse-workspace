package ejercicio4;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta [] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularTotal(double porc) {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].calcularPrecioLinea(porc);
		}
		
		return total;
	}
}
