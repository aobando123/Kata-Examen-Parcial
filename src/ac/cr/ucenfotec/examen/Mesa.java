package ac.cr.ucenfotec.examen;

import java.util.ArrayList;

public class Mesa {
	
	private Repartidor Dealer;
	private ArrayList<Jugador> Jugadores;

	public Mesa() throws Exception {
		Dealer = new Repartidor();
		Jugadores = new ArrayList<Jugador>();
	}
	
	public int cantidadJugadoresPresentes() {
		return Jugadores.size();
	}
	
	public void agregarJugador(Jugador jugadorAgregar) throws Exception {
		if(cantidadJugadoresPresentes() == 4) {
			throw new Exception();
		}
		Jugadores.add(jugadorAgregar);
	}
}
