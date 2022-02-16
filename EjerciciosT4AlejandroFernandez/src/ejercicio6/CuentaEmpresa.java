package ejercicio6;

public class CuentaEmpresa extends Cuenta {

	public CuentaEmpresa(double saldo, String nombreCliente, int idBanco) {
		super(saldo, nombreCliente, idBanco);
	}
	
	public double retirarDinero(double retirada,double cont) {
		double euro=1.0;
		cont++;
		return super.getSaldo()-retirada-euro;
	}
	
	public double ingresarDinero(double ingreso) {
		return super.getSaldo()+ingreso;
	}

}
