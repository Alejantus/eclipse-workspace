package ejemplo;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0;
		String nombre,apellido;
		double notaMedia=0.0,puntos=0.0;
		
		
		Alumno aEditado;
		
		
		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga el apellido");
		apellido=Leer.dato();
		System.out.println("Diga la nota media");
		notaMedia=Leer.datoDouble();
		
		aEditado=new Alumno(edad,nombre,apellido,notaMedia);
		
		//Los getters se usan para obtener la informacion del metodo
		
		System.out.println("Su edad es: "+aEditado.getEdad());
		System.out.println("Su nombre es: "+aEditado.getNombre());
		System.out.println("Su apellido es: "+aEditado.getApellidos());
		System.out.println("Su nota media es de: "+aEditado.getNotaMedia());

		//mientras que los setters compruban si son del mismo tipo
		
		System.out.println("Diga nueva nota media");
		notaMedia=Leer.datoDouble();
		aEditado.setNotaMedia(notaMedia);
		System.out.println("Su nueva nota media es: "+aEditado.getNotaMedia());
		notaMedia=1212.5;
		System.out.println("pero no es lo mismo que la variable notaMedia "
				+ "si lo cambio a mano que vale: "+notaMedia);
		
		System.out.println("¿Cuántos puntos quieres sumar?");
		puntos=Leer.datoDouble();
		aEditado.sumarPuntos(puntos);
		System.out.println(aEditado.getNotaMedia());
	}

}
