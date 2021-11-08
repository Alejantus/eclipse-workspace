package ejercicio14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, numVentas = 0, porcentaje = 20, totalPorcentaje = 100;
		double sueldoTotales = 0.0, sueldo = 1000.0, ventasPor = 0,ventas=100.0;

		System.out.println("Bienvenido, en este programa vamos a calcular lo que cobra un vendedor.");

		do {
			System.out.println("Por favor, pulse un número para seguir con el programa o 0 para salir");
			opcion = Leer.datoInt();
			System.out.println("¿Cuánto has vendido este mes?");
			numVentas = Leer.datoInt();
			ventasPor = (ventas*numVentas)*porcentaje/totalPorcentaje;
			sueldoTotales = sueldo * ventasPor;
			System.out.printf("El sueldo de este vendedor es de: %.2f €\n", sueldoTotales);
		} while (opcion != 0);

	}

}
