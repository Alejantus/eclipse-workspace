package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido, en este programa vamos a calcular el volumen de un cilindro en cm");
		
		double radio=8.0,altura=15.0,volumen=0.0;
		int dos=2;
		
		Cilindro c1=new Cilindro(radio, altura);
		
		System.out.printf("%.2f cm",c1.volumenCilindro(dos, volumen));

	}

}
