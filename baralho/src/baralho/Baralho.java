package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

	private List<Carta> cartas;
	
	public Baralho() {		
		this.setCartas(new ArrayList<>());
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	

	public void comprarCarta() {
		this.cartas.remove(getTamanho() - 1);
	}

	public int getTamanho() {
		return cartas.size();
	}

	public void embaralhar() {
		Collections.shuffle(cartas);
	}

    public Carta getCartaTopo() {
		//return ArrayList(-1) ;
    	/**
    	 * Arraylist � uma classe, e n�o uma inst�ncia.
    	 * Como o array sempre come�a em 0
    	 * A �ltima posi��o do array � sempre o tamanho menos 1
    	 */
    	return this.cartas.get(getTamanho() - 1); // o -1 � porque come�a no zero
    }


	public void adicionar(Carta carta) {
		cartas.add(carta);
	}
		
}
	

