package HerenciasVehiculos;

public class Avanza extends Autobus{
	boolean bano;

	public Avanza() {
		super();
	}

	public boolean isBano() {
		return bano;
	}

	public void setBano(boolean bano) {
		this.bano = bano;
	}

	@Override
	public String toString() {
		return "Avanza [bano=" + bano + ", plazas=" + plazas + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", potencia=" + potencia + ", carga=" + carga + "]";
	}
	

}
