package modelo;

import java.util.Calendar;

public class DeCoches extends Carrera{
	private String record;
	private String ganador;
	public DeCoches(String nombre, Calendar fecha, String lugar, String record, String ganador) {
		super(nombre, fecha, lugar);
		this.record = record;
		this.ganador = ganador;
	}
	public DeCoches() {
		super();
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	@Override
	public String toString() {
		return "DeCoches [record=" + record + ", ganador=" + ganador + ", getNombre()=" + getNombre() + ", getFecha()="
				+ getFecha() + ", getLugar()=" + getLugar() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
