import java.util.Scanner;

//private static boolean sd;

public class DadosP{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String login;
		String loginPessoal ="joabe";
			System.out.println("digite seu nome");
		login = entrada.next();
		
		//System.out.println("senha digitada" + sd);
		//11System.out.println("senha que deveria ser digitada" + sp);
		
		Scanner entradaSenha = new Scanner(System.in);
		
		String senhaDigitada;
		String senhaDoLogin="123";
			System.out.println("digite sua senha");
		senhaDigitada = entrada.next();
		
		
		if(login == loginPessoal && senhaDigitada == senhaDoLogin) {
			System.out.println("login efetuado");
			
		}else {
			System.out.println("senha incorreta");
		}
	}

}
