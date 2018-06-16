package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Carta;
import ac.cr.ucenfotec.examen.Naipe;
import ac.cr.ucenfotec.examen.Nombres;
import ac.cr.ucenfotec.examen.Palos;

public class NaipeTest {
	
	static Naipe naipe;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		naipe = new Naipe();
	}
	
	@Test
	public void testTamannoNaipe() {
		assertEquals(52, naipe.getBaraja().size());
	}
	@Test
	public void testNaipeCon4Palos() {
		int count = 0;
		for(Palos palo : Palos.values()) {
			for(Carta carta: naipe.getBaraja()) {
				if(carta.getPalo().equals(palo.toString())) {
					count++;
					break;
				}
			}
		}
		assertEquals(4, count);
	}
	@Test
	public void testNaipeCon13TiposCarta() {
		int count = 0;
		for(Nombres nombre : Nombres.values()) {
			for(Carta carta: naipe.getBaraja()) {
				if(carta.getNombre().equals(nombre.toString())) {
					count++;
					break;
				}
			}
		}
		assertEquals(13, count);
	}

	
}
