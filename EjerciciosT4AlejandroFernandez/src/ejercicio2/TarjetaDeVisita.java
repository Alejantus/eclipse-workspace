package ejercicio2;

public class TarjetaDeVisita extends Documento {

	private String nombreContacto;
	private int telefono;
	private String email;

	public TarjetaDeVisita(String titulo, String nombreEmpresa, String nombreContacto, int telefono, String email) {
		super(titulo, nombreEmpresa);
		this.nombreContacto = nombreContacto;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}
	
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString()+ "TarjetaDeVisita [nombre=" + nombreContacto + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	public void mostrarDatos(String nombreEmpresa,String titulo,String nombreContacto,int telefono,String email) {
		super.mostrarDatos(titulo,nombreEmpresa);
		System.out.printf("Y los datos de contacto son: el nombre es %s, "
				+ "su número de teléfono es el %d,y su email es %s",nombreContacto,telefono,email);
	}
	
	
}
