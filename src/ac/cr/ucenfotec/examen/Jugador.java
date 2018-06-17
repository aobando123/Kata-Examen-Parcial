package ac.cr.ucenfotec.examen;

import java.util.ArrayList;

public class Jugador {

	private String Nombre;
	ArrayList<Carta> Mano;
	public Jugador(String nombre) {
		Mano = new ArrayList<Carta>();
		this.Nombre = nombre;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	public void agregarCarta(Carta carta) {
		Mano.add(carta);
	}
	public int cantidadCartasEnMano() {
		return Mano.size();
	}
	public ArrayList<Carta> getMano() {
		return Mano;
	}
	public int getValorMano() {
		int sumatoria = 0;
		for(Carta carta : Mano) {
			sumatoria += carta.getValor();
		}
		return sumatoria;
	}
	
}
