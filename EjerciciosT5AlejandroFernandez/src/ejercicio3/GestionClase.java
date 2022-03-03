package ejercicio3;

import java.util.HashSet;
import java.util.Set;

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
		lista.remove(a);
	}
	
	public void mostrarAlumno() {
		System.out.println(lista);
	}
	
	
}
