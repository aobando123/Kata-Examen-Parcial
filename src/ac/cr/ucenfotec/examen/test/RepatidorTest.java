package ac.cr.ucenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.examen.Carta;
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
		Carta carta1 = repartidor.obtenerCarta();
		Carta carta2 = repartidor.obtenerCarta();
		if(carta1.getPalo().equals(carta2.getPalo()) && 
				carta1.getValor() == carta2.getValor() - 1) {
			ordenado = true;
		}
		assertFalse(ordenado);
		
	}

}
