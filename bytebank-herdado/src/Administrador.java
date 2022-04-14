
public class Administrador extends Funcionario implements Autenticavel {
	
	  private AutentcacaoUtil autenticador;
	  
	public  Administrador() {
		this.autenticador = new AutentcacaoUtil();	
		}
	
	@Override
	public double getBonificacao() {
		return 50;
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
