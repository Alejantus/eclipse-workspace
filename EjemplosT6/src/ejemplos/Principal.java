package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// El método dividir no trata la excepción con lo que debe lanzarla (throws)
	public static int dividir(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator; // possible division by zero
	} // end method quotient
	
	public static void comprobarEdad (int edad) throws EdadNegativaExc {
		if(edad<0) {
			throw new EdadNegativaExc("No puede haber edad negativa, de momento");
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); // scanner for input
		boolean continueLoop = true; // determines if more input is needed
		//Ejemplo en clase:
		int num,den,result,edad;
		String aux;
		
		do {
			try // read two numbers and calculate quotient
			{
				/*System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();*/
				
				//Excepción propia
				
				System.out.println("Please enter your age");
				aux = scanner.nextLine();
				edad = Integer.parseInt(aux);
				comprobarEdad(edad);
				
				/*
				System.out.println("Please enter an integer numerator");
				aux = scanner.nextLine();
				num = Integer.parseInt(aux);
				System.out.println("Please enter an integer denominator");
				aux = scanner.nextLine();
				den = Integer.parseInt(aux);
				result = dividir(num, den);
				System.out.printf("\nResult: %d / %d = %d\n", num, den, result);
				continueLoop = false; // input successful; end looping*/
	
				/*int result = dividir(numerator, denominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
				continueLoop = false; // input successful; end looping*/
			} // end try
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine(); // discard input so user can try again
				System.out.println("You must enter integers. Please try again.\n");
			} // end catch
			catch (ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("Zero is an invalid denominator. Please try again.\n");
			} // end catch
			catch (NumberFormatException nf) {
				System.out.println("Solo números animal");
			}
			catch (EdadNegativaExc edadExc) {
				System.out.println(edadExc.getMessage());
			}
		} while (continueLoop); // end do...while
	} // end main

}
