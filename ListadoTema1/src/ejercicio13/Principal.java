package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empleado = "John Snow", productoC = "Coca Cola", productoP = "Bolsa de pipas",productoG = "Espada Garra",descG = "Descuento";
		double pipas = 0.40;
		int cantR = 2, cantP = 1,cantG = 1,desc = 20, cien = 100 ;
		double refresco = 0.70;
		double garra = 150;
		double importeR,importeP,importeG,totalTicket,descR,importeDesc;
		
		System.out.println("Bienvenido, en este programa vamos hacer un ticket con una serie de"
				+ " productos y enseñando el nombre\ndel empleado que le ha atendido");
		
		System.out.printf("\nAtendido por: %s\n",empleado);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("\nCANTIDAD\tDESCRIPCIÓN\tPVP\tIMPORTE");
		
		importeR = refresco * cantR;
		
		System.out.printf("\n%d\t\t%s\t%.2f\t%.2f",cantR,productoC,refresco,importeR);
		
		importeP = pipas * cantP;
		
		System.out.printf("\n%d\t\t%s\t%.2f\t%.2f",cantP,productoP,pipas,importeP);
		
		descR = garra * desc / cien;
		
		importeG = garra * cantG;
		
		importeDesc = importeG - descR;
		
		System.out.printf("\n%d\t\t%s\t%.2f\t%.2f\n",cantG,productoG,garra,importeG);
		
		System.out.printf("\n\t\t%s\t-%.2f\t%.2f",descG,descR,importeDesc);
		
		System.out.println("\n-----------------------------------------------");

		totalTicket = importeDesc + importeP + importeR;
		
		System.out.printf("\nTOTAL\t\t\t\t\t%.2f",totalTicket);
		
		//No es necesario declarar todas las variables
		
		

	}

}
