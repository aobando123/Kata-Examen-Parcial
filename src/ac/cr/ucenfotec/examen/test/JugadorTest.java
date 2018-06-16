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
		int cantidadInicial =  jugador.getMano().size();
		Carta carta = new Carta();
		jugador.agregarCarta(carta);
		assertEquals(cantidadInicial+1, jugador.getMano().size());
	}
}
