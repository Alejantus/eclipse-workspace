package ejercicio4;

import java.util.Arrays;

public class Gimnasio {
	
	Cliente lista[];
	
	
	public Gimnasio(Cliente[] lista) {
		super();
		this.lista = lista;
	}

	public Cliente[] getLista() {
		return lista;
	}

	public void setLista(Cliente[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gimnasio [lista=" + Arrays.toString(lista) + "]";
	}

	public void calcularIMCCliente(double suma,int numC) {
		System.out.printf("%.2f\n",lista[numC-1].calcularIMC(suma));
	}
	
	public void imprimirClientes() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public void darDeBaja(int numC) {
		if (lista[numC-1].isActivo()) {
			lista[numC-1].setActivo(false);
		}else {
			
		}
	}

}
