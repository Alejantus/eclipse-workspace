package model;

public class Personajes {
	
	//Atributos
	
	private int vidas;
	private int equipo;
	private String nombre;
	private int filActual;
	private int columActual;
	private boolean esSuTurno;
	
	//Constructores
	
	public Personajes() {
		super();
		this.esSuTurno=true;
		this.vidas=6;
	}
	
	public Personajes (int equipo, String nombre) {
		this.equipo=equipo;
		this.vidas=6;
		this.nombre=nombre;
		this.esSuTurno=true;
	}

	//Getters y Setters
	
	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public int getFilActual() {
		return filActual;
	}

	public void setFilActual(int filActual) {
		this.filActual = filActual;
	}

	public int getColumActual() {
		return columActual;
	}

	public void setColumActual(int columActual) {
		this.columActual = columActual;
	}

	public boolean isEsSuTurno() {
		return esSuTurno;
	}

	public void setEsSuTurno(boolean esSuTurno) {
		this.esSuTurno = esSuTurno;
	}

	@Override
	public String toString() {
		return "Personajes [vidas=" + vidas + ", equipo=" + equipo + ", nombre=" + nombre + ", filActual=" + filActual
				+ ", columActual=" + columActual + "]";
	}

	
	
	

	
	
	
	
	

	




	
	
}
