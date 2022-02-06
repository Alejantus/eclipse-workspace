package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreContacto,nombreEmpresa,titulo,email;
		int telefono,dia,mes,anio;
		
		Documento d;
		TarjetaDeVisita t;
		Carta c;
		
		System.out.println("El nombre de la empresa es:");
		nombreEmpresa=Leer.dato();
		System.out.println("El titulo del documento es:");
		titulo=Leer.dato();
		d=new Documento(titulo, nombreEmpresa);
		System.out.println("El nombre de contacto es:");
		nombreContacto=Leer.dato();
		System.out.println("Su telefono es:");
		telefono=Leer.datoInt();
		System.out.println("Y su correo electrónico:");
		email=Leer.dato();
		t = new TarjetaDeVisita(titulo, nombreEmpresa, nombreContacto, telefono, email);
		System.out.println("Diga un dia:");
		dia=Leer.datoInt();
		System.out.println("Diga un mes:");
		mes=Leer.datoInt();
		System.out.println("Diga un año:");
		anio=Leer.datoInt();
		c=new Carta(titulo, nombreEmpresa, dia, mes, anio);
		d.mostrarDatos(titulo, nombreEmpresa);
		t.mostrarDatos(nombreEmpresa, titulo, nombreContacto, telefono, email);
		c.mostrarDatos(nombreEmpresa, titulo, dia, mes, anio);;

	}

}
