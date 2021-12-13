package principal;

import lectura.Leer;
import model.Partida;
import model.Personajes;
import model.Tablero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salida = false;
		Personajes nombrePersonajes = new Personajes();
		
		System.out.println("Introduzca el n�mero de jugadores"); //Comprobar que el número de jugadores sean 2 o 4
		
		int numJugadores = Leer.datoInt();
		
		do {
		switch(numJugadores) {
		
			case 0:
				
				salida=true;
				
				break;
			
			case 2:
				
				Tablero tablero = new Tablero(numJugadores);
				VistaTablero vistaTablero = new VistaTablero();
				vistaTablero.mostrarTablero(tablero);
				
				System.out.println("Seleccione el nombre para el primer personaje");
				nombrePersonajes.mostrarNombres();
				
				int opcion = Leer.datoInt();
				
				Personajes p = new Personajes();
				p.setEquipo(1);
				p.setFilActual(0);
				
				switch(opcion) {
					
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
				nombrePersonajes.mostrarNombres();
				
				int opcion2 = Leer.datoInt();
				
				Personajes p2 = new Personajes();
				p2.setEquipo(2);
				p2.setFilActual(1);
				
				switch(opcion) {
					
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
				
				Partida partida = new Partida();
				
				partida.jugarPartida(p, p2, tablero.getMatriz(), tablero);
				
				
				
				
				break;
		}
		}while(salida);

		
		
		
		
		

	}

}
