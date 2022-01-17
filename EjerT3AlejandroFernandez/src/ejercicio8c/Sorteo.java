package ejercicio8c;

import java.util.Random;

public class Sorteo {

	private Decimo d;
	private int ganador;

	public Sorteo(Decimo d, int ganador) {
		super();
		this.d = d;
		this.ganador = ganador;
	}

	public Sorteo() {

	}

	public Decimo getD() {
		return d;
	}

	public void setD(Decimo d) {
		this.d = d;
	}

	public int getGanador() {
		return ganador;
	}

	public void setGanador(int ganador) {
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "Sorteo [d=" + d + ", ganador=" + ganador + "]";
	}

	public int comprarDecimo(int hasta, int desde) {
		Random r = new Random(System.nanoTime());

		return r.nextInt(hasta - desde + 1) + desde;

	}

	public int sortear(int hasta, int desde) {
		return comprarDecimo(hasta, desde);
	}

	public boolean comprobarDecimo(int num,int premio) {
		if (num==premio) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarComprobarDecimo(boolean b) {
		if (b) {
			System.out.println("Has ganado el primer premio");
		} else {
			System.out.println("Vaya que pena");
		}
	}

}
