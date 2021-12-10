package vista;

public class OpcionesMenus { //Aquí vienen todas las opciones para el usuario
	
	//Menu que sale al principio
	
	public void imprimirInicio() {
		System.out.println("¿Qué acción quiere realizar?");
		System.out.println("(1).Nueva partida");
		System.out.println("(0).Salir");
	}
	
	//Menu de la partida
	
	public void imprimirPartida() {
		System.out.println("¿Qué quieres hacer?");
		System.out.println("(1).Crear jugadores");
		System.out.println("(0).Salir");
	}
	
	//Informacion del jugador
	
	public void imprimirJugador() {
		
	}
	
	//Acciones que va a realizar el jugador
	
	public void imprimirAcciones() {
		System.out.println("¿Qué quieres realizar?");
		System.out.println("(1).Lanzar dado");
		System.out.println("(2).Mostrar perfil");
	}
	
	//Menu cuando mueres
	
	public void morirPersonaje() {
		System.out.println("Vaya, has muerto");
	}
	
	//Menu cuando matas a un jugador
	
	public void matarJugador() {
		System.out.println("Has matado a ");
	}
	
	//Menu cuando revives
	
	public void revivirPersonaje() {
		System.out.println("Vaya, has revivido, tus vidas han vuelto a");
	}
	
	//Menu cuanto has sacado
	
	public void imprimirNumeroDado() {
		System.out.println("Has sacado un");
	}
	
	//Menu para poder reiniciar el juego
	
	public void reiniciarPartida() {
		System.out.println("¿Quiere jugar otra partida?");
		System.out.println("(1).Jugar otra partida");
		System.out.println("(0).Salir");
	}

}
