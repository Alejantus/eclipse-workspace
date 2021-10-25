package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio = 14.99;
		double desc = 8,cien = 100;
		double resultD,precioF;
				
		System.out.println("Bienvenido, vamos a calcular el precio final de un producto aplicándole su"
				+ "respectivo descuento");
		//En los printf para poder insertar en la cadena de caracteres el % hay que poner %%
		System.out.printf("El valor del producto es %.2f € y el descuento es de %.2f%%\n",precio,desc);
		
		resultD = precio * desc / cien;
		
		precioF = precio - resultD;
		
		System.out.printf("El valor final del producto es de %.2f",precioF);
	}

}
