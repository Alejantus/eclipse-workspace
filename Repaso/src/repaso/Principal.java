package repaso;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0, tam = 0, op = 0;
		String empleados[];

		System.out.println("Bienvenido,esto es un programa de empleados");
		do {
			System.out.println("Por favor, pulse un numero que no sea 0");
			tam = Leer.datoInt();
			if (tam != 0) {
				empleados = new String[tam];
				System.out.println("\nQue accion quieres realizar");
				System.out.println("1. Añadir empleados");
				System.out.println("2. Ver empleados");
				System.out.println("3. Ver empleado por posicion");
				System.out.println("0. Salir");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					for (int i = 0; i < empleados.length; i++) {
						System.out.println("Introduzca el nombre del empleado");
						empleados[i] = Leer.dato();
					}
					break;
				case 2:
					for (int i = 0; i < empleados.length; i++) {
						System.out.println(empleados[i]);
					}
					break;
				case 3:
					System.out.println("Diga que posicion quiere ver");
					op = Leer.datoInt();
					if (op < empleados.length + 1) {
						System.out.println(empleados[op - 1]);
					}
					break;
				case 0:
					System.out.println("Hasta luego");
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			}else {
				System.out.println("Hasta luego");
			}
		} while (opcion != 0);

	}

}
