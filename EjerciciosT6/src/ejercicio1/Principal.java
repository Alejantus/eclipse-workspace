package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void comprobarNumeros(int a, int b) throws EcuacionDegenerada {
		if (a == 0 && b != 0) {
			throw new EcuacionDegenerada("No puede haber numeros ");
		}
	}
	
	public static void comprobarRaiz(CEcuacion2Grado ce,int a,int b,int c) throws RaizExc {
		if(ce.calcularDiscriminante(a, b, c)<0) {
			throw new RaizExc("Las raíces son complejas");
		}
		
	}

	public static void main(String[] args) {
		int a, b, c;
		double x1, x2;
		String aux;
		CEcuacion2Grado ec = new CEcuacion2Grado();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduzca el valor de a");
			aux = sc.nextLine();
			a = Integer.parseInt(aux);
			System.out.println("Introduzca el valor de b");
			aux = sc.nextLine();
			b = Integer.parseInt(aux);
			comprobarNumeros(a, b);
			System.out.println("Introduzca el valor de c");
			aux = sc.nextLine();
			c = Integer.parseInt(aux);
			ec.calcularDiscriminante(a, b, c);
			comprobarRaiz(ec, a, b, c);
			x1 = ec.calcularEcX1(a, b, c);
			x2 = ec.calcularEcX2(a, b, c);
			System.out.printf("El resultado de x1 es %.2f\n" ,x1);
			System.out.printf("El resultado de x2 es %.2f" ,x2);
		} catch (EcuacionDegenerada e) {
			System.out.println(e.getMessage());
		} catch (RaizExc re) {
			System.out.println(re.getMessage());
		}
	}
}
