package ejercicio2;

import java.util.Arrays;

public class Venta {
	
	private Producto[] lista;

	public Venta(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void mostrarEnVenta(int numProd) {
		for (int i = 0; i < numProd; i++) {
			if(!lista[i].isVendido()) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
	
	public double calcularPvpUno(Producto p, double porc) {
		return p.calcularPvp(porc);
	}
	
	public double calcularTotal(int numProd, double porc) {
		double total=0.0;
		for (int i = 0; i < numProd; i++) {
			if(!lista[i].isVendido())
			total+=calcularPvpUno(lista[i], porc);
		}
		return total;
	}
	
	public double devolverCambio(double pagado, double precio) {
		double cambio=0.0;
		cambio = pagado - precio;
		return cambio;
	}
	
	public void mostrarLista(int numProd) {
		for (int i = 0; i < numProd; i++) {
			System.out.println((i+1)+". "+lista[i]);
			if(lista[i] instanceof EspadaLaser) {
				((EspadaLaser) lista[i]).mostrarAviso();
			}
		}
	}
	
}
