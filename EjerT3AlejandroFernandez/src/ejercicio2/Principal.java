package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, dos = 2;

		Operaciones op1;

		op1 = new Operaciones();

		System.out.println(
				"Bienvenido, en este programa vamos a calcular si un n�mero es par o impar y a saber si es positivo o negativo");
		do {
			System.out.println("Diga un n�mero");
			num = Leer.datoInt();
			System.out.println("Este n�mero es positivo o es negativo");
			System.out.println(op1.positivoONegativo(num));
			System.out.println("Este n�mero es par o impar");
			System.out.println(op1.parOImpar(dos, num));
		} while (num != 0);

	}

}
