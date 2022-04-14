
public class Tabela {
	private int nomeDoTime;
	private int vitorias;
	private int empates;
	private int derrotas;
	private int  pontos = vitorias * 3 + empates;
	private int calculo;
	private int analise;

	
	public int getCalculo() {
		pontos = vitorias *3 + empates;
		return pontos;
	}
	public void setCalculo(int calculo) {
		this.calculo = calculo;
	}
	public int getNomeDoTime() {
		return nomeDoTime;
	}
	public void setNomeDoTime(int nomeDoTime) {
		this.nomeDoTime = nomeDoTime;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getAnalise() {
		
		return analise;
	}
	public void setAnalise(int analise) {
		
		if(pontos>= 80) {
			System.out.println("este ano está bom");
		}if(pontos<= 45){
			System.out.println("esse ano vai cair");
			
		}
		this.analise = analise;
	}

}
