package modelo;

import java.util.Calendar;

public class Interpretacion {
	int idInterpretacion;
	Calendar fecha;
	Interprete interprete;
	Estilo estilo;
	public Interpretacion(int idInterpretacion, Calendar fecha, Interprete interprete, Estilo estilo) {
		super();
		this.idInterpretacion = idInterpretacion;
		this.fecha = fecha;
		this.interprete = interprete;
		this.estilo = estilo;
	}
	public Interpretacion() {
		super();
	}
	public int getIdInterpretacion() {
		return idInterpretacion;
	}
	public void setIdInterpretacion(int idInterpretacion) {
		this.idInterpretacion = idInterpretacion;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public Interprete getInterprete() {
		return interprete;
	}
	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	@Override
	public String toString() {
		return "Interpretacion [idInterpretacion=" + idInterpretacion + ", fecha=" + fecha + ", interprete="
				+ interprete + ", estilo=" + estilo + "]";
	}
	
	
	
}
