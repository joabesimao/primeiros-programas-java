package bitbank;

public class testeReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira:  "  + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
	
	}

}
