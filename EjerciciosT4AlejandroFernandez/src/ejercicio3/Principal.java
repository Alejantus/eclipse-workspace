package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cantidadFija = 1000.0,cantidadTransporte=350.75;
		
		Coches c= new Coches("Diesel",140,1461,4,5);
		Motocicletas m=new Motocicletas("Gasoi 98",250,125,2,2);
		Furgonetas f= new Furgonetas("Gasoi 98",300,150,5,4);
		
		System.out.printf("El impuesto que se le cobra a un coche es de ");
		System.out.printf("%.2f €\n",c.calcularImpuesto(cantidadFija));
		System.out.printf("El impuestode una motocileta es de ");
		System.out.printf("%.2f €\n",m.calcularImpuesto(cantidadFija));
		System.out.printf("Y el impuesto que cobran las furgonetas es de ");
		System.out.printf("%.0f €",f.calcularImpuesto(cantidadFija, cantidadTransporte));

	}

}
