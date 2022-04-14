package funcionarioEntrega;

public class Digitadores extends FuncionariosDasEntregas {

	private double senha;

	Digitadores(String nome,double cpf) {
		super(nome);
		
		System.out.println("novo funcionario");
		System.out.println(nome);
	}

	void digitadores(int senha) {
		this.senha = senha;
	}

	public  int verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("ok");
		} else {
			System.out.println("not");
		}
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
