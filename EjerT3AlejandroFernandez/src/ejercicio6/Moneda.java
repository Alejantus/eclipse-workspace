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

}
