
public class testa01 {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16; 
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("VALOR DO ACOMPANHADO É " + acompanhado);
		
		if(idade >= 18  && acompanhado) {
			System.out.println("seja bem vindo");
		}else {
			System.out.println("infelizmente vc nao pode entrar");
		}
		
	}
}
