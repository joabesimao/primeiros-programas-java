package funcionarioEntrega;
public class TestaDigitador {

	public static void main(String[] args) {

		Digitadores digitador = new Digitadores("joabe", 1010);
		digitador.setSenha(10);
		
		System.out.println(digitador.verificaSenha(10));
	}
}
