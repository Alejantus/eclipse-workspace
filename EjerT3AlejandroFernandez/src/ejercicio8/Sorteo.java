package ejercicio8;

import java.util.Random;

public class Sorteo {

	private int decimo;
	
	public static int generarDecimos(int desde,int hasta) {
		Random r = new Random(System.nanoTime());
		return r.nextInt(hasta - desde + 1) + desde;
	}
	
	public static int generarGanador(int desde,int hasta) {
		Random r2 = new Random(System.nanoTime());
		return r2.nextInt(hasta - desde + 1) + desde;
	}

	public int comprarDecimo(int decimo) {
		
		return decimo;
	}
	
	public String comprobarDecimo(int hasta,int desde) {
		
		if(decimo==generarGanador(desde, hasta)) {
			return "Ha ganado 1000€";
		}else {
			return "Lo siento, no ha ganado nada";
		}
	}

}
