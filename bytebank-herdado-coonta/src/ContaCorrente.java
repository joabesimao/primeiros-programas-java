
public class ContaCorrente extends Conta {
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
			
		}
		
		
	}


