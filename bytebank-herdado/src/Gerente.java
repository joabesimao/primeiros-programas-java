
public class Gerente extends Funcionario implements Autenticavel {
	
	//private int senha;
	private AutentcacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutentcacaoUtil();
		
	
	}
		
		public double getBonificacao() {
			System.out.println("123");
			return super.getSalario();
			
		}     

		@Override
		public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
			
		}

		@Override
		public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);
			
		}
	
			
		
	}

