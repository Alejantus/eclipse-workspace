package ejercicio7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int saldo=1000,ingreso=0,retiro=0,opcion=0;
		String titular="";
		
		CuentaCorriente cc1 = new CuentaCorriente(saldo, titular);
		
		cc1.mostrarBienvenida();
		do {
			cc1.identificarNombreTitular();
			titular=Leer.dato();
			cc1.mostrarNombreTitular();
			cc1.mostrarAcciones();
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("¿Cuánto dinero quieres ingresar?");
				ingreso=Leer.datoInt();
				System.out.printf("Se ha ingresado en su cuenta ");
				System.out.println(cc1.ingresarDinero(ingreso)+"€");
				break;
			case 2:
				System.out.println("¿Cuánto dinero quieres retirar?");
				retiro=Leer.datoInt();
				System.out.printf("Se ha retirado de su cuenta ");
				System.out.println(cc1.retirarDinero(retiro)+"€");
				break;
			case 3:
				System.out.println("El cambio de euros a dólar en su cuenta actual es de");
				System.out.println(cc1.cambiarDolar()+"$");
				break;
			case 4:
				System.out.println("Su sueldo actual es de ");
				System.out.println(cc1.consultarSaldo()+"€");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion!=0);

	}

}
