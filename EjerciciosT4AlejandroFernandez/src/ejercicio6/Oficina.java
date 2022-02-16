package ejercicio6;

import java.util.Arrays;

public class Oficina {

	private Cuenta[] lista;

	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}

	public double retirarDinero(double retirada, Cuenta c) {
		return c.retirarDinero(retirada);
	}

	public double ingresarDinero(double ingreso, Cuenta c) {
		return c.ingresarDinero(ingreso);
	}

	public double calcularTotal(int numC) {
		double total = 0.0;
		for (int i = 0; i < numC; i++) {
			total += lista[i].getSaldo();
		}
		return total;
	}

	public double ganarDineroEmpresa(int numC, double retirada) {
		double total = 0.0;
		for (int i = 0; i < numC; i++) {
			if (lista[i] instanceof CuentaEmpresa) {
				total += retirarDinero(retirada, lista[i]);
			}
		}
		return total;
	}
	
	public double perderDineroJOven(int numC,double ingreso) {
		double total=0.0;
		for (int i = 0; i < numC; i++) {
			if(lista[i] instanceof CuentaJoven) {
				total += ingresarDinero(ingreso,lista[i]);
			}
		}
		return total;
	}
	
	public void mostrarCuentas(int numC) {
		for (int i = 0; i < numC; i++) {
			System.out.println(lista[i]);
		}
	}
}
