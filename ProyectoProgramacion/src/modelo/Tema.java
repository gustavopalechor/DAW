package modelo;

public class Tema {
	int idTema;
	String nombreTema;
	Interpretacion autorTema;
	public Tema(int idTema, String nombreTema, Interpretacion autorTema) {
		super();
		this.idTema = idTema;
		this.nombreTema = nombreTema;
		this.autorTema = autorTema;
	}
	public Tema() {
		super();
	}
	public int getIdTema() {
		return idTema;
	}
	public void setIdTema(int idTema) {
		this.idTema = idTema;
	}
	public String getNombreTema() {
		return nombreTema;
	}
	public void setNombreTema(String nombreTema) {
		this.nombreTema = nombreTema;
	}
	public Interpretacion getAutorTema() {
		return autorTema;
	}
	public void setAutorTema(Interpretacion autorTema) {
		this.autorTema = autorTema;
	}
	@Override
	public String toString() {
		return "Tema [idTema=" + idTema + ", nombreTema=" + nombreTema + ", autorTema=" + autorTema + "]";
	}
	
	
	
}
