package ac.cr.ucenfotec.examen;

import java.util.Collections;

public class Repartidor {
	
	private Naipe naipe;
	
	
	public Repartidor() throws Exception {
		naipe = new Naipe();
		barajar();
	}


//	public Naipe getNaipe() {
//		return naipe;
//	}


	private void barajar() {
		Collections.shuffle(naipe.getBaraja());
	}
	
	public Carta darCarta () {
		Carta cartaObtenida = naipe.getBaraja().get(0);
		naipe.getBaraja().removeFirst();
		return cartaObtenida;
		
	}
	public int obtenerCantidadCartas() {
		return naipe.getBaraja().size();
	}

}
