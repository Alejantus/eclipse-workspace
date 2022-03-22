package ejercicio6;

import java.util.Iterator;
import java.util.List;

public class Empresa {
	
	private List<Trabajador> lista;

	public Empresa(List<Trabajador> lista) {
		super();
		this.lista = lista;
	}

	public List<Trabajador> getLista() {
		return lista;
	}

	public void setLista(List<Trabajador> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Empresa [lista=" + lista + "]";
	}
	
	//Métodos
	
	public void agregarTrabajador(Trabajador t) {
		lista.add(t);
	}
	
	public int buscarPorDni(String dni) {
		boolean b = false;
		int tmp = -1;
		
		for (int i = 0; i < lista.size() && !b; i++) {
			if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
				tmp = i;
				b = true;
			}
		}
		return tmp;
	}
	
	public void eliminarTrabajador(String dni) {
		int index = buscarPorDni(dni);
		
		if (index>=0) {
			lista.remove(index);
		}
	}
	
	public void modificarTrabajador(String dni, String nombreNuevo) {
		int index = buscarPorDni(dni);
		
		if (index>=0) {
			lista.get(index).setNombre(nombreNuevo);
		}
	}
	
	public void mensajeEliminacion(boolean b) {
		if(b) {
			System.out.println("Se ha eliminado el empleado");
		}else {
			System.out.println("No se ha podido eliminar el empleado especificado");
		}
	}
	
	public void mostrarTrabajadores() {
		for(Trabajador t : lista) {
			System.out.printf("DNI : %s\n",t.getDni());
			System.out.printf("Nombre : %s\n",t.getNombre());
			System.out.printf("Horas : %d\n",t.getHorasTrabajadas());
			System.out.printf("Sueldo : %.2f\n",t.getSueldoFinal());
		}
	}
	
	public double calcularSueldo(double sueldo, int horasRealizadas,String dni) {
		int index = buscarPorDni(dni);
		double total = 0;
		
		total = lista.get(index).getSueldoFinal()*lista.get(index).getHorasTrabajadas();
		
		return total;
	}

}
