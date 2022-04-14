
public class TabelaMelhorada {

	private String nomeDoTime;
	private int vitorias;
	private int empates;

	public TabelaMelhorada(String nomeDoTime, int vitorias, int empates) {
		this.nomeDoTime = nomeDoTime;
		this.vitorias = vitorias;
		this.empates = empates;
	}
	
	public TabelaMelhorada(String nomeDoTime) {
		this(nomeDoTime,0,0);
	}
	
	public void addVitoria(int numeroDeVitorias) {
		this.vitorias += numeroDeVitorias;
	}
	
	public void addEmpate(int numeroDeEmpates) {
		this.empates += numeroDeEmpates;
	}
	
	public String getNomeDoTime() {
		return this.nomeDoTime;
	}
	
	public int calculaPontos() {
		int pontosVitorias = vitorias * 3;
		int pontosEmpate = empates;
		return pontosVitorias + pontosEmpate;
	}
	
	public boolean vaiCair() {
		return this.calculaPontos() <= 45;
	}
	
}
