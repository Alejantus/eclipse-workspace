package ejercicio8b;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ganador = 0, decimo = 0, opcion = 0;
		int desde = 1, hasta = 99999;
		boolean b;

		Sorteo s = new Sorteo(decimo, ganador);

		s.darBienvenida();
		do {
			s.realizarAcciones();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				s.comprarDecimo();
				decimo = Leer.datoInt();
				break;
			case 2:
				s.realizarSorteoMensaje();
				s.realizarSorteo(desde, hasta);
				break;
			case 3:
				s.comprobarDecimoMensaje();
				s.comprobarDecimoMensaje2(s.comprobarDecimo());
				break;
			case 4:
				s.revelarGanadorMensaje();
				s.revelarGanador(ganador);
				s.revelarGanador2Mensaje();
				break;
			case 0:

				break;
			default:
				s.darMensajeError();
				break;
			}
		} while (opcion != 0);
		s.darMensajeDespedida();

	}

}
