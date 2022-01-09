package controller;

import crud.CrudTablero;
import vista.VistaPartida;
import model.Personajes;
import model.Tablero;
import utilidades.Leer;
import vista.VistaTablero;

public class Partida {
	
	//método para jugar una partida de dos jugadores
	public boolean jugarPartida(Personajes p1, Personajes p2, String[][] matriz, Tablero tablero) { 
		int opcion=0, posiciones=0;
		boolean acabarPartida=false;
		Acciones accion = new Acciones();//instancia un objeto de la clase acción para realizar las acciones
										//de la partida
		VistaPartida vista = new VistaPartida ();
		VistaTablero vistaTablero = new VistaTablero();
				
		
		
		//Menú para que se alternen los turnos del jugador 1 y el jugador 2
		do {
			System.out.println(); //pulir que salga separado con un \n
			System.out.println();
			
			if(p1.isEsSuTurno()==true) {
				System.out.println(p1.getNombre() + " realiza una acción");
			}else {
				System.out.println(p2.getNombre() + " realiza una acción");
			}
			vistaTablero.mostrarTablero(tablero);
			
			System.out.println("Selecciona 1 para lanzar dados y moverte");
			System.out.println("Selecciona 2 para pasar el turno");
			System.out.println("Selecciona 3 para mostrar las vidas");
			System.out.println("Selecciona 4 para salir del juego");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 1:
					//Número de casillas que el jugador va a desplazarse
					posiciones=accion.lanzarDado(); 
					//Muestra las posiciones que se va a mover el jugador
					vista.imprimirDado(posiciones); 
					//Instancia de un objeto para gestionar la lógica del tablero
					CrudTablero crudTablero = new CrudTablero();
					//Comprobación si es el turno del jugador 1 o del jugador 2
					if(p1.isEsSuTurno()) {
						//Cuando mueves el personaje se comprueba si ha llegado a la meta y en caso de que sea
						//así devuelve un boolean
						acabarPartida=crudTablero.moverPersonaje(matriz, posiciones, p1);
						p1.setEsSuTurno(false); //Una vez el jugador 1 realiza una acción se cambia el turno
						p2.setEsSuTurno(true);
					}else{
						//Cuando mueves el personaje se comprueba si ha llegado a la meta y en caso de que sea
						//así devuelve un boolean
						acabarPartida=crudTablero.moverPersonaje(matriz, posiciones, p2);
						p1.setEsSuTurno(true);//Cuando el jugador 2 realiza una acción se cambia el turno
						p2.setEsSuTurno(false);
					}
					
					if(p1.getColumActual()==p2.getColumActual()) { //Comprobación de las posiciones para la pelea
						//Objeto acción llama al método combatir, al cual hay que pasarle dos objetos personajes,
						//el objeto crudtablero que gestiona los métodos del tablero y la matriz de dos filas que es
						//el campo de juego
						accion.combatir(p1, p2, crudTablero, matriz);
					}
					
					break;
					
				case 2:
					//El caso dos sirve para pasar turno y por eso se cambia del turno para un jugador al otro
					if(p1.isEsSuTurno()) {
						
						p1.setEsSuTurno(false);
						p2.setEsSuTurno(true);
					}else {
						p2.setEsSuTurno(false);
						p1.setEsSuTurno(true);
					}
					break;
					
				case 3:
					vista.mostrarVida(p1);
					vista.mostrarVida(p2);
					break;

				case 4: //Para salir del juego en cualquier momento
					System.out.println("Gracias por jugar a nuestro juego. Vuelve cuando quieras");
					break;
					
				default:
					System.out.println("Opción incorrecta");
					break;
					
			}
			if(acabarPartida==true) {  //AQUÍ ME QUEDÉ COMENTANDO, FALTAN MIRAR ATRIBUTOS Y ALGUNAS CLASES Y REDISTRIBUCIÓN DE LAS MISMAS
			return acabarPartida;
			}
		}while(opcion!=4);
		
		return acabarPartida;
		
	}

}
