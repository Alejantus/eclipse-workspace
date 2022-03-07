package ejemplo3Colecciones;

import java.util.ArrayList;
import java.util.List;


public class Secretaria {
	
	private List<Alumno> listAlumnos;

	public Secretaria(List<Alumno> listAlumno) {
		super();
		this.listAlumnos = listAlumno;
	}

	public Secretaria () {
		
		listAlumnos=new ArrayList <Alumno>();
	}

	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(List<Alumno> listAlumno) {
		this.listAlumnos = listAlumno;
	}

	@Override
	public String toString() {
		return "Secretaría [listAlumno=" + listAlumnos + "]";
	}
	
	public void agregarAlum(Alumno alum) {
		listAlumnos.add(alum);
	}

	
	public boolean agregar2 (Alumno al) {
		
		return listAlumnos.add(al);
	}
	
	public int buscarAlum(String dni) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}

	public void modificarAlumno(String dni, String nombreNuevo) {
		
		int index = buscarAlum(dni);

		if (index >= 0) {
					
			listAlumnos.get(index).setNombre(nombreNuevo);
		}
	}
	
	public List<Alumno> buscarAlum3(String nombre) {
		List<Alumno> listaAux = new ArrayList<Alumno>();

		for (int i = 0; i < listAlumnos.size(); i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(nombre)) {
				listaAux.add(listAlumnos.get(i));
			}
		}
		return listaAux;
	}
		
	public void imprimirLista() {
		for (Alumno alumno : listAlumnos) {
			System.out.println(alumno);
		}
	}
	
	public void borrarAlumno(String dni) {
		int index = buscarAlum(dni);

		if (index >= 0) {
			listAlumnos.remove(index);
		}
	}
	
	public void mostrarErrorAgregar (boolean b) {
		if (b){
			System.out.println("Se ha agregado el alumno correctamente");
		}else {
			System.out.println("Error al insertar");
		}
		
				
	}
}
