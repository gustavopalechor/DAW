package modelo;

import java.util.Calendar;
import java.util.List;

public class Populares extends Carrera{

	private List<String>modalidades;
	private String lugarSalida;
	public Populares(String nombre, Calendar fecha, String lugar, List<String> modalidades, String lugarSalida) {
		super(nombre, fecha, lugar);
		this.modalidades = modalidades;
		this.lugarSalida = lugarSalida;
	}
	public Populares() {
		super();
	}
	public List<String> getModalidades() {
		return modalidades;
	}
	public void setModalidades(List<String> modalidades) {
		this.modalidades = modalidades;
	}
	public String getLugarSalida() {
		return lugarSalida;
	}
	public void setLugarSalida(String lugarSalida) {
		this.lugarSalida = lugarSalida;
	}
	@Override
	public String toString() {
		return "Populares [modalidades=" + modalidades + ", lugarSalida=" + lugarSalida + ", getNombre()=" + getNombre()
				+ ", getFecha()=" + getFecha() + ", getLugar()=" + getLugar() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
