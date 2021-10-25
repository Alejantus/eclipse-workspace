package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double espacioI = 5.5,velocidadC = 3,espacio;
		int tiempo = 20;
		
		System.out.println("Bienvenido, en este programa vamos a calcular el espacio que hay cuando tu madre te lanza la chancla.");
		
		System.out.printf("\nSabemos que el espacio inicial es de %.2f m, teniendo en cuenta que la velocidad de la chancla es de %.2f m/s y esta recorre unos %d segundos",espacioI,velocidadC,tiempo);
		
		espacio = espacioI + velocidadC * tiempo;
		
		System.out.printf("\n\nSabiendo todos los parámetros el espacio que recorre la chancla es de unos %.2f m",espacio);

	}

}
