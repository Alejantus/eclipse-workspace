package ejercicioInterface1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio=200.0,sueldo=1600.50;
		int iva=15;
		
		Producto p1=new Producto("Nike");
		Trabajador t1=new Trabajador("Alejandro");
		
		System.out.println(p1.calculoIva(precio, iva));
		System.out.println(t1.calculoIrpf(sueldo));
	}

}
