package byte_bank_composto;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta(100, 200);
		conta.deposita(100);
		System.out.println(conta.saca(200));
		System.out.println(conta.saca(10000));
		System.out.println(conta.getNumero());
		
		conta.saca(101);
		System.out.println(conta.getSaldo());
//		conta.saldo = conta.saldo - 101;
//		System.out.println(conta.saldo);
		
		Conta contaDoJoabe = new Conta(200,100 );
		contaDoJoabe.deposita(100);
		contaDoJoabe.transfere(50, conta);
	
		
		System.out.println(contaDoJoabe.getSaldo());
		System.out.println(conta.getSaldo());
		
		System.out.println(Conta.getTotal());
	}
	
	

}
