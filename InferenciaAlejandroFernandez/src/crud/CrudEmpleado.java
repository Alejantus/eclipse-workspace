package crud;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import controller.CompararPorHoras;
import controller.CompararPorNombre;
import model.Empleados;

public class CrudEmpleado {

	private Set<Empleados>lista;

	public CrudEmpleado(Set<Empleados> lista) {
		super();
		this.lista = lista;
	}

	public Set<Empleados> getLista() {
		return lista;
	}

	public void setLista(Set<Empleados> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudEmpleado [lista=" + lista + "]";
	}
	
	//Métodos

	/*
	 * Con este método lo que quiero hacer es agregar un empleado
	 * a la lista para ello le paso un empleado con todos sus datos.
	 */
	public void agregarEmpleado(Empleados e) {
		lista.add(e);
	}

	/*
	 * Con este método lo que quiero hacer es buscar un
	 * empleado por su id para ello utilizo iterator para
	 * recorrer la lista y si hay empleados en la lista
	 * lo comparo con un id que le paso como parámetro
	 * y si es verdadero que devuelva el empleado.
	 */
	public Empleados buscarEmpleadoPorId(int id) {
		boolean encontrado = false;
		Empleados e;
		Iterator<Empleados> it = lista.iterator();
		while (it.hasNext() && !encontrado) {
			e = it.next();
			if (e.getId()==id) {
				encontrado = true;
				return e;
			}
		}
		return null;
	}
	
	/*
	 * Con este método lo que quiero conseguir es eliminar un empleado
	 * de la lista, para poder eliminar un empleado primero busco
	 * ese empleado por su id y cuando lo encuentre lo elemine de
	 * la lista.
	 */
	public boolean eliminarEmpleado(int id) {
		Empleados e = buscarEmpleadoPorId(id);
		if (e != null) {
			lista.remove(e);
			return true;
		}
		return false;
	}
	
	/*
	 * Con este método lo que quiero conseguir es
	 * modificar el nombre de un empleado que ya está
	 * en la lista, para ello lo que hago es buscar ese
	 * empleado y le seteo su nombre por un nuevoNombre.
	 */
	public boolean modificarEmpleado(int id,String nombreNuevo) {
		Empleados e = buscarEmpleadoPorId(id);
		if (e != null) {
			e.setNombre(nombreNuevo);
			return true;
		}
		return false;
	}
	
	/*
	 * Este método ordenar utilizo la interface Comparable que hay
	 * en la POJO, lo que quiero conseguir con este método es 
	 * ordenar por el id
	 */
	public void ordenarPorId(){
		SortedSet<Empleados> ordenado = new TreeSet<Empleados>(lista);
		
		for(Empleados e : ordenado) {
			System.out.println("***********************************");
			System.out.printf("Id : %d\n",e.getId());
			System.out.printf("Nombre : %s\n",e.getNombre());
			System.out.printf("Apellidos : %s\n",e.getApellido());
			System.out.printf("Sector : %s\n",e.getNombreSector());
			System.out.println("***********************************\n");
		}
	}
	
	/*
	 * Este ordenar se utiliza la clase CompararPorNombre
	 * que en ella utilice la interface Comparator, 
	 * para poder ordenar la lista lo que haremos será 
	 * 
	 */
	public void ordenarPorNombre(){
		SortedSet<Empleados> ordenado2 = new TreeSet<Empleados>(new CompararPorNombre());
		ordenado2.addAll(lista);
		
		for(Empleados e : ordenado2) {
			System.out.println("***********************************");
			System.out.printf("Id : %d\n",e.getId());
			System.out.printf("Nombre : %s\n",e.getNombre());
			System.out.printf("Apellidos : %s\n",e.getApellido());
			System.out.printf("Sector : %s\n",e.getNombreSector());
			System.out.println("***********************************\n");
		}
	}
	
	public void ordenarPorHoras(){
		SortedSet<Empleados> ordenado3 = new TreeSet<Empleados>(new CompararPorHoras());
		ordenado3.addAll(lista);
		
		for(Empleados e : ordenado3) {
			System.out.println("***********************************");
			System.out.printf("Id : %d\n",e.getId());
			System.out.printf("Nombre : %s\n",e.getNombre());
			System.out.printf("Apellidos : %s\n",e.getApellido());
			System.out.printf("Sector : %s\n",e.getNombreSector());
			System.out.println("***********************************\n");
		}
	}
	
	/*
	 * Un método para poder calcular el sueldo de un empleado
	 * pasándole el id de un empleado para poder asi obtener las horas
	 * de un empleado.
	 */
	public double calcularSueldo(double sueldo,int id) {
		Empleados e = buscarEmpleadoPorId(id);
		
		return sueldo * e.getHorasTrabajadas();
	}

}
