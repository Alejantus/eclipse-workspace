package ejemplo;

public class Alumno {
	
	//Atributos
	
	int edad;
	String nombre;
	String apellidos;
	double notaMedia;	
	
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

}
