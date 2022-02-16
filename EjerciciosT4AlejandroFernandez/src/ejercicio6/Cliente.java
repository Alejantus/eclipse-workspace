package ejercicio6;

public class Cliente {
	
	private double saldo;

	public Cliente(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [saldo=" + saldo + "]";
	}
	
	public double retirarDinero(double retirada) {
		return saldo-retirada;
	}
	
	public double ingresarDinero(double ingreso) {
		return saldo+ingreso;
	}

}
