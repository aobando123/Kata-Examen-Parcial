package ac.cr.ucenfotec.examen;

import java.util.LinkedList;

public class Naipe {

	public Naipe() throws Exception {
		crearBaraja();
	}
	private LinkedList<Carta> baraja;
	public LinkedList<Carta> getBaraja() {
		return baraja;
	}
	
	private void crearBaraja() throws Exception{
		baraja = new LinkedList<Carta>();
		int count = 1;
		for( Palos palo : Palos.values()) {
			for( Nombres nombre : Nombres.values()){
				Carta nuevaCarta = new Carta (nombre.toString(), palo.toString(), count);
				baraja.add(nuevaCarta);
				if(count < 10)
					count++;
			}
			count = 1;
		}
	}

}
