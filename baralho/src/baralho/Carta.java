package baralho;

public class Carta {

	/* 
	 *Atributos 
	 * */
	private String nome;
	private int numero;
	
	/**
	 * Construtor
	 */
	public Carta(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	/*
	 * Métodos de acesso
	 * */
	public String getNome() {
		return this.nome;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
	
	@Override
	public String toString() {
		return "Carta de nome: " + this.nome + " e de número: " + this.numero;
	}
	
}
