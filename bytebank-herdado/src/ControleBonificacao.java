
public class ControleBonificacao {

	private double soma;

	public void registra(Gerente gerente) {
		double bonifica = gerente.getBonificacao();
		this.soma += bonifica;
	}

	public void registra(Funcionario funcionario) {
		double bonifica = funcionario.getBonificacao();
		this.soma += bonifica;
	}

	public void registra(EditorVideo editorVideo) {
		double bonifica = editorVideo.getBonificacao();
		this.soma += bonifica;
	}
	
	public void registra(Designer designer) {
		double bonifica = designer.getBonificacao();
		this.soma += bonifica;
	}
	
	

	public double getSoma() {
		return soma;
	}
}
