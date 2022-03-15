package ejercicio2;

import java.util.List;

public class CrudSocio {
	
	private List<Socio>lista;

	public CrudSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public CrudSocio() {
		super();
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudSocio [lista=" + lista + "]";
	}
	
	public void aniadirSocio(Socio s) {
		lista.add(s);
	}
	
	public int findSocio(Socio s) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.size() && !encontrado) {
			Socio deLista = lista.get(i);
			if (s.compareTo(deLista) == 0)
				encontrado = true;
			else
				i++;
		}

		if (encontrado)
			return i;
		else
			return -1;
	}
	
	public void imprimirBusqueda(int i) {
		if(i<0) {
			System.out.println("Usuario inexistente");
		}else {
			System.out.println(lista.get(i)); 
		}
	}
	
	public void mostrarDatos() {
		for (Socio socio : lista) {
			System.out.println(socio);
		}
	}
	
	public void editNombre(String nombre, Socio s) {
			s.setNombre(nombre);
	}
	
	public void eliminarUsuario(int numPosicion) { 
		if(!lista.isEmpty() && lista.get(numPosicion-1) != null) {
			lista.remove(numPosicion-1);
		}
	}
	
}
