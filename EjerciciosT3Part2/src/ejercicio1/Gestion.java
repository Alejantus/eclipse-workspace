package ejercicio1;

public class Gestion {
	
	private int tam = 5;
	Producto lista[]=new Producto[tam];
	
	public Gestion(double precio, String marca, String tamanio, String forma, String calidad) {
	}

	public void mostrarLista(int nPs) {
		for (int i = 0; i < nPs; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public void calcularVentaPublico(int op, int ganancia,int suma) {
		
		for (int i = 0; i < lista.length; i++) {
			//suma = lista[op-1]+lista[op-1]*(50/100);
		}
	}
	
	public void mostrarComprobarFragilidad(boolean b) {
		if(b) {
			System.out.println("El producto es frágil, ten cuidado");
		}else {
			System.out.println("El producto no es frágil, no le pasará nada si se cae");
		}
	}
	
	public boolean comprobarFragilidad(int numF) {
		if(numF==1) {
			return true;
		}else {
			return false;
		}
	}

}
