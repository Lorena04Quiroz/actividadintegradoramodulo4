package alkewallet;

public class Deposito {
	public Deposito() {}
	public double deposito;
 
	public Deposito(double deposito)
	{
		this.deposito=deposito;
	}
	public double  getDeposito() {
		return this.deposito;
	}
	public void  setDeposito(double deposito) {
		this.deposito=deposito;
	}
	
	public void consultardeposito() {
		System.out.println("Saldo depositado: "+this.getDeposito());
		
	}

}
