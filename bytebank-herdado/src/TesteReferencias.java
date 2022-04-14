public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente();

		gerente.setNome("simao");
		gerente.setSalario(5000.0);

		Funcionario designer = new Designer();
		designer.setSalario(2000.0);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(ev);
		//controle.registra(funcionario);
		controle.registra(designer);

		System.out.println(controle.getSoma());
		System.out.println();

	}
}
