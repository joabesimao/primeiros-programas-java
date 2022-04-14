
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("joabe");
		gerente.setCpf("041141125");
		gerente.setSalario(50000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(123);
//		boolean autenticou;
//		if (autenticou ==  {
//			System.out.println(autenticou);
//		}else {
//			System.out.println("senha errada");
//		}
		
		
		System.out.println(gerente.getSenha());
		
	}

}
