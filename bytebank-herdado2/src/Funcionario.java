
public class Funcionario{

	private String nome;
	private String cpf;
	protected double salario;
	
	
	
	
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public String getNome() {
		return nome;
	}
//	public int getSenha() {
//		return senha;
//	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}