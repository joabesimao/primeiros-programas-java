

public class Conta{
	
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
	
		public Conta(int agencia, int numero) {
			total++; 
			System.out.println("o total é "+ total);
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("estou criando uma conta "+ numero);
		}

		void deposita(double valor) {
			this.saldo += valor;
		}
		public boolean saca(double valor) {

			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		}
		 public boolean transfere (double valor, Conta destino) {
			 if(this.saldo >= valor) {
				 this.saldo -= valor;
				 destino.deposita(valor);
				 return true;
			 }
			 return false;
		 }
		 
		 public double getSaldo() {
			 return this.saldo;
		 }
		 
		 public int getNumero() {
			 return this.numero;
		 }
		 
		 public void setNumero(int numero){
			 if(numero <=0) {
				 System.out.println("nao pode numero negativo");
			 }
			 this.numero = numero;
			 
		 }

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			if(agencia <=0) {
				System.out.println("nao pode numero negativo");
			}
			this.agencia = agencia;
			
		}

		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		 public static int getTotal() {
			 return Conta.total;
			
		}
	}



