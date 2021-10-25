package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int unidad = 4;
		double precioP = 15.99;
		double desc = 20, cien = 100,precioT,precioD,precioF;
	
		System.out.println("Bienvenido, en este programa vamos a calcular 4 unidades con el mismo"
				+ " y después se le aplica un descuento del 20%");
		
		precioT = unidad * precioP;
		
		System.out.printf("\nEl precio total de los cuatros productos es de %.2f",precioT);
		
		precioD = (precioT * desc) / cien;
		
		System.out.printf("\nLe hemos aplicado un 20%% al precio del precio y el valor de este de %.2f", precioD);
		
		precioF = precioT - precioD;
		
		System.out.printf("\nEl valor del producto cuando se le hace con el descuento sería de %.2f", precioF);
	}

}
