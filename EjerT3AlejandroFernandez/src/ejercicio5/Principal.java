package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min=0,max=0,minPrimi=0,maxPrimi=0,dos=2;
		
		Aleatorios al1=new Aleatorios();
		
		System.out.println("Diga un n�mero m�nimo");
		min=Leer.datoInt();
		System.out.println("Diga un n�mero m�ximo");
		max=Leer.datoInt();
		System.out.println(al1.generarParoImpar(min, max, dos));
	}

}
