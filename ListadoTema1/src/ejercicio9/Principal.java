package ejercicio9;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double campNou = 99354, teatro = 600, estadioOlim = 65000;
		double nav, nav2,habi = 1500,estadioF = 15000;
		
		nav = estadioF / habi;
		
		System.out.println("Bienvenido, en ete programa vamos a calcular las navas que tiene el estadio de fútbol\n"
				+ "de mi pueblo que son unas "+nav+" el número de personas en el pueblo son "+habi);
		System.out.println("Y la capacidad del estadio es de "+estadioF);
		
		nav2 = campNou / habi;
		
		System.out.printf("\nLas navas del Camp Nou es de unas %.2f Navas",nav2);
		
		nav2 = estadioOlim / habi;
		
		System.out.printf("\nLas navas  que tiene el estadio olimpico es de %.2f Navas",nav2);
		
		nav2 = teatro / habi;
		
		System.out.printf("\nLas navas del teatro del colegio son %.2f Navas",nav2);

	}

}
