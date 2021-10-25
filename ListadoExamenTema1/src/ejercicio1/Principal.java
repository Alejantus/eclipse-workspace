package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Los Sysos hay que hacerlo mas cortos y hay que poner un mensaje de despedida, no olvidarme de las tildes
		
		double costeF = 10000, ganV = 15, impuesto = 12.5, cien = 100;
		double precioF,precioG,precioI;
		
		System.out.println("Bienvenido, en este programa vamos a calcular el precio final de venta de un automovil");
		
		System.out.printf("\nEl coste de fabricación es de %.2f, el vendedor obtendrá una ganancia del %.0f%% en cada\n"
				+ "coche que venda, a su vez se le aplicara un impuesto del %.1f%%.",costeF,ganV,impuesto);
		
		precioG = (costeF * ganV) / cien;
		
		System.out.printf("\n\nLas ganancias que va obtener el vendedor es de %.2f€\n",precioG);
		
		precioI = (costeF * impuesto) / cien;
		
		System.out.printf("\nY el impuesto a pagar es de %.2f€",precioI);
		
		precioF = costeF + precioG + precioI;
		
		System.out.printf("\n\nSabemos que el coste de fabricación de un automovil es de %.0f, "
				+ "pero claro el vendedor obtendrá una ganancia del %.0f%% al vender este\nautomovil que este sería"
				+ " %.2f€, y por último el comprador tendrá que pagar\nun impuesto del %.1f%% que en este caso"
				+ " es de %.2f€,así que el comprador tendrá que pagar %.2f€",costeF,ganV,precioG,impuesto,precioI,precioF);

	}

}
