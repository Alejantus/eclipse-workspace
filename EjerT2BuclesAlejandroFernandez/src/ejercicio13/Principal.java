package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas = 0, horasDia = 40, horasEx = 0;
		double sueldo = 16.0, sueldoEx = 20.0, sueldoTotal = 0;

		System.out.println("Bienvenido, vamos a calcular el salario semanal de un trabajador");

		do {
			System.out.println("¿Cuántas horas has trabajado o 0 para salir?");
			horas = Leer.datoInt();
			if (horas < horasDia) {
				sueldoTotal = horas * sueldo;
			} else {
				horasEx = horas - horasDia;
				sueldoTotal = (sueldo * horasDia) + (horasEx * sueldoEx);
			}
			if (sueldoTotal != 0) {
				System.out.printf("Tu sueldo es de %.0f €\n", sueldoTotal);
			}
		} while (horas != 0);

		System.out.println("Adiós");

	}

}
