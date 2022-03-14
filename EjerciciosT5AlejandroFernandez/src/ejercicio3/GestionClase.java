package ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class GestionClase {

	Set <Alumno> alumno;

	public GestionClase(Set<Alumno> alumno) {
		super();
		this.alumno = alumno;
	}

	public GestionClase() {
		super();
		this.alumno = new HashSet<Alumno>();
	}

	public Set<Alumno> getAlumno() {
		return alumno;
	}

	public void setLista(Set<Alumno> alumno) {
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		return "GestionClase [lista=" + alumno + "]";
	}
	
	public void agregarAlumno(Alumno a) {
		alumno.add(a);
	}
	
	public Alumno buscarPorId(int id) {
		Alumno lista= null;
		
		for(Alumno a : alumno) {
			if (a.getIdAlumno()==id) {
				return a;
			}
		}
		return lista;
	}
	
	public void quitarAlumno(int id) {
		Alumno a = buscarPorId(id);
	}
	
	public void mostrarAlumno() {
		System.out.println(alumno);
	}

	@Override
	public int hashCode() {
		return Objects.hash(alumno);
	}
	
	/*
	 * public Alumno buscarPorId(int id){
	 * 	Alumno alumno = null;
	 * 
	 * 	for(Alumno a : alumno){
	 * 		if(a.getIdAlumno==id){
	 * 			return a;
	 * 		}
	 * 	}
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public Alumno buscarPorId2(int id){
	 * 	Iterator<Alumno> it = alumno.Iterator();
	 * 	Alumno a;
	 * 	boolean encontrado;
	 * 
	 * 	while(it.hasNext()&& !encontrado){
	 * 		a = it.next();
	 * 		if(a.getIdAlumno	
	 * }
	 * 
	 * }*/
	
	
}
