package dominio;

public class ContaBancaria {
	
	String titular;
	double saldo;
	double valor;
	double saque;
	
	
	public void depositar(double valor) {
		
		
		 saldo += valor;
		 
		
		
	}
	public void sacar(double saque) {
		
		
		if(saldo > saque) {
			
			saldo -=saque;
		
			
		}
		else {
			System.out.println("Saldo insuficiente!!!");
		}
	}
	
	public double exibirSaldo(){
		
		return saldo;
	}
	

}