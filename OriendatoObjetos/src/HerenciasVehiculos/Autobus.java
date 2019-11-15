package HerenciasVehiculos;

public class Autobus extends Vehiculos {
	int plazas;

	public Autobus() {
		super();
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "Autobus [plazas=" + plazas + ", matricula=" + matricula + ", modelo=" + modelo + ", potencia="
				+ potencia + ", carga=" + carga + "]";
	}
	
}
