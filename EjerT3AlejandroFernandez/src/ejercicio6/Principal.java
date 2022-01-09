package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int decision = 0;

		Moneda m1 = new Moneda();

		m1.darBienvenida();
		do {
			m1.seleccionarMoneda();
			decision = Leer.datoInt();
			m1.comprobarMensaje();
			System.out.println(m1.comprobarGanador(decision));
			System.out.println(m1.mostrarMoneda(decision));
		} while (decision != 0);

	}

}
