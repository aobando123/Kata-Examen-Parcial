package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Carta;

public class CartaTest {

	static Carta carta;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		carta = new Carta();
	}

	@Test(expected = Exception.class)
	public void excCartaConValorMayorA10() throws Exception {
		carta.setValor(11);
		assertEquals(11, carta.getValor());
	}
	
	@Test
	public void CartaConValoresIgualoMenorA10() throws Exception {
		carta.setValor(10);
		assertEquals(10, carta.getValor());
		carta.setValor(5);
		assertEquals(5, carta.getValor());
	}
	

}
