package ejercicio3;

import java.util.List;

public class PlayList {

	private List<Cancion> lista;

	public PlayList(List<Cancion> lista) {
		super();
		this.lista = lista;
	}

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "PlayList [lista=" + lista + "]";
	}

	// Añadir una cancion

	public void agregarUnaCancion(Cancion c) {
		lista.add(c);
	}

	// Eliminar una cancion

	public void eliminarUnaCancion(String nombreCancion) {
		Cancion c = buscarPorNombreCancion(nombreCancion);
		if (c != null) {
			lista.remove(c);
		}
	}

	// Buscar por nombre

	public Cancion buscarPorNombreCancion(String nombreCancion) {
		return lista.stream()
				.filter(cancion -> nombreCancion.equalsIgnoreCase(cancion.getNombre()))
				.findAny()
				.orElse(null);
	}

	// Buscar por autor

	public Cancion buscarPorNombreAutor(String nombreAutor) {
		return lista.stream()
				.filter(cancion -> nombreAutor.equalsIgnoreCase(cancion.getAutor()))
				.findAny()
				.orElse(null);
	}

	// Buscar por genero

	public Cancion buscarPorGenero(int genero) {
		return lista.stream()
				.filter(cancion -> genero == cancion.getGenero())
				.findAny()
				.orElse(null);
	}
	
	//Mostrar canciones
	
	/*
	public void mostrarCanciones(Cancion c) {
		System.out.printf("Nombre : %s",c.getNombre());
		System.out.printf("Autor : %s",c.getAutor());
		System.out.printf("Genero : %d",c.getGenero());
		System.out.printf("Duración : %H:%M:%S",c.getDuracion());
	}*/
	
	public void mostrarCanciones() {
		lista.stream().forEach(System.out::println);
	}
}
