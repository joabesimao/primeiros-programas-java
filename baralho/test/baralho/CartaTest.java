package baralho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CartaTest {

	@Test
	void deve_possuirNomeEValor_quando_umaCartaForCriada() {
		Carta carta = new Carta("Q", 12);
		assertEquals("Q", carta.getNome());
		assertEquals(12, carta.getNumero());
	}

}
