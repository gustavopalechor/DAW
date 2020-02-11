package modelo;

public class Soporte {
	int idSoporte;
	String nomSoporte;
	
	public Soporte() {
		super();
	}
	public Soporte(int idSoporte, String nomSoporte) {
		super();
		this.idSoporte = idSoporte;
		this.nomSoporte = nomSoporte;
	}
	public String getNomSoporte() {
		return nomSoporte;
	}
	public void setNomSoporte(String nomSoporte) {
		this.nomSoporte = nomSoporte;
	}
	
	
	@Override
	public String toString() {
		return "Interpretacion [idSoporte=" + idSoporte + ", nomSoporte=" + nomSoporte 	+ "]";
	}
}
