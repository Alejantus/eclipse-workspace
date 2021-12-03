package controller;

import java.util.Random;

public class Aleatorio {

	Random num = new Random(System.nanoTime());
	int hasta = 6,desde=1;
	public int generarAleatorio() {
		return num.nextInt(hasta - desde + 1) + desde;
	}
}
