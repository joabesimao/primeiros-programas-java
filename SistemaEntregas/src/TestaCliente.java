
public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("joabe","rua pereira e silva n°445");
		cliente.setCidade("cascavel");
		cliente.setBairro("buritizal");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEndereço());
		System.out.println(cliente.getCidade());
		System.out.println(cliente.getBairro());
		
		Cliente clientenumero2 = new Cliente("del", "st buritizal");
		clientenumero2.setCidade("cascavel");
		System.out.println(clientenumero2.getNome());
		System.out.println(clientenumero2.getCidade());

	}

}
