
public class SistemaInterno {
	
	private int senha = 222;
	
	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
		if(autenticou) {
			System.out.println("sim");
		
		}else {
			System.out.println("nao");
		}
		
		
	}

	
}
