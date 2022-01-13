package ejercicio8b;

import java.util.Random;

public class Sorteo {
	
	Random r = new Random(System.nanoTime());
	
	private int decimo;
	private int ganador;
	
	public int getDecimo() {
		return decimo;
	}
	public void setDecimo(int decimo) {
		this.decimo = decimo;
	}
	public int getGanador() {
		return ganador;
	}
	public void setGanador(int ganador) {
		this.ganador = ganador;
	}
	public Sorteo(int decimo, int ganador) {
		super();
		this.decimo = decimo;
		this.ganador = ganador;
	}
	public Sorteo() {
		
	}
	@Override
	public String toString() {
		return "Sorteo [decimo=" + decimo + ", ganador=" + ganador + "]";
	}
	
	//Métodos
	
	public void realizarSorteo(int desde,int hasta) {
		setGanador(r.nextInt(hasta-desde+1)+desde);
	}
	
	public boolean comprobarDecimo() {
		if(getDecimo()==getGanador()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int revelarGanador(int ganador) {
		return getGanador();
	}
	
	//Mensajes
	
	public void darBienvenida() {
		System.out.println("Bienvenido, a nuestro sorteo de navidad.");
	}
	
	public void realizarAcciones() {
		System.out.println("¿Qué quieres realizar?");
		System.out.println("1.Comprar un décimo");
		System.out.println("2.Realizar sorteo");
		System.out.println("3.Comprobar décimo");
		System.out.println("4.Mostrar ganador");
		System.out.println("0.Salir");
	}
	
	public void comprarDecimo() {
		System.out.println("¿Qué número quieres comprar?");
	}
	
	public void realizarSorteoMensaje() {
		System.out.println("Vamos a realizar el sorteo.");
		System.out.println("A ver si tienes suerte");
	}
	
	public void comprobarDecimoMensaje() {
		System.out.println("Vamos a comprobar tu decimo");
	}
	
	public void comprobarDecimoMensaje2(boolean b) {
		if(b) {
		System.out.println("Te ha tocado el premio gordo");
		}else {
			System.out.println("Vaya,que lastima");
		}
	}
	
	public void revelarGanadorMensaje() {
		System.out.println("Y el ganador del sorteo es el: ");
	}
	
	public void revelarGanador2Mensaje() {
		System.out.println("Felicidades!!!!!");
	}
	
	public void darMensajeError() {
		System.out.println("Opción incorrecta");
	}
	
	public void darMensajeDespedida() {
		System.out.println("Hasta luego");
	}
}
