package ejercicio1;

public class Nota {

	private int id;
	private String titulo;
	private String cuerpo;
	private boolean urgente;
	
	public Nota(int id, String titulo, String cuerpo, boolean urgente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.urgente = urgente;
	}

	public Nota() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public boolean isUrgente() {
		return urgente;
	}

	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", urgente=" + urgente + "]";
	}
	
	
	
}
