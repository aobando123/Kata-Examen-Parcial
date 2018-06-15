package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	public void cartaConValoresIgualoMenorA10() throws Exception {
		carta.setValor(10);
		assertEquals(10, carta.getValor());
		carta.setValor(5);
		assertEquals(5, carta.getValor());
	}
	
	@Test
	public void cartasIguales() throws Exception {
		Carta carta2 = new Carta();
		carta.setValor(1);
		carta2.setValor(1);
		assertTrue(carta.equals(carta2));
	}
	
	@Test
	public void cartasDiferentes() throws Exception {
		Carta carta2 = new Carta();
		carta.setValor(1);
		carta2.setValor(8);
		assertFalse(carta.equals(carta2));
	}
	@Test 
	public void cartaConOtroObjeto() throws Exception {
		carta.setValor(5);
		ArrayList<String> list = new ArrayList<String>();
		assertFalse(carta.equals(list));
	}

}
