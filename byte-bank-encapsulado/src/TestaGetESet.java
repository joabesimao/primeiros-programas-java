
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(222,2222);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		conta.setAgencia(1010);
		System.out.println(conta.getAgencia());
	
	
		Cliente joabe = new Cliente();
		joabe.setNome("simao");
		conta.setTitular(joabe);
		System.out.println(conta.getTitular().getNome());
		
		
	
	}
	
	
	

}
