package ejercicio2;

import java.util.Arrays;

public class Hotel {
	
	private Habitacion lista[];

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	public boolean comprobarLimpieza(int numH) {
		return lista[numH-1].isLimpia();
	}
	
	public void imprimirLimpia(int numH) {
		if (comprobarLimpieza(numH)) {
			System.out.println("La habitación está hecha");
		}else {
			System.out.println("Todavía no se ha limpiado");
		}
	}
	
	public double calcularPrecio(int numH) {
		return lista[numH-1].getPrecioB()*lista[numH-1].getNumDias();
	}
	
	public double calcularPrecioxExtras(int numH,double extras) {
		if (lista[numH].isExtras()) {
			
		}
		return calcularPrecio(numH)+extras;
	}
	
	public void imprimirListado() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	
	
	
	
	

}
