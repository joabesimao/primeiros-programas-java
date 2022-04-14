package pilha;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	private static void metodo1() {
		System.out.println("ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		
	}

	private static void metodo2() {
		System.out.println("ini do metodo2");
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}
	
	

}
 