package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Club {
	
	private int id;
	private List<Socio> lista;
	
	public Club(int id, List<Socio> lista) {
		super();
		this.id = id;
		this.lista = lista;
	}
	
	public Club() {
		this.lista = new ArrayList<Socio>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", lista=" + lista + "]";
	}
	
	public void agregarSocio(Socio s) {
		lista.add(s);
	}
	
	public void quitarSocio(int idSocio) {
		if (lista.isEmpty() || lista.get(idSocio-1) != null) {
			lista.remove(idSocio-1);
		}
	}
	
	public void mostrarSocios() {
		for (Socio s : lista) {
			System.out.printf("NOMBRE : %s\n",s.getNombre());
			System.out.printf("Nº SOCIO : %s\n",s.getnSocio());
			System.out.printf("DNI : %s\n\n",s.getDni());
		}
	}
	
	public void modificarSocio(int idSocio, String dni, String nombre, int nSocio) {
		if (lista.isEmpty() || lista.get(idSocio-1) != null) {
			lista.get(idSocio-1).setDni(dni);
			lista.get(idSocio-1).setNombre(nombre);
			lista.get(idSocio-1).setnSocio(nSocio);
		}
	}
	
	public String buscarNombreSocio(String nombre) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.size() && !encontrado) {
			Socio deSocio = lista.get(i);
			if (deSocio.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return lista.get(i).getNombre();
		}else {
			return "No existe dicho socio";
		}
	}
	
	public void mostrarSocios(String nombre) {
		if (buscarNombreSocio(nombre).equals(null)) {
			System.out.println("No existe");
		}else {
			mostrarSocios();
		}
		
	}
}
