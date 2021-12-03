package crud;

public class CrudPersonajes {
	
	public void crearJugadores(int numeroJugadores) {
		
	}
	
	public void cambiarNumJugadores() {//cuando la persona se equivoque y elija 4 y en realidad sean 2
		//pero nosotros no vamos a eliminar jugadores durante la partida
		
	}
	
	public int llevarAInicio() {
		int vidas = 6;
		int posicion = 0;
		if(vidas==0) {
			posicion=0;
		}
		return posicion;
	}
	
	public int moverPersonaje(int posicion) { //este método tiene que llamar a la tirada de dados
		return posicion;
	}
	
	public int sanar() { //este método tiene que llamar a la tirada de dados
		int vidas=0;
		return vidas;
	}
	
	public int reiniciarVida(int vidaActual) {//cuando mueres y vuelves a la casilla de inicio
		//este método llama a llevarAInicio
		return vidaActual=6;
	}

}
