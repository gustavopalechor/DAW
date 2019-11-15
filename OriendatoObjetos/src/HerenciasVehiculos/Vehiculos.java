package HerenciasVehiculos;

public class Vehiculos {
	String matricula;
	String modelo;
	String potencia;
	int carga;
	public Vehiculos() {
		super();
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public void sobrecargar(int carga) {
		this.carga= carga+30;
		System.out.println(this.carga);
	}
	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia + ", carga="
				+ carga + "]";
	}
	
	
}

