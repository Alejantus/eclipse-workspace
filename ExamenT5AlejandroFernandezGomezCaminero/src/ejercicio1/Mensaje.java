package ejercicio1;

import java.util.Objects;

public class Mensaje implements Comparable<Mensaje> {
	
	private int id;
	private String nombreContacto;
	private String textoMensaje;
	
	public Mensaje(int id, String nombreContacto, String textoMensaje) {
		super();
		this.id = id;
		this.nombreContacto = nombreContacto;
		this.textoMensaje = textoMensaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTextoMensaje() {
		return textoMensaje;
	}

	public void setTextoMensaje(String textoMensaje) {
		this.textoMensaje = textoMensaje;
	}

	@Override
	public String toString() {
		return "***************************\nId : "+id+"\nNombre : "+nombreContacto+"\nMensaje : "+textoMensaje+"\n***************************";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombreContacto, textoMensaje);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return id == other.id && Objects.equals(nombreContacto, other.nombreContacto)
				&& Objects.equals(textoMensaje, other.textoMensaje);
	}

	@Override
	public int compareTo(Mensaje m) {
		if(id < m.getId()) {
			return -1;
		}else if(id > m.getId()) {
			return 1;
		}
		return 0;
	}
	
	

}
