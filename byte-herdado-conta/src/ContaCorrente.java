
public class ContaCorrente extends Conta {

	//public public ContaCorrente(int agencia, int numero) {
		//super(agencia,numero);
		// TODO Auto-generated constructor stub
	//}
	//@Override
	public boolean saca(double valor) {
		double ValorASacar = valor + 0.2;
		return super.saca(ValorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
