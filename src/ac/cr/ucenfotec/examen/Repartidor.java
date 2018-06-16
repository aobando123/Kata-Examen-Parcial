package ac.cr.ucenfotec.examen;

import java.util.Collections;

public class Repartidor {
	
	private Naipe naipe;
	
	
	public Repartidor() throws Exception {
		naipe = new Naipe();
		barajar();
	}


	private void barajar() {
		Collections.shuffle(naipe.getBaraja());
	}
	
	public Carta obtenerCarta() {
		Carta cartaObtenida = naipe.getBaraja().get(0);
		naipe.getBaraja().removeFirst();
		return cartaObtenida;
		
	}

}