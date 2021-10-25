package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioBasico = 12.0, redElectrica = 3.0, cocheRecinto = 5.50, eurosPersona = 4.50, cenas = 182.50, desc = 6.0;
		double precioFinal = 0.0, subtotalBasico = 0.0, subtotalElectrica = 0.0,subtotalParking = 0.0, subtotalPersonas = 0.0;
		double precioCenas = 0.0,precioFinalDesc = 0.0, eurosBanco = 600.0,eurosRestantes = 0.0;
		int dias = 10, personas = 2, cien = 100;
		String camping = "El juego del Calamar en Java";
		
		System.out.println("Bienvenido, en este programa vamos a calcular el precio final de una estancia en un camping.");
		
		System.out.printf("\n\t%s",camping);
		
		System.out.println("\n---------------------------------------------------");
		
		System.out.printf("\nPrecio Unitario \tCantidad \tSubtotal");
		
		subtotalBasico = precioBasico * dias;
		
		System.out.printf("\n%.2f € \t\t%d días \t%.2f €",precioBasico,dias, subtotalBasico);
		
		subtotalElectrica = redElectrica * dias;
		
		System.out.printf("\n%.2f € \t\t\t%d días \t%.2f €",redElectrica, dias,subtotalElectrica );
		
		subtotalParking = cocheRecinto * dias;
		
		System.out.printf("\n%.2f € \t\t\t%d días \t%.2f €",cocheRecinto, dias,subtotalParking);
		
		subtotalPersonas = eurosPersona * personas;
		
		System.out.printf("\n%.2f € \t\t\t%d personas \t%.2f €",eurosPersona, personas, subtotalPersonas);
		
		precioCenas = cenas / dias;
		
		System.out.printf("\n%.2f € \t\t%d días \t%.2f €",precioCenas,dias,cenas);
		
		System.out.printf("\nDescuento: \t%.0f%%",desc);
		
		precioFinal = subtotalBasico + subtotalElectrica + subtotalParking + subtotalPersonas + cenas;
		
		System.out.printf("\nPrecio final sin descuento: \t\t%.2f €",precioFinal);
		
		precioFinalDesc = (precioFinal * desc) / cien;
		
		precioFinal -= precioFinalDesc;
		
		System.out.printf("\nPrecio final con descuento: \t\t%.2f €",precioFinal);
		
		System.out.println("\n\n---------------------------------------------------");
		
		System.out.println("\tHasta luego, gracias por su estancia");
		
		eurosRestantes = eurosBanco - precioFinal;
		
		System.out.printf("\n\nCuidado solo te quedan %.2f € en el banco. No gastes más de lo necesario este mes.",eurosRestantes);
		
		

	}

}
