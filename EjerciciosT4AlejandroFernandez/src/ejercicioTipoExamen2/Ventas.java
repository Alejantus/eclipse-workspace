package ejercicioTipoExamen2;

import java.util.Arrays;

public class Ventas {
	
	private Producto [] lista;

	public Ventas(Producto[] lista) {
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
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void mostrarProductos(int numP) {
		for (int i = 0; i < numP; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public double calcularVentas(int numP,Producto p,double porc) {
		double total=0.0;
		for (int i = 0; i < numP; i++) {
			total+=p.calcularPVP(porc);
		}
		return total;
	}
	
	public double devolverCambio(int numP,Producto p,double porc,double dinero) {
		double total=0.0;
		for (int i = 0; i < numP; i++) {
			total=dinero-p.calcularPVP(porc);
		}
		return total;
	}

}
