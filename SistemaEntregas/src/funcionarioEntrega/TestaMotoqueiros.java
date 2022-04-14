package funcionarioEntrega;
public class TestaMotoqueiros {

	public static void main(String[] args) {
		MotoqueirosEMotoristas motoqueirosEMotorista = new MotoqueirosEMotoristas("nenem");
		motoqueirosEMotorista.setPlacaDaMoto("hhhd 023");
		motoqueirosEMotorista.setNumeroHabilitacao(123321);
		
		System.out.println(motoqueirosEMotorista.getNome());
		System.out.println(motoqueirosEMotorista.getPlacaDaMoto());
		System.out.println(motoqueirosEMotorista.getNumeroHabilitacao());
	}
}
