//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//  public static void main(String[] args) {
//    dadosPessoas();
//  }
//
//  public static void dadosPessoas(){
//    Scanner sc = new Scanner(System.in);
//    Pessoa pessoa;
//    List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
//    int opcao = 0;
//
//    do {
//      System.out.println("## Escolha uma das op��es abaixo ##");
//      System.out.println("Op��o 1 - Cadastra pessoas");
//          System.out.println("Op��o 2 - Imprime pessoas cadastradas");
//          System.out.println("Op��o 0 - Sair do programa");
//          System.out.println("_______________________");
//
//          System.out.print("Digite aqui sua op��o: ");
//          opcao = Integer.parseInt(sc.nextLine());
//
//          if(opcao == 1){
//      //Cria um novo objeto
//              pessoa = new Pessoa();
//
//          System.out.print("Digite o c�digo: ");
//          pessoa.setCodigo(Integer.parseInt(sc.nextLine()));
//
//         // System.out.print("Digite o nome: ");
//          //pessoa.setIdade(sc.nextLine());
//
//          System.out.print("Digite o endere�o: ");
//          pessoa.setEndereco(sc.nextLine());
//
//          System.out.print("Digite a idade: ");
//          pessoa.setIdade(Integer.parseInt(sc.nextLine()));
//
//          System.out.println();
//
//      //Guarda o objeto pessoa em uma lista.
//          listaPessoas.add(pessoa);
//          }else if(opcao == 2){
//            if(listaPessoas.isEmpty()){
//              System.out.println("N�o existem pessoas cadastradas, pressione uma tecla para continuar!");
//              sc.nextLine();
//            }else{
//              System.out.println(listaPessoas.toString());
//
//              System.out.println("Pressione um tecla para continuar.");
//              sc.nextLine();
//            }         }
//    } while (opcao != 0);
//
//    sc.close();
//  }
//}