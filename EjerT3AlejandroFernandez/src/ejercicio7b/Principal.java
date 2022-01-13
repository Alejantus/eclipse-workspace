package ejercicio7b;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c;
		Oficina o;
		double saldo,cant;
		String nombreTitular;
		boolean op;
		
		
		System.out.println("Hola");
		System.out.println("Diga saldo");
		saldo=Leer.datoDouble();
		System.out.println("Diga nombre del titular");
		nombreTitular=Leer.dato();
		
		c=new Cuenta(saldo, nombreTitular);
		
		o=new Oficina(c,1);
		
		//1.Ingresar
		//Sin variable
		System.out.println("Diga dinero a ingresar");
		o.ingresar(Leer.datoDouble());
		
		//Con variable 
		System.out.println("Diga dinero a ingresar");
		cant=Leer.datoDouble();
		o.ingresar(cant);
		
		//2.Retirar Opcion A
		System.out.println("Diga dinero a retirar");
		cant = Leer.datoDouble();
		op=o.retirar(cant);
		o.imprimirMensaje(op);
		
		//2.Retirar Opcion B
		System.out.println("Diga dinero a retirar");
		cant=Leer.datoDouble();
		o.imprimirMensaje(o.retirar(cant));
	}

}
