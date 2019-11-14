package Herencias;

public class Becario extends Persona{
	String tiempoMaxBecario;

	
	public Becario() {
		super();
	}

	public String getTiempoMaxBecario() {
		return tiempoMaxBecario;
	}

	public void setTiempoMaxBecario(String tiempoMaxBecario) {
		this.tiempoMaxBecario = tiempoMaxBecario;
	}

	@Override
	public String toString() {
		return "Becario [tiempoMaxBecario=" + tiempoMaxBecario + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", nombre=" + nombre + "]";
	}

}
