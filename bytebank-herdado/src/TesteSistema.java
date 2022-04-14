
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(222);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(222);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(gerente);
		
		//SistemaInterno. = new SistemaInterno();
	
		
		
	}

}


