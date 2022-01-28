package ejercicio2;

public class Documento {

	private String titulo;
	private String texto;
	private String nombreEmpresa;

	public Documento(String titulo, String nombreEmpresa) {
		this.titulo = titulo;
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", nombreEmpresa=" + nombreEmpresa + "]";
	}

	public void mostrarDatos() {
		System.out.printf("El titulo del documento es %s,y el nombre de la empresa es %s.\n",titulo,nombreEmpresa);
	}

}
