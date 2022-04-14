
public class FuncionarioTeste {

private String nome;
private String cpf;
private double salario;
private int tipo  = 0;

public double getBonificacao() {
	if(this.tipo == 0) {
		return this.salario * 0.1;
		}else if(this.tipo == 1) {
			return this.salario;
		}else {
			return this.salario + 1000.0;
		
		}
}

}  
