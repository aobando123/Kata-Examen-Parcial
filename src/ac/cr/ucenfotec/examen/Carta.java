package ac.cr.ucenfotec.examen;

public class Carta {
	private String Nombre;
	private String Palo;
	private int Valor;
	public Carta() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param nombre
	 * @param palo
	 * @param valor
	 * @throws Exception 
	 */
	public Carta(String nombre, String palo, int valor) throws Exception {
		if(valor > 10 || valor < 1) {
			throw new Exception();
		}
		Nombre = nombre;
		Palo = palo;
		Valor = valor;
	}


	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPalo() {
		return Palo;
	}

	public void setPalo(String palo) {
		Palo = palo;
	}

	public int getValor() {
		return Valor;
	}

	public void setValor(int valor) throws Exception {
		if(valor > 10 || valor < 1) {
			throw new Exception();
		}
		Valor = valor;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Carta)) {
			return false;
		}
		Carta other = (Carta) obj;
		if (Valor != other.Valor) {
			return false;
		}
		return true;
	}
	

}
