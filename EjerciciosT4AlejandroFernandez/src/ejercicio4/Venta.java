package ejercicio4;

import java.time.LocalDate;
import java.util.Arrays;

public class Venta {

	private LineaDeVenta [] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularTotal() {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].calcularPrecioLinea();
		}
		
		return total;
	}
	
	public void imprimirTicket(String empleado) {
		LocalDate hoy = LocalDate.now();
		
		System.out.println("Atendido por: "+ empleado);
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.printf("Cantidad:\tProducto:\t\tPrecio Unitario:\tPrecioFinal:\n");
		for (int i = 0; i < lista.length; i++) {
			lista[i].imprimirLinea();
		}
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.printf("Precio total: %.2f€\n", calcularTotal());
		System.out.println("Día: "+ hoy);
		System.out.println();
	}
	
	public void listarProductos(int caducidad) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			if(lista[i].getP() instanceof Alimentacion) {
				((Alimentacion) lista[i].getP()).avisarCaducidad(caducidad);
			}
			;
		}
	}
}
