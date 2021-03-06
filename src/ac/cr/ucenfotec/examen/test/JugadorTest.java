package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Carta;
import ac.cr.ucenfotec.examen.Jugador;

public class JugadorTest {

	static Jugador jugador;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		jugador = new Jugador("Adrian");
	}

	@Test
	public void cartasSonAgregadas() {
		int cantidadInicial =  jugador.cantidadCartasEnMano();
		Carta carta = new Carta();
		jugador.agregarCarta(carta);
		assertEquals(cantidadInicial+1, jugador.cantidadCartasEnMano());
	}
	
	@Test 
	public void retornarValorDeMano() throws Exception {
		Carta carta =  new Carta();
		carta.setValor(3);
		jugador.agregarCarta(carta);
		assertEquals(3, jugador.getValorMano());
	}
}
