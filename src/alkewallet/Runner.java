package alkewallet;
import java.util.Scanner;


public class Runner {
	public Runner() {}
	
	
	Saldo _saldo= new Saldo();
	Deposito _deposito= new Deposito();
	Retirar_fondo _fondo= new Retirar_fondo();
	dolar _dolar = new dolar();
	
	public int menu() {
		
		int entrada;
		//do{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Que desea hacer:");
		System.out.println("1- Saldo");
		System.out.println("2- Deposito");
		System.out.println("3- Retiro");
		System.out.println("4- saldo en dolares");
		System.out.println("5- Salir");
		entrada=scanner.nextInt();
		//}while(entrada>3 || entrada<1);

		return entrada;	
	}

	public void menu1() {		
		_saldo.consultarsaldo();		
	}
	
	public void menu2() {			
		Scanner scanner = new Scanner(System.in);
		double deposito=0;
		System.out.println("Monto del deposito");
		deposito = Double.parseDouble(scanner.nextLine());
		double saldo = 0;
		
		if(deposito>0) {
			_deposito.setDeposito(deposito);
			_deposito.consultardeposito();
			saldo = _saldo.getSaldo();
			_saldo.setSaldo(saldo+deposito);
		}
		else
		{
			System.out.println("Para realizar recarga de saldo esta debe ser mayor a 0");
		}

		
		
	}
	public void menu3() {
		Scanner scanner = new Scanner(System.in);
		double retiro=0;
		System.out.println("Monto del retiro");
		retiro = Double.parseDouble(scanner.nextLine());
		_fondo.setretiro(retiro);
		double saldo=0;
		saldo=_saldo.getSaldo();
		if(retiro > saldo) {
			System.out.println("No cuenta con el saldo suficiente para el retiro");
		}else
		{
		double total= saldo-retiro;
		_saldo.setSaldo(total);
		}
		
	}
	
	public void menu4() {

		double saldoendolar=0;
		double saldo =0;
		double dolar = 0;
		saldo = _saldo.getSaldo();
		dolar = _dolar.getDolar();
		
		saldoendolar = saldo/dolar;	
		_dolar.setSaldoDolar(saldoendolar);
		_dolar.consultaDolar();		
		
	}
	
	public static void main(String[] args) {

		Runner _runner=new Runner();
		
		String mensaje="";
		int menu=0;
		
		menu=_runner.menu();
		
		while(menu!=5) {
			switch (menu) {
				case 1:
					_runner.menu1();//saldo
					menu=_runner.menu();
					break;
				case 2:
					_runner.menu2();//agregar saldo
					menu=_runner.menu();
					break;
				case 3:
					_runner.menu3();//retirar saldo
					menu=_runner.menu();
					break;
				case 4:
					_runner.menu4();//convertir saldo
					menu=_runner.menu();
					break;
			}
		}	
		
		System.out.println("A finalizado el programa");
	
	}

}
