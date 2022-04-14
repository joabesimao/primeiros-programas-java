package byte_bank_composto;



public class Conta{
	
		private double saldo;
		private int agencia;
		private int numero;
		protected Cliente titular;
		private static int total;
		
		public Conta(int agencia,int numero) {
			total++;
			System.out.println("total é "+ total);
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("estou criando uma conta "+ this.numero);
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

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public static int getTotal() {
			return Conta.total;
			
		}

	}



