package crud;

import java.util.Iterator;
import java.util.Map;

import model.Empleados;
import model.Sector;

public class CrudEmpleado {

	private Map<Empleados, Sector> lista;

	public CrudEmpleado(Map<Empleados, Sector> lista) {
		super();
		this.lista = lista;
	}

	public Map<Empleados, Sector> getLista() {
		return lista;
	}

	public void setLista(Map<Empleados, Sector> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudEmpleado [lista=" + lista + "]";
	}

	// Métodos

	public void agregarEmpleado(Empleados e, Sector s) {
		lista.put(e, s);
	}

	public Empleados buscarEmpleadoPorId(String id) {
		boolean encontrado = false;
		Empleados e;
		Iterator<Empleados> it = lista.keySet().iterator();
		while (it.hasNext() && !encontrado) {
			e = it.next();
			if (e.getId().equalsIgnoreCase(id)) {
				encontrado = true;
				return e;
			}
		}
		return null;
	}

	public boolean eliminarEmpleado(String id) {
		Empleados e = buscarEmpleadoPorId(id);
		if (e != null) {
			lista.remove(e);
			return true;
		}
		return false;
	}

	public boolean modificarEmpleado(String nuevoId, String nuevoNombre) {
		Empleados e = buscarEmpleadoPorId(nuevoId);
		if (e != null) {
			e.setNombre(nuevoNombre);
			return true;
		}
		return false;
	}
	
	public void mostrarConfirmacionEliminar(boolean b) {
		if(b) {
			System.out.println("Se ha eliminado el empleado");
		}else {
			System.out.println("No se ha encontrado dicho empleado");
		}
	}

}
