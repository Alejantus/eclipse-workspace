package crud;

import model.Personajes;
import controller.Acciones;

public class CrudTablero {
	

	
	
	public void moverPersonaje(String[][] matriz, int posiciones, Personajes p) { //crudtablero
		//llamar a limpiar tablero para pintarlo en la nueva posición actual
		this.limpiarTablero(matriz, p);
		
		if(p.getColumActual()+posiciones<matriz[p.getFilActual()].length) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[p.getFilActual()][p.getColumActual()+posiciones] = " O ";
				}
			}
			p.setColumActual(p.getColumActual() +posiciones);
		}else{
			Acciones acciones = new Acciones();
			acciones.imprimirGanador(p);
		}
		
		
			
	}
	
	public void limpiarTablero(String[][] matriz, Personajes p) { 
		
		String[] fila = new String[matriz[p.getFilActual()].length];
		
		for (int i = 0; i < fila.length; i++) {
			fila[i] = " _ ";
		}
		matriz[p.getFilActual()] = fila;
	}
	
}
