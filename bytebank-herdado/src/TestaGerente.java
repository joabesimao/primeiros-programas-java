
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("joabe simao");
		gerente.setSalario(1000);
		gerente.setCpf("123321125");

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());

		gerente.setSenha(123);
		boolean autentificou = gerente.autentica(123);

		System.out.println(autentificou);

		Gerente gerente2 = new Gerente();
		gerente2.setNome("lucas");
		gerente2.setSalario(1);

		gerente2.setSenha(1);
		boolean autenticou2 = gerente2.autentica(5);

		System.out.println(gerente2.getNome());
		System.out.println(gerente2.getSalario());
		System.out.println(autenticou2);
	}
}
