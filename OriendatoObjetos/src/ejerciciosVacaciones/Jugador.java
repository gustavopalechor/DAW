package ejerciciosVacaciones;

public class Jugador {
	String NomJugador;

	public Jugador(String nomJugador) {
		super();
		NomJugador = nomJugador;
	}

	public Jugador() {
		super();
	}

	public String getNomJugador() {
		return NomJugador;
	}

	public void setNomJugador(String nomJugador) {
		NomJugador = nomJugador;
	}

	public void CrearJugador(String NomJugador, int id) {
		this.NomJugador=NomJugador;
		id++;
	}
	
	@Override
	public String toString() {
		return "Nombre Jugador= " + NomJugador;
	}
	
}
