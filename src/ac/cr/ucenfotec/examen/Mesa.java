package ac.cr.ucenfotec.examen;

import static org.hamcrest.CoreMatchers.instanceOf;

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
	public void empezarAJugar21() {
		for(Jugador jugadorElegido : Jugadores) {
			for (int i = 0; i < 2; i++) {
				jugadorElegido.agregarCarta(Dealer.darCarta());
			}
		}
	}

	public ArrayList<Jugador> getJugadores() {
		return Jugadores;
	}
	
	public Jugador verManos() {
		int valorGanador=0;
		int valorMano;
		Jugador ganador = null;
		for(Jugador jugador : Jugadores) {
			valorMano = jugador.getValorMano();
			if(valorGanador < valorMano && valorMano < 21) {
				valorGanador = valorMano;
				ganador = jugador;
			} else if (valorGanador == valorMano) {
				ganador = null;
			}
		}
		
		return ganador;
	}
	
	public Jugador verificarCambio(Jugador jugador) {
		boolean isCambio = false;
		ArrayList<String> cartasCambio = new ArrayList<>();
		cartasCambio.add(Nombres.Tres.toString());
		cartasCambio.add(Nombres.Jota.toString());
		cartasCambio.add(Nombres.Quina.toString());
		cartasCambio.add(Nombres.Ka.toString());
		
		
		for (Carta carta: jugador.getMano()) {
			if(cartasCambio.contains(carta.getNombre())){
				isCambio = true;
				break;
			}
		}
		if(isCambio) {
			cambio(jugador);
		}
		return jugador;
			
	}
	
	public void cambio(Jugador jugador) {
		int tamanoMano = jugador.cantidadCartasEnMano();
		jugador.getMano().clear();
		for (int i = 0; i < tamanoMano; i++) {
			jugador.agregarCarta(Dealer.darCarta());
		}
		
	}
	
}
