package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
	
	System.out.println(contaDoPaulo.saldo);
	boolean conseguiRetirar = contaDoPaulo.saca(20);
	System.out.println(contaDoPaulo.saldo);
	System.out.println(conseguiRetirar);
	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	if(contaDaMarcela.transfere(300, contaDoPaulo)) {
		System.out.println("transferencia concluida");
	}else {
		System.out.println("faltou dindin");
	}
	System.out.println(contaDaMarcela.saldo);
	System.out.println(contaDoPaulo.saldo);
	
	contaDoPaulo.titular = "paulo ";
	System.out.println(contaDoPaulo.titular);
	}
	

	
	

}
