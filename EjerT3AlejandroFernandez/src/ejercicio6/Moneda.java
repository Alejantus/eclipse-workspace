package ejercicio6;

import java.util.Random;

public class Moneda {
	
	
	public static int girarMoneda() {
		Random r=new Random(System.nanoTime());
		int hasta=2,desde=1;
		
		return r.nextInt(hasta-desde+1)+desde;
	}
	
	public String mostrarMoneda(int decision) {
		if (decision==girarMoneda()) {
			return "Has ganado";
		}else {
			return "Siga intentándolo";	
		}
	}
	
	public boolean comprobarGanador(int decision) {
		boolean result;
		if (decision==girarMoneda()) {
			result= true;
		}else {
			result= false;	
		}
		return result;
	}
	
	public void darBienvenida() {
		System.out.println("Bienvenido, vamos a jugar a cara o cruz");
	}
	
	public void seleccionarMoneda() {
		System.out.println("Diga un número entre el 1 cara y el 2 para cruz");
	}
	
	public void comprobarMensaje() {
		System.out.println("Vamos a comprobar quien es el ganador");
	}

}
