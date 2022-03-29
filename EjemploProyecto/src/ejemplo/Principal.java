package ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=30,max=120;
		Luchador ganador;
		List<Luchador> lista = new ArrayList<Luchador>();
		Random r = new Random(System.nanoTime());
		String nombre = "Rey Misterio";
		

		/*
		 * () -> System.out.println("Hola");
		 * (a, b) -> a + b;
		 * public double sumar(double a, double b){
		 * 	return a+b;
		 * }
		 */
		
		Supplier<Double> crearRandom = () -> min + (max-min) * r.nextDouble();
		//Supplier<Luchador> generarLuchador = () -> 
		
	
	
	}

}
