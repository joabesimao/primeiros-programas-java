import java.io.Serializable;

public class Card implements Serializable,Cloneable {
	private static final long serialVersionUID = -7720833260489417219L;
	
	private String nome;
	private String descrição;
	private CardType cardType;
	
	private ColorPicture colorPicture;
	protected String picture;
	private Efeito effect;
	private int copies_number;
	private int state;
	
	public Card(String nome,String descrição,CardType cardType,ColorPicture normal,String picture,Efeito effect,int copies_number) {
		super();
		if(nome == null || nome.trim().isEmpty())
			throw new InvalidTextAttributeException("Name cannot be empty");
		
	}
	

}
