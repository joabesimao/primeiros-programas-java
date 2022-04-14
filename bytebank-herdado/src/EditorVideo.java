
public class EditorVideo extends Funcionario {

	private double soma;
	
	@Override
	public double getBonificacao() {
		return  100;
	}

	public void registra(Funcionario funcionario) {
		double bonifica = funcionario.getBonificacao();
		this.soma = this.soma + bonifica;
	}

	public double getSoma() {
		return soma;
	}
}
