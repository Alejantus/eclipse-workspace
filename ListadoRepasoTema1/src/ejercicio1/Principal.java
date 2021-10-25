package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ocho = 8;
		double pi = 3.14;
		String hola = "Hola mundo";
		
		System.out.println("Bienvenido, en este programa vamos a enseñar por pantalla un numero de tipo int,"
				+ " un numero de tipo double y una cadena de caracteres de tipo String");
		
		System.out.printf("\nPara poder mostrar un número entero necesitamos usar %% y escribimos una d, este es el resultado %d.",ocho);
		
		System.out.printf("\n\nPara poder mostrar un número con decimales hay que usar %%, un punto . , escrbir el numero de decimales que queremos "
				+ "y añadirle al final una f de float.",pi);
		
		System.out.printf("\n\nPara poder insertar una cadena de caracteres hay que poner %% y una s y esto quedsaria así %s.",hola);
	}

}
