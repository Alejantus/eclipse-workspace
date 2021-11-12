package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "";
		int num=0;
		
		Copiado c1 = new Copiado();
		
		System.out.println("Diga un texto: ");
		texto= Leer.dato();
		System.out.println("Diga un número: ");
		num=Leer.datoInt();
		System.out.printf("El resultado es:");
		System.out.println(c1.repetir(num, texto));
		
		

	}

}
