package funcionarioEntrega;

public class MotoqueirosEMotoristas extends FuncionariosDasEntregas {

	private String placaDaMoto;
	private double numeroHabilitacao;

	MotoqueirosEMotoristas(String nome) {
		super(nome);
	}

	public String getPlacaDaMoto() {
		return placaDaMoto;
	}

	public void setPlacaDaMoto(String placaDaMoto) {
		this.placaDaMoto = placaDaMoto;
	}

	public double getNumeroHabilitacao() {
		return numeroHabilitacao;
	}

	public void setNumeroHabilitacao(double numeroHabilitacao) {
		this.numeroHabilitacao = numeroHabilitacao;
	}
	
}
