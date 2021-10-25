package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double kiloMetros = 1500;
		double consumo = 100;
		double litro = 4.5;
		double precioG = 1.64;
		double litroKm,precioL;
		
		System.out.println("Bienvenido, vamos a calcular el gasto de gasolina en un viaje"
				+ " por carretera.");
		
		System.out.printf("Los kilometros a recorrer son %.2f km y cada %.2f km consumo %.2f l"
				+ " y el coste de la gasolina es de %.2f€\n", kiloMetros,consumo,litro,precioG);
		
		litroKm = kiloMetros * litro / consumo;
		
		System.out.printf("El consumo de nuestro coche es de %.2f km",litroKm);
		
		precioL = litroKm * precioG / litro;

		System.out.printf("\nY el precio de la gasolina es de %.2f €/l",precioL);
	}

}
