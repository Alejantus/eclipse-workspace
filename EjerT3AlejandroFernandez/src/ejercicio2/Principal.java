package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6,dos=2,positivo=0,negativo=0,par=0,impar=0;
		
		Operaciones op1;
		
		op1=new Operaciones(num);
		
		System.out.println("Bienvenido, en este programa vamos a calcular si un número es par o impar y a saber si es positivo o negativo");
		
		System.out.println("Este número es positivo o es negativo");
		System.out.println(op1.positivoONegativo(positivo, negativo));
		System.out.println("Este número es par o impar");
		System.out.println(op1.parOImpar(par, impar, dos));
		

	}

}
