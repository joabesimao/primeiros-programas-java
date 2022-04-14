import java.util.Scanner;

public class aprovado {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		float av1,av2,media;
		System.out.println("informe a nota da AV1");
		av1 = s1.nextFloat();
		System.out.println("informe a nota da AV2");
		av2 = s1.nextFloat();
		media = (av1+av2)/2.0f;
		
		if(media >= 7.0f) {
			System.out.println("Parabens voce está aprovado!!");
		}else {
			System.out.println("que pena voce está reprovado!");
		}
	}
}
