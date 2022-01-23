package ejercicio1;

import java.util.Arrays;

public class Gestion {
	
	Producto lista[];
	
	public Gestion(Producto[] lista) {
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
		return "Gestion [lista=" + Arrays.toString(lista) + "]";
	}

	public Gestion(double precio, String marca, String tamanio, String forma, String calidad) {
	}

	public void mostrarLista(int nPs) {
		for (int i = 0; i < nPs; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public double calcularVentaPublico(int op, double ganancia,double suma) {
		for (int i = 0; i < lista.length; i++) {
			ganancia = lista[op-1].getPrecio()*(50/100);
			suma = lista[op-1].getPrecio()+ganancia;
		}
		return suma;
	}
	
	public void mostrarComprobarFragilidad(boolean b) {
		if(b) {
			System.out.println("El producto es frágil, ten cuidado");
		}else {
			System.out.println("El producto no es frágil, no le pasará nada si se cae");
		}
	}
	
	public boolean comprobarFragilidad(int numF) {
		if(numF==1) {
			return true;
		}else {
			return false;
		}
	}

}
