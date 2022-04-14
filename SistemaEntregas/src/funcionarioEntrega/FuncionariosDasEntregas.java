package funcionarioEntrega;

public class FuncionariosDasEntregas {
	
	private String nome;
	private double cpf;
	

	
	FuncionariosDasEntregas(String nome){
		this.nome = nome; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

}
