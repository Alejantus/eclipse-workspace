package ejemploprintf;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sueldo = 867.342796;
		double sueldoBruto = 21254.0215;
		int edad = 23;
		String apellido1 = "Fernandez";
		
		
		//Para imprimir un int en un printf se necesita usar %d
		
		/**
		 * Cuando hago enter en la parte de texto/comentario lo pasa a la siguiente linea.
		 * Un operador modulo te da el resto de una division, solo sirve para enteros NEVER
		 * decimales.
		 */
		
		System.out.printf("Mi sueldo es %.2f euros"
				+ " y el sueldo bruto es: %.3f euros", sueldo, sueldoBruto);
		System.out.print("Hola");
		System.out.println();
		System.out.printf("Mi edad es: %d\n", edad);
		System.out.println("Mi primer apellido es: "+apellido1);
		System.out.printf("Mi primer apellido es: %s "
				+ "y tienes %d",apellido1,edad);
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		

	}

}
