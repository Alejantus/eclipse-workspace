package controller;

import java.util.Random;

public class Aleatorio {

	Random num = new Random(System.nanoTime());
	public int generarAleatorio(int hasta,int desde) {
		return num.nextInt(hasta - desde + 1) + desde;
	}
}
