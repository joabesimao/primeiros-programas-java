
public class desafio1 {
	public static void main(String[] args) {
		
		
		for(int contador = 0; contador <= 100; contador++ ) {
			int numero = contador;;
			int multiploDeTres = contador ;
			double restoDivisao = multiploDeTres / 3;
		
			if(numero % 3 == 0) {
				restoDivisao = 0;
				System.out.println("o numero " + contador  + " é multiplo de 3");	
		}else {
			System.out.println("o numero  " + contador +   "  nao é multiplo de 3" );
		}
	}
	}
}
