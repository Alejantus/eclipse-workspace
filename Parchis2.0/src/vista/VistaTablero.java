package vista;

import model.Tablero;

public class VistaTablero {

	public void mostrarTablero(Tablero tablero) {
		
		int tamMatriz = tablero.getMatriz().length;
		int columnas =  tablero.getCOLUMNAS();
		int filas = tablero.getFilas();
		
		for (int i = 0; i < tamMatriz; i++) {
			for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
				System.out.print(tablero.getMatriz()[i][j]); 
			}
			System.out.println();
		}
	}
	
	

}

