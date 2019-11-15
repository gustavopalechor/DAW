package HerenciasVehiculos;

public class Taxi extends Vehiculos{
	String nLincecia;

	public Taxi() {
		super();
	}

	public String getnLincecia() {
		return nLincecia;
	}

	public void setnLincecia(String nLincecia) {
		this.nLincecia = nLincecia;
	}
	public void sobrecarga(int carga, int inicio) {
		super.sobrecargar(carga);
		this.carga=this.carga+inicio;
		System.out.println(this.carga);
	}

	@Override
	public String toString() {
		return "Taxi [nLincecia=" + nLincecia + ", matricula=" + matricula + ", modelo=" + modelo + ", potencia="
				+ potencia + ", carga=" + carga + "]";
	}
	
}
