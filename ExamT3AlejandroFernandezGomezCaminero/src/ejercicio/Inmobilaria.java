package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Inmobilaria {

	private Piso p;
	private int id;
	private int lista[] = { 0, 0, 0, 0, 0, 0 };

	public Inmobilaria(Piso p, int id, int[] lista) {
		super();
		this.p = p;
		this.id = id;
		this.lista = lista;
	}

	public Inmobilaria() {
		super();
	}

	public Piso getP() {
		return p;
	}

	public void setP(Piso p) {
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Inmobilaria [p=" + p + ", id=" + id + ", lista=" + Arrays.toString(lista) + "]";
	}

	public int rellenarArray(int desde, int hasta) {
		Random r = new Random(System.nanoTime());
		p.setPrecio(r.nextInt(hasta - desde + 1) + desde);
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) p.getPrecio();
		}
		return (int) p.getPrecio();
	}

	public void calcularPrecioVenta(int mes) {

		for (int i = 0; i < lista.length; i++) {

			if (mes == 1) {
				p.setPrecio(lista[i]+10/100);
			} else if (mes == 2) {
				p.setPrecio(lista[i]+20/100);
			} else if (mes == 3) {
				p.setPrecio(lista[i]+30/100);
			} else if (mes == 4) {
				p.setPrecio(lista[i]+40/100);
			} else if (mes == 5) {
				p.setPrecio(lista[i]+50/100);
			} else {
				p.setPrecio(lista[i]+60/100);
			}
		}

	}

	public double calcularPrecioMetro(int metros) {
		for (int i = 0; i < lista.length; i++) {
			p.setPrecio(lista[i] * p.getMetros());
		}
		return p.getPrecio();
	}

	public double cambiarALibras(double libras) {
		for (int i = 0; i < lista.length; i++) {
			p.setPrecio(lista[i] * libras);
		}
		return p.getPrecio();
	}

	public void mostrarDatos() {
		System.out.println("El precio de la casa es de " + p.getPrecio());
		System.out.println("Los metros que tiene son unos " + p.getMetros());
		System.out.println("Este piso necesita reforma " + p.isReforma());
		System.out.println("Y este piso se encuentra en la " + p.getDireccion());

	}

}
