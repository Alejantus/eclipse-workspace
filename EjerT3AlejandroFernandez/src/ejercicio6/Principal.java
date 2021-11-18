package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decision=0;
		
		Moneda m1=new Moneda();
		
		System.out.println("Bienvenido, vamos a jugar a cara o cruz");
		do {
		System.out.println("Diga 1 para cara y 2 para cruz");
		decision=Leer.datoInt();
		System.out.println("Vamos a comprobar el ganador");
		System.out.println(m1.comprobarGanador(decision));
		System.out.println(m1.mostrarMoneda(decision));
		} while (decision!=0);

	}

}
