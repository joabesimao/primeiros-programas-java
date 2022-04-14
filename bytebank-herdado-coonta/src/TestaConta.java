
public class TestaConta {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(123, 321);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(147, 741);
		contaPoupanca.deposita(200.0);
		//contaPoupanca.transfere(50, contaCorrente);
		
		contaCorrente.transfere(100.0 , contaPoupanca);
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
		//System.out.println(contaCorrente.getSaldo());
		
	}
}
