package model;

import java.util.Arrays;

public class Tablero {
	//Atributos
	
	private final int COLUMNAS = 40; //Es una constante
	private int filas;
	private String matriz [][];
	
	
	//Constructores
	
	public Tablero() {
		super();
	}


	public Tablero(int filas) {
		super();
		this.filas = filas;
		this.matriz = new String [this.filas][this.COLUMNAS];
		this.rellenarTablero();
	}

	//Getters y setters
	

	public int getFilas() {
		return filas;
	}


	public void setFilas(int filas) {
		this.filas = filas;
	}


	public String[][] getMatriz() {
		return matriz;
	}


	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}


	public int getCOLUMNAS() {
		return COLUMNAS;
	}



	@Override
	public String toString() {
		return "ArrayTablero [COLUMNAS=" + COLUMNAS + ", filas=" + filas + ", tablero=" + Arrays.toString(matriz)
				+ "]";
	}


	private void rellenarTablero() { //Método que crea las calles del tablero
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = " _ ";
			}
		}
	}
	
	
	
	
	
}
