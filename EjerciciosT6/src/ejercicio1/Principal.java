package ejercicio1;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a, b, c;
		String aux;
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduzca el valor de a");
				aux = sc.nextLine();
				a = Integer.parseInt(aux);
				System.out.println("Introduzca el valor de b");
				aux = sc.nextLine();
				b = Integer.parseInt(aux);
				System.out.println("Introduzca el valor de c");
				aux = sc.nextLine();
				c = Integer.parseInt(aux);

				CEcuacion2Grado ec = new CEcuacion2Grado(a, b, c);

				ec.comprobarNumeros(a, b);
				ec.calcularDiscriminante();
				for (double sol : ec.calcularEc()) {
					System.out.printf("Solución: %.2f\n", sol);
				}
				seguir = false;
			} catch (NumberFormatException n) {
				System.out.println("Solo se permiten numeros enteros");
			} catch (ArithmeticException ar) {
				System.out.println("No se permiten ceros como resultado");
			} catch (EcuacionDegenerada e) {
				System.out.println(e.getMessage());
			} catch (RaizExc re) {
				System.out.println(re.getMessage());
			}
		} while (seguir);
	}
}
