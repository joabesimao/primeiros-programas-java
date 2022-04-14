
public class TesteIr {
	
	public static void main(String[] args) {

		/*
		* programa calcula o ir 
		* A-De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
		* B- De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
		* C-0 De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
		* 
		* 1 RECEBER PORCENTUAL DE IMPOSTO;
		* 2 CALCULAR VALOR DESCONTADO;
		* 3 CALCULAR VALOR FINAL;
		* */
		
		
		double salario = 2700;
		double calculoPercentual = 7.5 / 100.00;
		double valorDescontado = calculoPercentual * salario;
		double valorCalculado = salario - valorDescontado;  
		
		if(salario <= 2800.00 && salario >= 1900.0 ) {
			
			System.out.println("voce tem que pagar  " + valorCalculado);
			 
		}else{
			 	
			System.out.println("seu calculo é outro");
			
		}
		//System.out.println("voce tem que pagar  " + valorCalculado);
		salario = 3700.00;
		calculoPercentual = 15.0 / 100;
		valorCalculado = salario - (calculoPercentual * salario);
		
		if(salario <= 3700.01 && salario >= 2800.01) {

			System.out.println("vc tem que pagar " + valorCalculado);
		
		}else{
			System.out.println("seu calculo é de outro valor");
		}
		salario = 4663.00;
		calculoPercentual = 22.5 /100;
		valorCalculado = salario -(calculoPercentual * salario);
		
		if(salario <= 4664.00 && salario >= 3771.01) {
			
			System.out.println("vc tem que pagar " + valorCalculado);
		
		}else {
			
			System.out.println("seu calculo é outro");
		}
		
		
		
		
		
		
	} 
}
