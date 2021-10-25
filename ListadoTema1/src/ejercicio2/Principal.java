package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Todas las variables van al principio del programa
		
		double ancho = 21;
		double largo  = 50;
		double area;
		double profundidad = 2.50;
		double precio = 1.80;
		double litro = 0.001;
		double volumen = 0,cubico = 0,volLitro = 0;
		
		//Siempre debemos enseniar un mensaje de bienvenida por consola
		
		System.out.println("Bienvenido, este programa te ayudara a calcular el area\n"
				+ ", el volumen y el precio de una piscina olimpica \n");
		
		
		area = ancho * largo;
		
		System.out.printf("El area de la piscina es de %.2f metros cuadrados\n",area);
		
		volumen = area * profundidad;
		
		cubico = volumen * precio;
		
		volLitro = volumen / litro;
		
		System.out.printf("Los litros que necesita la piscina es de %.2f litros\n",volLitro);
				
		System.out.printf("Y es el coste a la hora de llenar la piscina sera de %.2f €",cubico);
		
		
		
		
		

	}

}
