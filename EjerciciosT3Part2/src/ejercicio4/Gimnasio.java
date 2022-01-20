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
		System.out.println(lista[numC-1].calcularIMC(suma));
	}

}
