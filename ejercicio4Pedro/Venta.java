package ejercicio4;

import java.time.LocalDate;
import java.util.Arrays;



public class Venta {

	//Atributos
	
	private LineaVenta [] lista;

	//Constructor
	
	public Venta(LineaVenta[] lista) {
		super();
		this.lista = lista;
	}

	//Getters y setters
	
	public LineaVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaVenta[] lista) {
		this.lista = lista;
	}

	//Métodos
	
	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	/**
	 * El fin de este método es recorrer el array de líneas de venta que tenemos como atributo y 
	 * sumar en una variable creada dentro del método todos los precios calculados previamente
	 * en la clase LineaVenta
	 * 
	 * @return Este método devuelve el total de la suma de lineas de venta del array.
	 */
	
	public double calcularTotal() {
		double total = 0.0;
		
		for (int i = 0; i < lista.length; i++) {
			total+= lista[i].calcularPrecioLinea();
		}
		return total;
	}
	
	/**
	 * Este método imprime un ticket con toda la información de la compra realizada.
	 * El método imprimirLinea() se encuentra en la clase LineaVenta y se utiliza
	 * para imprimir toda la información de dicha linea.
	 * 
	 * La variable hoy que creamos dentro del método se utiliza para mostrar en el ticket
	 * la fecha en la que se llama a dicho método para imprimirlo, por lo que siempre
	 * será la fecha de hoy.
	 * 
	 * @param empleado Se le pasa una variable tipo String para definir qué empleado le ha atendido.
	 * 
	 */
	
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
	
	/**
	 * En este método hacemos uso del toString() de la clase LineaVenta para listar todos
	 * los productos del array.
	 * También utilizamos un condicional if() para comprobar si existe en el array alguna instancia
	 * de la clase Alimentacion, ya que esta tiene un atributo tipo int donde se indican los días
	 * que faltan para que el producto caduque.
	 * Por lo que si el Producto es de tipo Alimentacion llama al método avisarCaducidad().
	 */
	
	public void listarProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			if(lista[i].getLinea() instanceof Alimentacion) {
				((Alimentacion) lista[i].getLinea()).avisarCaducidad();
			}
			;
		}
	}
	
}
