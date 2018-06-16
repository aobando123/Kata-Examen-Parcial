package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Carta;
import ac.cr.ucenfotec.examen.Jugador;
import ac.cr.ucenfotec.examen.Repartidor;

public class RepatidorTest {
	
	static Repartidor repartidor;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		repartidor = new Repartidor();
	}
	@Test
	public void naipeNoOrdenado() {
		boolean ordenado = false;
		Carta carta1 = repartidor.darCarta();
		Carta carta2 = repartidor.darCarta();
		if(carta1.getPalo().equals(carta2.getPalo()) && 
				carta1.getValor() == carta2.getValor() - 1) {
			ordenado = true;
		}
		assertFalse(ordenado);
		
	}
	
	@Test 
	public void darCartaAJugador() {
		Jugador nuevoJugador = new Jugador("Adrian");
		Carta cartaADar = repartidor.darCarta();
		nuevoJugador.agregarCarta(cartaADar);
		assertEquals(51, repartidor.obtenerCantidadCartas());
		assertEquals(1, nuevoJugador.cantidadCartasEnMano());
	}

}
