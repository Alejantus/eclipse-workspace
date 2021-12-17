package principal;

import controller.Partida;
import vista.VistaPartida;
import crud.CrudTablero;
import datos.NombrePersonajes;
import model.Personajes;
import model.Tablero;
import utilidades.Aleatorio;
import utilidades.Leer;
import vista.VistaTablero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuarPartida = false, acabarPartida=false;
		String opcionRepetir="";
		int numJugadores = 2;
		NombrePersonajes nombrePersonajes = new NombrePersonajes();
		VistaPartida vista = new VistaPartida ();
		
		vista.imprimirPortada();
		//System.out.println("Introduzca el número de jugadores"); //Comprobar que el número de jugadores sean 2 o 4
		
		//int numJugadores = Leer.datoInt();

		//Menú para jugar con dos jugadores
		
		do {
		switch(numJugadores) {
			
			case 2:
				
				Tablero tablero = new Tablero(numJugadores); //Se instancia el tablero al que se le pasa el número de
				//jugadores
				VistaTablero vistaTablero = new VistaTablero(); 
				vistaTablero.mostrarTablero(tablero); //Muestra el tablero
				
				System.out.println("Seleccione el nombre para el primer personaje");
				vista.mostrarNombres(); //Instancia una clase con el nombre de los personajes y los muestra
				
				int opcion = Leer.datoInt();
				
				Personajes p = new Personajes(); //crea el primer personaje
				p.setEquipo(1);  //Le otorga el equipo uno
				p.setFilActual(0); //lo sitúa en la fila 0 del tablero
				
				switch(opcion) { //Establecer en el jugador uno el nombre del personaje que elija
					
					case 1:
						p.setNombre(nombrePersonajes.getNombres()[0]);
						break;
					
					case 2:
						p.setNombre(nombrePersonajes.getNombres()[1]);
						break;
						
					case 3:
						p.setNombre(nombrePersonajes.getNombres()[2]);
						break;
						
					case 4:
						p.setNombre(nombrePersonajes.getNombres()[3]);
						break;
						
					default:
						System.out.println("Opción incorrecta");
				}
				
				System.out.println("Seleccione el nombre para el segundo personaje");
				vista.mostrarNombres(); //Instancia una clase con el nombre de los personajes y los muestra 
				
				int opcion2 = Leer.datoInt();
				
				while(opcion2 == opcion) {
					System.out.println("Ese personaje ya ha sido elejido, por favor seleccione otro");
					vista.mostrarNombres();
					opcion2 = Leer.datoInt();
				}
				
				Personajes p2 = new Personajes(); //crea el segundo personaje
				p2.setEquipo(2); //Le otorga el equipo dos
				p2.setFilActual(1); //lo sitúa en la fila 1 del tablero
				
				switch(opcion2) { //Establecer en el jugador dos el nombre del personaje que elija
					
					case 1:
						p2.setNombre(nombrePersonajes.getNombres()[0]);
						break;
					
					case 2:
						p2.setNombre(nombrePersonajes.getNombres()[1]);
						break;
						
					case 3:
						p2.setNombre(nombrePersonajes.getNombres()[2]);
						break;
						
					case 4:
						p2.setNombre(nombrePersonajes.getNombres()[3]);
						break;
						
					default:
						System.out.println("Opción incorrecta");
				}
				
				Partida partida = new Partida(); //Instancia un objeto de la clase partida que es donde se desarolla
				//el juego
				acabarPartida=partida.jugarPartida(p, p2, tablero.getMatriz(), tablero); //si el jugador llega a la meta
				//devuelve un boolean para comprobar si el jugador quiere jugar otra vez o terminar la partida
				if(acabarPartida==true) { //comprobación si quiere jugar o no otra partida
					System.out.println("¿Quiere jugar otra partida?");
					System.out.println("Pulse 0 para salir");
					System.out.println("Pulse otra tecla para jugar otra partida");
					opcionRepetir=Leer.dato();
					if(opcionRepetir.equals("0")) {
						continuarPartida=false;
					}else {
						continuarPartida=true;
					}
				}
				
				
			break;
		}
		}while(continuarPartida); //salida del bucle hasta cuando el jugador no quiera seguir jugando

	}

}
