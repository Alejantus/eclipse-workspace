package ejemplo;

public class Alumno {
	
	//Atributos
	//Niveles de acceso
	/**
	 * public = pueden acceder todos las clases 
	 * si no hay nada = nada puede acceder a la clase los que no estan en el mismo paquete
	 * private = solo pueden acceder solo los de esa misma clase
	 */
	//TODOS los atributos tendran getters y setters, tambien tendran sus contructores
	private int edad;
	private String nombre;
	private String apellidos;
	private double notaMedia;	
	
	//Constructor
	//NUNCA!!!!! Se lee por teclado en el constructor porque
	//perdemos toda la libertad
	public Alumno(int edad,String nombre,String apellidos,double notaMedia) {
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.notaMedia=notaMedia;
	}
	
	public Alumno(String nombre,String apellidos,double notaMedia) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.notaMedia=notaMedia;
	}
	
	//Getters and Setters
	//En los parentesis de los getters no se escribe nada mientras que en
	//los setters se tiene que escribir la variable 	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia=notaMedia;
	}
	
	//Métodos
	//Dentro de los parantesis se declara una nueva variable dentro del metodo 
	public double sumarPuntos(double puntos) {
		notaMedia+=puntos;
		
		return notaMedia;
	}

}
