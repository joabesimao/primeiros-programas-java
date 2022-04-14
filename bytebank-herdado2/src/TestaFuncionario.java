
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("nico");
		nico.setCpf("233233233");
		nico.setSalario(1000);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	
		Gerente simao = new Gerente();
		simao.setNome("simao");
		simao.setSalario(2000);
		simao.setSenha(2222);
		boolean autent = simao.autentica(22);
		
		System.out.println(simao.getNome());
		System.out.println(simao.getBonificacao());
		System.out.println(autent);
	

	}

}
 