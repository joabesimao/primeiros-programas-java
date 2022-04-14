
public class TestaValores {
public static void main(String[] args) {
	Conta conta = new Conta(1337,24226);
	


	System.out.println(conta.getAgencia());

	Conta conta2 = new Conta(100, 200);
	
	Conta conta3 = new Conta(1200, 12200);
	
	System.out.println(Conta.getTotal());
}
}
