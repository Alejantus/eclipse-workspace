package ejercicio15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion =0,saldo = 100000,retirar=0,entradas=0,entrada=20, ingreso =0;
		
		System.out.println("Bienvenido, vamos a hacer la interfaz de un cajero ");
		
		do {			
			System.out.println("¿Qué operación quieres realizar?");
			System.out.println("1. Ver saldo");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Comprar entradas");
			System.out.println("4. Ingresar dinero");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Su saldo es de: "+saldo+" €");
				break;				
			case 2:
				System.out.println("¿Cuánto dinero quieres retirar?");
				retirar = Leer.datoInt();
				saldo = saldo - retirar;
				System.out.println("Su saldo actual es de: "+saldo+" €");
				break;
			case 3:
				System.out.println("¿Cuántas entradas quieres?");
				entradas = Leer.datoInt();
				saldo = saldo - entrada * entradas;
				System.out.println("Su saldo actual es de: "+saldo+" €");
				break;
			case 4:
				System.out.println("¿Cuánto quieres ingresar?");
				ingreso = Leer.datoInt();
				saldo = saldo + ingreso;
				System.out.println("Su saldo actual es de: "+saldo+" €");
				break;
			case 0:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Error, no existe dicha operación");
				break;
			}
		} while (opcion!=0);
		
		

	}

}
