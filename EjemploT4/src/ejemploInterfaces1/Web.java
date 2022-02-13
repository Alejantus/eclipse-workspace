package ejemploInterfaces1;

public class Web implements Imprimible {

	private String titulo;

	public Web(String titulo) {
		super();
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Web [titulo=" + titulo + "]";
	}

	@Override
	public void imprimirAst() {
		System.out.println("Foto");
	}
	
	
}
