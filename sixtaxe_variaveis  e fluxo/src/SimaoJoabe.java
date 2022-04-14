
public class SimaoJoabe {
	
	public static void main(String[] args) {
		
		int quantidadeDeEntregas = 3;
		int quantidadeQueCarroLeva = 10;
		int quantidadeQueMotoLeva = 2;
		boolean levaCliente = quantidadeDeEntregas >= 3;
		
		if(quantidadeDeEntregas >= 5 || levaCliente) {
			System.out.println("o carro vai levar as entregas e o cliente");
		}else { 
			System.out.println("a moto vai levar a entrega o cliente nao");
		}
}
}
