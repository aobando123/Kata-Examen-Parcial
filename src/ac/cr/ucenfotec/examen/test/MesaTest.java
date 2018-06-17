package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Carta;
import ac.cr.ucenfotec.examen.Jugador;
import ac.cr.ucenfotec.examen.Mesa;
import ac.cr.ucenfotec.examen.Nombres;
import ac.cr.ucenfotec.examen.Palos;

public class MesaTest {

	  Mesa mesa;
	@Before
	public   void setUpBeforeTest() throws Exception {
		mesa = new Mesa();
		Jugador jugador1 = new Jugador("Adrian");
		mesa.agregarJugador(jugador1);
		Jugador jugador2 = new Jugador("Adrian");
		mesa.agregarJugador(jugador2);
		Jugador jugador3 = new Jugador("Adrian");
		mesa.agregarJugador(jugador3);
		Jugador jugador4 = new Jugador("Adrian");
		mesa.agregarJugador(jugador4);
	}

	@Test
	public void mesaEmpiezaCon0() throws Exception {
		mesa = new Mesa();
		assertEquals(0, mesa.cantidadJugadoresPresentes());
	}
	@Test
	public void agregarJugador() throws Exception {

		assertEquals(4, mesa.cantidadJugadoresPresentes());
	}
	@Test(expected = Exception.class)
	public void excAgregarJugador() throws Exception {
		Jugador jugador5 = new Jugador("Adrian");
		mesa.agregarJugador(jugador5);
		assertEquals(5, mesa.cantidadJugadoresPresentes());
	}
	
	@Test
	public void empezarJugar21() throws Exception {
		boolean isRepartidoBien = true;
		mesa.empezarAJugar21();
		for(Jugador jugador: mesa.getJugadores())
			if(jugador.cantidadCartasEnMano() != 2) {
				isRepartidoBien = false;
			}
		
		assertTrue(isRepartidoBien);
	}
	
	@Test
	public void retornarGanador() {
		mesa.empezarAJugar21();
		Jugador jugador = mesa.verManos();
		
		assertEquals(true,jugador != null);
		assertEquals("Adrian", jugador.getNombre());
	}
	
	@Test
	public void retornarEmpate() throws Exception {
		mesa = new Mesa();
		Jugador jugador1 = new Jugador("Felipe");
		Jugador jugador2 = new Jugador("Adrian");
		Carta carta1 = new Carta(Nombres.Tres.toString(),Palos.ESCUDOS.toString(),3);
		Carta carta2 = new Carta(Nombres.Siete.toString(),Palos.ESCUDOS.toString(),7);
		jugador1.agregarCarta(carta1);
		jugador1.agregarCarta(carta2);
		jugador2.agregarCarta(carta1);
		jugador2.agregarCarta(carta2);
		mesa.agregarJugador(jugador2);
		mesa.agregarJugador(jugador1);
		Jugador ganador = mesa.verManos();
		
		assertFalse(ganador != null);
	}


}
