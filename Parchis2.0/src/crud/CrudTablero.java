package crud;

import model.Personajes;
import vista.VistaPartida;

public class CrudTablero {
	

	
	//Método que mueve a los personajes por el tablero. Recibe la matriz campo de juego(los carriles),
	//las posiciones que se desplaza el jugador y un objeto jugador. Si el jugador llega a la meta 
	//devuelve el booleano true
	public boolean moverPersonaje(String[][] matriz, int posiciones, Personajes p) { 
		
		boolean acabarPartida=false;
		
		//llamar a limpiar tablero para pintarlo en la nueva posición actual
		this.limpiarTablero(matriz, p);
		//Recorre la fila actual del jugador pasado como parámetro y actualiza la posición  del jugador que
		//llega como parámetro
		if(p.getColumActual()+posiciones<matriz[p.getFilActual()].length) {//Comprobación de que no se ha
			//salido de su carril
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[p.getFilActual()][p.getColumActual()+posiciones] = " O "; //pinta la ficha
					//en la posición actual del jugador más el número de posiciones que recibe el método
					//como parámetro
				}
			}
			//Actuliza el atributo columna del jugador a la nueva posición
			p.setColumActual(p.getColumActual() +posiciones);
		}else{
			//Si no, significa que se ha salido, por tanto ha llegado al final y ha ganado
			VistaPartida vista = new VistaPartida ();
			vista.imprimirGanador(p);
			acabarPartida=true;
		}
		
		return acabarPartida;
			
	}
	//Método para limpiar el tablero
	public void limpiarTablero(String[][] matriz, Personajes p) { 
		//Crea un array con la fila actual del jugador
		String[] fila = new String[matriz[p.getFilActual()].length];
		//rellena la fila creando el carril con la barra baja
		for (int i = 0; i < fila.length; i++) {
			fila[i] = " _ ";
		}
		//sustituye la fila desactualizada de la matriz por la nueva fila sin el jugador (pone todo como barra baja)
		matriz[p.getFilActual()] = fila;
	}
	
}
