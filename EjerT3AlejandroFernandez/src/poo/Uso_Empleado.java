package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1=new Empleado("Paco Gómez",8500.0,1990,12,17);
		Empleado empleado2=new Empleado("Ana Escacena",10000.0,2002,06,15);
		Empleado empleado3=new Empleado("Alejandro Fernández",9000.0,2002,12,06);
		
		empleado1.suebSueldo(5);
		empleado2.suebSueldo(5);
		empleado3.suebSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+ " Sueldo: "+empleado1.dameSueldo()
		+ " Fecha Alta: "+empleado1.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado2.dameNombre()+ " Sueldo: "+empleado2.dameSueldo()
		+ " Fecha Alta: "+empleado2.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado3.dameNombre()+ " Sueldo: "+empleado3.dameSueldo()
		+ " Fecha Alta: "+empleado3.dameFechaContrato());
	}

}

class Empleado{
	public Empleado(String nom, double sue,int agno,int mes,int dia) {
	
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	
	public String dameNombre() {
		return nombre;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public Date dameFechaContrato() {
		return altaContrato;
	}
	public void suebSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
