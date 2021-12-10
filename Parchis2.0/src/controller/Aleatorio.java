package controller;

import java.util.Random;

public class Aleatorio {

	Random num = new Random(System.nanoTime());
	public int generarAleatorio() {
		return num.nextInt(6 - 1 + 1) + 1;
	}
}
