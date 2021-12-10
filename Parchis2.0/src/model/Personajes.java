package model;

public class Personajes {
	
	private int vidas;
	private int equipo;
	
	public int getEquipo() {
		return equipo;
	}



	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}



	public Personajes (int equipo, int vidas) {
		this.equipo=equipo;
		this.vidas=vidas;
	}



	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	
}
