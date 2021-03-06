
public class Cliente {
	private String cliente;
	private String nome;
	private String enderešo;
	private String bairro;
	private String cidade;
	private double valorDaCompra;
	private int quantidadeDeSacolas;
	
	Cliente(String nome , String enderešo) {
		this.nome = nome;
		this.enderešo = enderešo;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
