package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int litro = 8;
		int hora = 24;
		double minSeg = 3600;
		double mil = 1000;
		double conversion, litroSeg;
		
		System.out.println("Bienvenido, en este programa vamos a calcular los metros\n"
				+ "cubicos que tiene un deposito sabiendo que un pozo tiene un caudal de "+litro+" l/s\nsi esta conectado solo "+hora+" horas");
		
		litroSeg = litro * (hora*minSeg);
		
		System.out.printf("\nLos litros por segundo que se sacan del pozo son de %.0f litros\n",litroSeg);
		
		conversion = litroSeg / mil;
		
		System.out.printf("\nLa capacidad del deposito es de %.2f metros cúbicos",conversion);
		
		

	}

}
