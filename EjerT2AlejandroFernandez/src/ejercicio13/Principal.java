package ejercicio13;

<<<<<<< HEAD
=======
import lectura.Leer;

>>>>>>> b4626e6ec30abfb10d4bd800a215ee596f3f5f4b
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
=======
		
		int tam = 10, num = 0;

		int edades[] = new int[tam];
		
		for (int i = 0; i < tam; i++) {
			System.out.println("Introduzca un número");
			num = Leer.datoInt();
			edades[i] = num;
		}

		// Bucle para cargar el array
		for (int i = 0; i < tam; i++) {
			System.out.println("El número es: "+edades[i]);
		}
>>>>>>> b4626e6ec30abfb10d4bd800a215ee596f3f5f4b

	}

}
