package ejercicioTipoExamen1;

import java.util.Arrays;

public class GestionHabitaciones {

	private Habitacion[] lista;

	public GestionHabitaciones(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularPrecioUnaHab(double porc,Habitacion h) {
		return h.calcularHabitacion(porc);
	}

	public double calcularRecaudado(double porc,int numH) {
		double total = 0.0;
		for (int i = 0; i < numH; i++) {
			if(lista[i].isOcupado()) {
			total += calcularPrecioUnaHab(porc, lista[i]);
			}
		}
		return total;
	}
	
	public void mostrarFactura(int numH) {
		System.out.printf("Precio\tOcupado\tNombre\tDias\tOcupantes");
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("%.2f\t%B\t%s\t%d\t%d",lista[numH-1].getPrecioBase(),lista[numH-1].isOcupado(),lista[numH-1].getNombreCliente(),lista[numH-1].getDiasOcupacion(),lista[numH-1].getNumOcupantes());
		}
	}

	public void mostrarHabDisp(int numH) {
		for (int i = 0; i < numH; i++) {
			if (lista[i].isOcupado()) {

			} else {
				System.out.println(lista[i]);
			}
		}
	}

	

}
