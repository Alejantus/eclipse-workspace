package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cuenta = 1000, retirar = 0, restante = 0;
		
		System.out.println("Bienvenido, en este programa vamos a hacer la retirada de dinero de un banco");
		
		System.out.println("Introduzca cuánto dinero va a sacar:");
		
		retirar = Leer.datoInt();
		
		if (cuenta>retirar) {
			System.out.printf("Retirando %d €",retirar);
		}else {
			System.out.println("Error, no es posible sacar el dinero ya que la cantidad es muy alta");
		}
		
		restante = cuenta - retirar;
		
		System.out.printf("\nTe quedan %d € en tu cuenta bancaria",restante);

	}

}
