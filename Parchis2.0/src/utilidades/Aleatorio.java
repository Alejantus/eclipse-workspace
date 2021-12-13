package utilidades;

import java.util.Random;

public class Aleatorio {

	//Atributos
	
	private Random aleatorio = new Random(System.nanoTime());
	
	//Métodos
	
	public int generarRandom(int hasta, int desde) { //Este método genera un aleatorio
		int r = 0;
		
		r = aleatorio.nextInt(hasta-desde+1)+desde;
		
		return r;
	}
	
}
