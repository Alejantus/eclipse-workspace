package ejercicio;

import java.util.Arrays;

public class Feria {

	private int anio;
	private Visitante[] lista;

	public Feria(int anio, Visitante[] lista) {
		super();
		this.anio = anio;
		this.lista = lista;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Visitante[] getLista() {
		return lista;
	}

	public void setLista(Visitante[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Feria [anio=" + anio + ", lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularPrecioEntradaUnVisitante(Visitante v) {
		return v.calcularPrecioEntrada();
	}

	public double calcularTotalRecaudado(int numV) {
		double total = 0.0;
		for (int i = 0; i < numV; i++) {
			total += calcularPrecioEntradaUnVisitante(lista[i]);
		}
		return total;
	}

	public double calcularTotalRecaudadoSoloFamiliares(int numV) {
		double total = 0.0;
		for (int i = 0; i < numV; i++) {
			if (lista[i] instanceof Familiar) {
				total += ((Familiar) lista[i]).calcularPrecioEntrada();
			}
		}
		return total;
	}

	public void mostrarListado(int numV) {
		System.out.println("NOMBRE\t\tID\t\tPRECIO\t\tEDAD");
		for (int i = 0; i < numV; i++) {
			System.out.printf("%s\t\t%d\t\t%.2f\t\t%d\n",lista[i].getNombre(),lista[i].getId(),lista[i].getPrecioEntrada(),lista[i].getEdad());
			if (lista[i] instanceof Empresarios) {
				((Empresarios) lista[i]).invitarCafe();
			}
		}
	}

}
