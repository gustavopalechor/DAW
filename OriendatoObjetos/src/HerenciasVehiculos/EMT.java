package HerenciasVehiculos;

public class EMT extends Autobus{
	int nLinea;

	public EMT() {
		super();
	}

	public int getnLinea() {
		return nLinea;
	}

	public void setnLinea(int nLinea) {
		this.nLinea = nLinea;
	}

	@Override
	public String toString() {
		return "EMT [nLinea=" + nLinea + ", plazas=" + plazas + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", potencia=" + potencia + ", carga=" + carga + "]";
	}
	

}
