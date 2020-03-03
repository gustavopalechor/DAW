package modelo;

import java.util.Calendar;

public class Carrera implements Comparable<Carrera>{

	private String nombre;
	private Calendar fecha;
	private String lugar;
	public Carrera(String nombre, Calendar fecha, String lugar) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
	}
	public Carrera() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + "]";
	}
	@Override
	public int compareTo(Carrera c) {
		
		this.getFecha().compareTo(c.getFecha());
		return 0;
	}
	
}
