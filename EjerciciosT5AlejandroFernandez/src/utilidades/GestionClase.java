package utilidades;

import java.util.HashSet;
import java.util.Set;

import ejercicio3.Alumno;

public class GestionClase {

	Set <Alumno> lista;

	public GestionClase() {
		super();
		this.lista = new HashSet<Alumno>();
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionClase [lista=" + lista + "]";
	}
	
	public void agregarAlumno(Alumno a) {
		lista.add(a);
	}
	
	public void quitarAlumno(Alumno a) {
		if(lista.equals(a)) {
			lista.remove(a);
		}
	}
	
	public void mostrarAlumno() {
		System.out.println(lista);
	}
	
	
}
