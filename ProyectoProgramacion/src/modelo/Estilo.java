package modelo;

public class Estilo {

	int idEstilo;
	String nomEstilo;
	public Estilo(int idEstilo, String nomEstilo) {
		super();
		this.idEstilo = idEstilo;
		this.nomEstilo = nomEstilo;
	}
	public Estilo() {
		super();
	}
	public int getIdEstilo() {
		return idEstilo;
	}
	public void setIdEstilo(int idEstilo) {
		this.idEstilo = idEstilo;
	}
	public String getNomEstilo() {
		return nomEstilo;
	}
	public void setNomEstilo(String nomEstilo) {
		this.nomEstilo = nomEstilo;
	}
	@Override
	public String toString() {
		return "Estilo [idEstilo=" + idEstilo + ", nomEstilo=" + nomEstilo + "]";
	}
	
}
