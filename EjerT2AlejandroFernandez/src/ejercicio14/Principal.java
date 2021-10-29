package ejercicio14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0,vendido = 0,totalPor = 100, porcen = 20;
		double sueldo = 1000.0, ventasPor = 0.0,ventas = 0.0,porcentajeC;

		System.out.println("Bienvenido, vamos a calcular el salario mensual de un vendedor");
		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Realizar operación");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			

			System.out.println("¿Cuánto has vendido en total este mes?");
			vendido = Leer.datoInt();
			porcentajeC = porcen / totalPor;
			ventas = sueldo * ventasPor;
			System.out.printf("Las ventas de este empleado son de: %.2f\n",porcentajeC);
			
		} while (opcion != 0);
		System.out.println("Hasta luego");

	}

}
