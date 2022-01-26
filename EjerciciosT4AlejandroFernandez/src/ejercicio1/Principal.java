package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int porcentaje = 15;
		
		Ordenador o = new Ordenador(456.34, 3.5, 500);
		Tablet t= new Tablet(349.25,2.6,250,120.0);
		Portatil p= new Portatil(500.50,5.0,2000,20);
		
		System.out.println("El precio de venta del ordenador, de la tablet y del portátil es de:");
		System.out.printf("%.2f €,%.2f €,%.2f €\n",o.getprecioBase(),t.getprecioBase(),p.getprecioBase());
		System.out.println("El precio de venta de la tablet más el seguro es:");
		System.out.printf("%.2f €\n",t.calcularPrecioVenta(porcentaje));
		System.out.println("Y el precio de venta del portátil con el descuento es de:");
		System.out.printf("%.2f €\n",p.calcularPrecioVenta(porcentaje));
	}

}
