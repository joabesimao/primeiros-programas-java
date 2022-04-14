import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		float altura,peso,imc;
		System.out.println("Altura:");
		altura = Float.parseFloat(bf.readLine());
		System.out.println("peso:");
		peso = Float.parseFloat(bf.readLine());
		imc = (peso/altura)/altura;
		System.out.printf("seu IMC vale %f\n",imc);
		
	}

}
