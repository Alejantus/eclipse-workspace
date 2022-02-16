package ejercicio6;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(double saldo, String nombreCliente, int idBanco) {
		super(saldo, nombreCliente, idBanco);
	}
	
	public double retirarDinero(double retirada) {
		return super.getSaldo()-retirada;
	}
	
	public double ingresarDinero(double ingreso) {
		double euro=1.0;
		return super.getSaldo()+ingreso+euro;
	}
	

}
