
public class testa01 {
	
	
		public static void main(String[] args) {
			Tabela tabela= new Tabela();
//			tabela.setEmpates(1);
//			tabela.setVitorias(14);
//			
//			//System.out.println(tabela.getCalculo());
//			tabela.setAnalise(tabela.getCalculo());
//			System.out.println(tabela.getCalculo());
			
			
			TabelaMelhorada tabelaMelhorada = new TabelaMelhorada("Palmeiras");
			
			tabelaMelhorada.addVitoria(5);
			tabelaMelhorada.addEmpate(2);
			tabelaMelhorada.addEmpate(5);
			tabelaMelhorada.addVitoria(10);
			
			if(tabelaMelhorada.vaiCair()){
				System.out.println(
					"O time " + 
					tabelaMelhorada.getNomeDoTime() + 
					" vai cair com " + 
					tabelaMelhorada.calculaPontos() + 
					" pontos" 
				);
			}else {
				System.out.println(
						"O time " + 
						tabelaMelhorada.getNomeDoTime() + 
						" não vai cair com " + 
						tabelaMelhorada.calculaPontos() + 
						" pontos" 
					);
			}
			
		}
}
			