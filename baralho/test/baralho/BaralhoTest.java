package baralho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaralhoTest {

	@Test
	void deve_inserirCartaNoBaralho_quando_adicionarUmaCarta() {
		Baralho baralho = new Baralho();
				
		baralho.adicionar(new Carta("Q", 12));
		int tamanhoBaralho = baralho.getTamanho();
		
		assertEquals(1, tamanhoBaralho);
	}

	@Test
	void deve_removerACartaDoTopoDoBaralho_quando_comprarUmaCarta() {
		Baralho baralho = new Baralho();
		
		baralho.adicionar(new Carta("Q", 12));
		int tamanhoBaralho = baralho.getTamanho();
		assertEquals(1, tamanhoBaralho);
		
		baralho.comprarCarta();
		tamanhoBaralho = baralho.getTamanho();
		assertEquals(0, tamanhoBaralho);
	}
	
	@Test
	void deve_mudarACartaDoTopo_quando_embaralharOBaralho() {
		Baralho baralho = new Baralho();
		
		baralho.adicionar(new Carta("Q", 12));
		baralho.adicionar(new Carta("K", 13));
		baralho.adicionar(new Carta("J", 11));
		baralho.adicionar(new Carta("1", 1));
		baralho.adicionar(new Carta("3", 3));
		
		baralho.embaralhar();
		
		Carta cartaTopo = baralho.getCartaTopo();
		
		assertNotEquals("3", cartaTopo.getNome());
		
	}
	
}
