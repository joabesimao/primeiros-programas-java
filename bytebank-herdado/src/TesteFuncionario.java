
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico sasdad");
		nico.setCpf("123.321.123-30");
		nico.setSalario(2500.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		// System.out.println(nico.getCpf(""));
	}

}
