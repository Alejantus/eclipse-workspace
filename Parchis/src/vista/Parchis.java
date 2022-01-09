package es.uned2013.parchis;

import java.util.*;
/**
 * Clase principal del programa. Configura el juego y 
 * establece el valor de las variables principales
 * mediante un diálogo con el usuario a través de la
 * consola.
 * @author alef
 *
 */
/*NO EN REQUISITOS ACTUALES. POSIBLES MEJORAS.
enum Idioma { INGLES, ESPANOL }
enum Modo { NORMAL, PRUEBA }
*/
public class Parchis {
	/*NO EN REQUISITOS ACTUALES. POSIBLES MEJORAS.
	Idioma idioma = Idioma.ESPANOL; //Por defecto en español.
	Modo modo = Modo.NORMAL; //Por defecto modo NORMAL.
	*/
	private int jugadoresJuego; //Nº de jugadores de la partida actual.
	private ArrayList<Ficha> fichasJuego = new ArrayList<Ficha>(); //Fichas de la partida actual.
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>(); //Jugadores de la partida actual.
	private Jugador jugadorTurno; //Jugador en turno. Va cambiando rotativamente a lo largo de la partida.
	private Tablero tablero; //Tablero de la partida actual. 
	private ArrayList<Colores> coloresJuego = new ArrayList<Colores>(); //Colores de la partida actual.
	
	public Parchis(){
		/*
		 * CONSTRUCTOR. Según la clase Driver sin argumentos.
		 * Muestra una imagen en consola (formada por caracteres),
		 * presentando el juego.
		 * Según la estructura de la clase Driver proporcionada para la
		 * práctica debería mostrar en consola un mensaje 
		 * solicitando el número de jugadores.
		 */
		this.jugadoresJuego=0;
		
		System.out.println("Bienvenido al juego del Parch�s UNED 2013.");
		System.out.println("�Cu�ntos jugadores participar�n? (2,3,4).");
	}
	
	/* NO EN REQUISITOS ACTUALES. POSIBLES MEJORAS.
	public void eligeModo(){
		
	}
	
	public void eligeIdioma(){
		
	}
	*/
	
	public void numJugadores(int jugs){
		/* Establece la variable participantes
		 * Si el número de jugadores no es 2,3 o 4 informa al 
		 * usuario y le pide de nuevo el número de jugadores.
		 */
		
		
		while ((jugs < 2) || (jugs > 4)){
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("El número de participantes no es correcto.");
			System.out.println("�Cu�ntos jugadores participar�n? (2,3,4).");
			
			try {
				jugs = entrada.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No es un n�mero v�lido");
			}
			finally{
				entrada.close(); 
			}
		}
		
		
		 /* Selecciona un color para cada jugador y los almacena
		 * en la variable coloresJuego.
		 * 
		 * ficha(int id, Color color) ->
		 * 
		 * Crea las fichas a partir de los colores o jugadores 
		 * en juego creando un identificador único para cada
		 * una de ellas. (1-AMARILLO,2-AMARILLO,3-AMARILLO,
		 * 4-AMARILLO,5-AZUL,6-AZUL,7-AZUL,8-AZUL,9-ROJO,10-ROJO,
		 * 11-ROJO,12-ROJO,13-VERDE,14-VERDE,15-VERDE,16-VERDE).
		 * y las almacena en el atributo fichasJuego.
		 * 
		 * jugador(tab Tablero,col Color, nombre String, fic Fichas[]) ->
		 * 
		 * Crea los jugadores y les pasa sus fichas, el nombre
		 * del jugador puede ser el del color de sus fichas.
		 * También les pasa una referencia al tablero de juego
		 * actual.
		 * 
		 * tablero(col[] Color) ->
		 * 
		 * Crea el tablero y asigna a cada ficha en juego la
		 * casilla de inicio correspondiente.
		 * 
		 * Llama a elegirPrimero()
		 * 
		 * Llama a jugar()
		 */
		
	}
	
	public void jugar(){
		/*
		 * Mientras Tablero.juegofinalizado==false
		 * jugadorTurno.tirardado()
		 * jugadorTurno.moverFicha()
		 * jugadorTurno.hayMovimientoAdicional()
		 * jugadorTurno.tiradaAdicional()
		 * 
		 * Cuando el jeugo finaliza muestra un mensaje en consola
		 * indicando que el juego ha finalizado y el nombre del 
		 * jugador ganador. 
		 */
	}
	
	public void elegirPrimero(){
		/*
		 * Llama al método tirarDado():int de caja jugador y 
		 * muestra en consola el resultado de cada tirada.
		 * El jugador con un número mayor en la tirada pasará
		 * a ocupar el atributo jugadorTurno. En caso de empate
		 * se puede volver a tirar hasta que haya desempate 
		 * o decidirlo por orden alfabético por ejemplo.
		 * El resto de los jugadores se ordenarán en el 
		 * ArrayList jugadores siguiendo el orden establecido
		 * en la tirada.
		 */
	}
	
	public void elegirSiguiente(){
		/*
		 * Elige el nuevo jugadorTurno. Será el siguiente en el
		 * ArrayList jugadores. Si es el último del ArrayList 
		 * el turno pasará al primero.
		 */
	}
	
	//para pruebas
	/*public static void main(String args[]){
		Parchis parchis = new Parchis();
		parchis.numJugadores(2);
	}*/
	
}
