
public class Cliente {
	private String cliente;
	private String nome;
	private String endere�o;
	private String bairro;
	private String cidade;
	private double valorDaCompra;
	private int quantidadeDeSacolas;
	
	Cliente(String nome , String endere�o) {
		this.nome = nome;
		this.endere�o = endere�o;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}

	public int getQuantidadeDeSacolas() {
		return quantidadeDeSacolas;
	}

	public void setQuantidadeDeSacolas(int quantidadeDeSacolas) {
		this.quantidadeDeSacolas = quantidadeDeSacolas;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	
}
