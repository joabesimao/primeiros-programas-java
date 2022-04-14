

public abstract class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
			return false;
		}
		
		public boolean transfere(double valor, Conta destino){
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			}else {
				return false;
			}
	}
}