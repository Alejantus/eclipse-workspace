package poo;

import	javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche = new Coche();
		
		miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(miCoche.dime_datos_generales());
		
		System.out.println(miCoche.dime_color());
		
		miCoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(miCoche.dime_asientos());
		
		miCoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(miCoche.dime_climatizador());
		
		System.out.println(miCoche.dime_peso());
		
		System.out.println("El precio final de coche es "+miCoche.precio_coche());
	}

}
