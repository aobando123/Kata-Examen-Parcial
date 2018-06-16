package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Jugador;
import ac.cr.ucenfotec.examen.Mesa;

public class MesaTest {

	static Mesa mesa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mesa = new Mesa();
	}

	@Test
	public void mesaEmpiezaCon0() throws Exception {
		mesa = new Mesa();
		assertEquals(0, mesa.cantidadJugadoresPresentes());
	}
	@Test
	public void agregarJugador() throws Exception {
		Jugador jugador = new Jugador("Adrian");
		mesa.agregarJugador(jugador);
		assertEquals(1, mesa.cantidadJugadoresPresentes());
	}
	@Test(expected = Exception.class)
	public void excAgregarJugador() throws Exception {
		Jugador jugador1 = new Jugador("Adrian");
		mesa.agregarJugador(jugador1);
		Jugador jugador2 = new Jugador("Adrian");
		mesa.agregarJugador(jugador2);
		Jugador jugador3 = new Jugador("Adrian");
		mesa.agregarJugador(jugador3);
		Jugador jugador4 = new Jugador("Adrian");
		mesa.agregarJugador(jugador4);
		Jugador jugador5 = new Jugador("Adrian");
		mesa.agregarJugador(jugador5);
		assertEquals(5, mesa.cantidadJugadoresPresentes());
	}

}
