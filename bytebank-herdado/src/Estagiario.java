
public class Estagiario extends Funcionario {
	
	public static void main(String[] args) {
		Funcionario estagiario = new Estagiario();	
		estagiario.setSalario(1000);
		System.out.println(estagiario.getClass());
	}

	@Override
	public double getBonificacao() {
		
		return 0;
	}
	
}
