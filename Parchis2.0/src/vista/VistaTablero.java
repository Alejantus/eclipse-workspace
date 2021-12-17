package vista;

import model.Tablero;

public class VistaTablero {
	//Método que muestra por consola el tablero. Recibe por parámetro un objeto de la clase Tablero (dicho objeto
	//contiene las filas, columnas y la matriz bidimensional)
	public void mostrarTablero(Tablero tablero) {
		
		int tamMatriz = tablero.getMatriz().length; //Guarda en una variable entera el tamaño del matriz (lo larga que
		//es la fila)
		//int columnas =  tablero.getCOLUMNAS(); //Guarda en una variable de tipo entero las columnas de la matriz
		//int filas = tablero.getFilas();//Guarda en una variable de tipo entero las filas de la matriz
		
		for (int i = 0; i < tamMatriz; i++) { //For que pinta el contenido de la matriz
			for (int j = 0; j < tablero.getMatriz()[i].length; j++) {
				System.out.print(tablero.getMatriz()[i][j]); 
			}
			System.out.println();
		}
	}
	
	

}

