package ac.cr.ucenfotec.examen;

import java.util.ArrayList;

public class Naipe {

	public Naipe() throws Exception {
		crearBaraja();
	}
	private ArrayList<Carta> baraja;
	public ArrayList<Carta> getBaraja() {
		return baraja;
	}
	
	private void crearBaraja() throws Exception{
		baraja = new ArrayList<Carta>();
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
