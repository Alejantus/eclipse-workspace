package controller;

import crud.CrudTablero;
import model.Personajes;
import model.Tablero;
import utilidades.Leer;
import vista.VistaTablero;

public class Partida {
	
	public void jugarPartida(Personajes p1, Personajes p2, String[][] matriz, Tablero tablero) { //método para jugar una partida de dos jugadores
		int opcion=0, posiciones=0;
		Acciones accion = new Acciones();
		
		do {
			System.out.println(); //pulir que salga separado con un \n
			System.out.println();
			System.out.println("Jugador uno es su turno " + p1.isEsSuTurno());
			System.out.println("Jugador dos es su turno " + p2.isEsSuTurno());
			if(p1.isEsSuTurno()==true) {
				System.out.println("Jugador 1 realiza una acción");
			}else {
				System.out.println("Jugador 2 realiza una acción");
			}
			System.out.println("Selecciona 1 para lanzar dados y moverte");
			System.out.println("Selecciona 2 para pasar el turno");
			System.out.println("Selecciona 3 para mostrar tablero");
			System.out.println("Selecciona 4 para salir del juego");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1:
					
					
					posiciones=accion.lanzarDado();
					
					accion.imprimirDado(posiciones);
					
					CrudTablero crudTablero = new CrudTablero();
					
					if(p1.isEsSuTurno()) {
						crudTablero.moverPersonaje(matriz, posiciones, p1);
						p1.setEsSuTurno(false);
						p2.setEsSuTurno(true);
					}else{
						crudTablero.moverPersonaje(matriz, posiciones, p2);
						p1.setEsSuTurno(true);
						p2.setEsSuTurno(false);
					}
					
					if(p1.getColumActual()==p2.getColumActual()) {
						accion.combatir(p1, p2, crudTablero, matriz);
					}
					
					break;
					
				case 2:
					
					if(p1.isEsSuTurno()) {
						
						p1.setEsSuTurno(false);
						p2.setEsSuTurno(true);
					}else {
						p2.setEsSuTurno(false);
						p1.setEsSuTurno(true);
					}
					break;
					
				case 3:
					
					VistaTablero vistaTablero = new VistaTablero();
					vistaTablero.mostrarTablero(tablero);
					break;
					
				case 4:
					break;
					
				default:
					System.out.println("Opción incorrecta");
					break;
			
			}
			
			
		
			
			
			
			
		}while(opcion!=4);
		
		
		
	}

}
