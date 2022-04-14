package bitbank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo =100;
		contadoPaulo.deposita(50);
	
	System.out.println(contadoPaulo.saldo);
	boolean conseguiuRetirar = contadoPaulo.saca(20);
	System.out.println(contadoPaulo.saldo);
	System.out.println(conseguiuRetirar);
	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	boolean sucessoTransferencia = contaDaMarcela.transfere(300,contadoPaulo);
	if(sucessoTransferencia) {
		System.out.println("tranferencia com sucesso");
	}else {
		System.out.println("faltou dinheiro");
	}
	System.out.println(contaDaMarcela.saldo);
	System.out.println(contadoPaulo.saldo);
	
	contadoPaulo.titular = "Paulo Silveira";
	System.out.println(contadoPaulo.titular);
	}
	
	
}
 