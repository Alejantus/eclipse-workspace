package ejercicio3;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {
	
	private Set<Alumno>lista;

	public CrudAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public CrudAlumno() {
		super();
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudAlumno [lista=" + lista + "]";
	}
	
	public void mostrarAlumnos() {
		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}
	}
	
	public Alumno buscarPorDNI(String dni) {
		Alumno a = null;
		boolean salir=true;
		for (Alumno alumno : lista) {
			if(alumno.getDni().equalsIgnoreCase(dni) && !salir) {
				salir=false;
				return alumno;
			}
		}
		return a;
	}
	
	public void mostrarAlumno(String dni) {
		if(buscarPorDNI(dni)!=null) {
			System.out.println(buscarPorDNI(dni));
		}else {
			System.out.println("No hay alumno con ese DNI");
		}
	}
	
	public boolean modificarAlumno(String dni, double notaNueva) {
		Alumno a = buscarPorDNI(dni);
		if(a!=null) {
			a.setDni(dni);
			return true;
		}
		return false;
	}
	
	public void mostrarErrorMod(boolean b) {
		if(b) {
			System.out.println("Su nota ha sido modificada");
		}else {
			System.out.println("No se ha podido modificar la nota");
		}
	}
	
	public boolean eliminarAlumno(String dni) {
		Alumno a = buscarPorDNI(dni);
		if(a!=null) {
			lista.remove(a);
			return true;
		}
		return false;
	}
	
	public void mostrarConfirmacionEliminar(boolean b) {
		if(b) {
			System.out.println("Eliminado");
		}else {
			System.out.println("No se pudo eliminar");
		}
	}
	
	public Alumno buscarPorDNIV2(String dni) {
		Alumno a;
		Iterator<Alumno> it = lista.iterator(); 
		boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			a=it.next();
			if(a.getDni().equalsIgnoreCase(dni)) {
				encontrado=true;
				return a;
			}
		}
		return null;
	}
	
	/*public void mostrarUnAlumno(int posicion) {
		lista.toArray();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista[posicion-1]);
		}
	}*/
	
	
	
	

}
