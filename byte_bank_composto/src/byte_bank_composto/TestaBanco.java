package byte_bank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulo silveira";
		paulo.cpf = "222.222.222";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta(10,25);
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
		
	}

}
