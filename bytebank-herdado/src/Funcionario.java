//nao pode instanciar dessa classe.pq é abstract
public abstract class  Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	public double getBoni() {
		return this.salario;
	}
	// metodo sem corpo,nao há implementação
	public  abstract double  getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String setCpf(String cpf) {
		return this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
