package alkewallet;

public class dolar {
	public dolar() {}
	
	public double dolar = 923.33;
	public double saldodolar;
	
	public double  getDolar() {
		return this.dolar;
	}
	
	public double  getSaldoDolar() {
		return this.saldodolar;
	}
	
	public void  setSaldoDolar(double dolar) {
		this.saldodolar=dolar;
	}
	
	public void consultaDolar() {
		System.out.println("Saldo Dolar: "+this.getSaldoDolar());
		
	}
}
