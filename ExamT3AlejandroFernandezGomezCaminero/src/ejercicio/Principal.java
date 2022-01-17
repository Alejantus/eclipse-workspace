package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0,opcionMes=0,mes=0,hasta=50000,desde=175000;
		double libras = 0.88;
		
		
		Piso p = new Piso("C/La Encina",500,true,125000);
		
		Inmobilaria i = new Inmobilaria();
			
		System.out.println("Bienvenido, a nuestra inmobiliaria");
		
		do {
			System.out.println("¿Qué acción quieres realizar?");
			System.out.println("1. Rellenar con aleatorios");
			System.out.println("2. Calcular precio de venta");
			System.out.println("3. Calcular precio por metro cuadrado");
			System.out.println("4. Cambio de euro a libra");
			System.out.println("5. Mostrar datos del piso");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Vamos a rellenar el array");
				i.rellenarArray(hasta,desde);
				break;
			case 2:
				System.out.println("Vamos a calcular el precio de venta de nuestro piso");
				System.out.println("¿Qué mes quieres realizar la operacion?");
				System.out.println("1. Julio");
				System.out.println("2. Agosto");
				System.out.println("3. Septiembre");
				System.out.println("4. Octubre");
				System.out.println("5. Noviembre");
				System.out.println("6. Diciembre");
				opcionMes = Leer.datoInt();
				i.calcularPrecioMetro(opcionMes);
				break;
			case 3:
				System.out.println("Vamos a calcular el precio por metro cuadrado");
				System.out.println(i.calcularPrecioMetro(mes));
				break;
			case 4:
				System.out.println("Vamos a convertir de euros a libras");
				System.out.println(i.cambiarALibras(libras));
				break;
			case 5:
				i.mostrarDatos();
				break;
			case 0:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opción incorrecto");
				break;
			}
		} while (opcion!=0);

	}

}
