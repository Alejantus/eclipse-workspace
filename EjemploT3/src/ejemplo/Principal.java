package ejemplo;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0;
		String nombre,apellido;
		double notaMedia=0.0;
		
		
		Alumno aEditado,aEditado2;
		
		
		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga el apellido");
		apellido=Leer.dato();
		System.out.println("Diga la nota media");
		notaMedia=Leer.datoDouble();
		
		aEditado=new Alumno(edad,nombre,apellido,notaMedia);
		

		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga el apellido");
		apellido=Leer.dato();
		System.out.println("Diga la nota media");
		notaMedia=Leer.datoDouble();
		
		aEditado2=new Alumno(edad,nombre,apellido,notaMedia);
		
		System.out.println(aEditado.edad);
		System.out.println(aEditado2.edad);
	}

}
