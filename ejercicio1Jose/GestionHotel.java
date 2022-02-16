package ejercicio1;

import java.util.Arrays;

public class GestionHotel {
	
	private Habitacion[] lista;

	public GestionHotel(Habitacion[] lista) {
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
		return "GestionHotel [lista=" + Arrays.toString(lista) + "]";
	};
	
	public double calcularUna(Habitacion h, double porc) {
		return h.calcularPrecio(porc);
	}
	
	/*public void addHabitacion(Habitacion h, int numHab){
			lista[numHab]=h;
	}*/
	
	
	public double calcularTotalRecaudado(double porc, int numHab) {
		double total=0.0;
		for (int i = 0; i < numHab; i++) {
			if(!lista[i].isOcupacion())
			total+=calcularUna(lista[i], porc);
		}
		return total;
	}
	
	public void mostrarOcupadas(int numHab) {
		for (int i = 0; i < numHab; i++) {
			if(!lista[i].isOcupacion()) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
	
	public void mostrarLibres(int numHab) {
		for (int i = 0; i < numHab; i++) {
			if(lista[i].isOcupacion()) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
	
	public void mostrarDatos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getPrecioBase()+"€"+"\t\t\t"+lista[i].isOcupacion()+"\t"
					+ "\t\t"+lista[i].getNombre()+"\t\t"+lista[i].getNumOcupantes()+"\t"
							+ "\t\t"+lista[i].getNumDias());
		}
	}
	
	public void mostrarTicket() {
		System.out.println("PRECIO BASE\t\t"+"OCUPACION"+"\t\t"+"NOMBRE\t\t"+"OCUPANTES\t\t"+"DIAS");
		mostrarDatos();
	}
	
}
