package alkewallet;

public class Saldo {
	public Saldo() {}
	public double saldo;
	
	
	public Saldo (double saldo) {
		this.saldo=saldo;
	}
	public double  getSaldo() {
		return this.saldo;
	}
	public void  setSaldo(double deposito) {
		this.saldo=deposito;
	}
	public void consultarsaldo() {
		System.out.println("Saldo: "+this.getSaldo());
		
	}


}
