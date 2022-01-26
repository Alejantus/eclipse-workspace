package ejercicio;

import java.util.Arrays;

import lectura.Leer;

public class Plataforma {

	private Depositos lista[];
	private static int capacidadTotal;

	public Plataforma(Depositos[] lista) {
		super();
		this.lista = lista;
	}

	public Plataforma() {

	}

	public Depositos[] getLista() {
		return lista;
	}

	public void setLista(Depositos[] lista) {
		this.lista = lista;
	}

	public static int getCapacidadTotal() {
		return capacidadTotal;
	}

	public static void setCapacidadTotal(int capacidadTotal) {
		Plataforma.capacidadTotal = capacidadTotal;
	}

	@Override
	public String toString() {
		return "Plataforma [lista=" + Arrays.toString(lista) + "]";
	}

	public void agregarDeposito(int tam) {
		System.out.println("¿Cuántos depósitos vas a gestionar?");
		tam = Leer.datoInt();
		lista = new Depositos[tam];
		for (int i = 0; i < lista.length; i++) {
			System.out.println("¿Cuánto mide de alto el depósito?");
			lista[i].setAltura(Leer.datoDouble());
			System.out.println("¿Cuánto mide de radio el depósito?");
			lista[i].setRadio(Leer.datoDouble());
			System.out.println("Cuántos litros puede haber en este depósito");
			lista[i].setLitros(Leer.datoInt());
			System.out.println("¿Cuánto cuesta este depósito?");
			lista[i].setPrecio(Leer.datoDouble());
		}
		
	}
	
	public double calcularPrecioVenta(int numDs,int porcentaje) {
		int cien=100;
		return lista[numDs-1].getPrecio()+(lista[numDs-1].getPrecio()*porcentaje/cien);
	}
	
	public int calcularLitros() {
		for (int i = 0; i < lista.length; i++) {
			capacidadTotal+=lista[i].getLitros();
		}
		return capacidadTotal;
	}
	
	public double calcularGananciaUno(int numDs,double precioLitro) {
		return lista[numDs-1].getPrecio()*precioLitro;
	}
	
	public double calcularGanaciaTodos(double precioLitro,double result) {
		for (int i = 0; i < lista.length; i++) {
			result+=lista[i].getPrecio()*precioLitro;
		}
		return result;
	}
	
	public double calcularGananciaTope(double precioLitro) {
		return capacidadTotal*precioLitro;
	}

}
