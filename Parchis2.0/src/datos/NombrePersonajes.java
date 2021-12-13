package datos;

public class NombrePersonajes {
	
	private String[] nombres;

	public NombrePersonajes() {
		super();
		this.nombres = new String[] {"Javandir Hijo de Eclipse", "Maketas el Renacido", "Programador Desencadenado", "Ctrl+C Ctrl+V"};
	}

	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}
	
	public void mostrarNombres() {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Opción " + (i+1) + "\t" + this.nombres[i]);
		}
	}

}
