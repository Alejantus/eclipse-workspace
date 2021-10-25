package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Alejandro Fernandez", fecha = "05/10/2021",burgerS = "Mc Royal";
		double patatasM = 2.50, bebidaM = 3.0, burger = 5.0, entregado = 15.0,cant = 1.0;
		double totalF = 0.0, cambio = 0.0;
		
		System.out.println("Bienvenido,en este programa vamos a recrear/imitar un ticket del McDonalds");
		
		System.out.printf("\nBienvenido, le va a atender %s:\n",nombre);
		
		System.out.printf("\nSu pedido se ha realizado el %s\n\n",fecha);
		
		System.out.println("----------------------------------------");
		
		System.out.printf("\nUND\tARTICULO\t\tTOTAL");
		
		System.out.printf("\n%.0f\tPatatas Medianas\t%.2f €",cant,patatasM);
		
		System.out.printf("\n%.0f\tBebida Mediana\t\t%.2f €",cant,bebidaM);
		
		System.out.printf("\n%.0f\tHamburguesa %s\t%.2f €\n",cant,burgerS,burger);
		
		totalF = patatasM + bebidaM + burger;
		
		System.out.printf("\nTOTAL:\t\t\t\t%.2f €\n",totalF);
		
		System.out.printf("ENTREGADO:\t\t\t%.2f €\n",entregado);
		
		cambio = entregado - totalF;
		
		System.out.printf("CAMBIO:\t\t\t\t%.2f €\n\n",cambio);
		
		System.out.println("----------------------------------------\n");

		System.out.println("Hasta luego, que aproveche");
	}

}
