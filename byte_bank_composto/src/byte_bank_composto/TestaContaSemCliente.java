package byte_bank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(300,400);
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
