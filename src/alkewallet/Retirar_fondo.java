package alkewallet;

public class Retirar_fondo {
	public Retirar_fondo() {}
	public double retiro;
	
	public Retirar_fondo(double Retiro) {
		this.retiro=Retiro;
	
	}
	public double  getfondo() {
		return this.retiro;
	}
	public void  setretiro(double deposito) {
		this.retiro=deposito;
	}
	public void consultarretiro() {
		System.out.println("A retirado: "+this.getfondo());
		
	}

}
