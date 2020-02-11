package modelo;

import java.util.Calendar;

public class Artista extends Interprete{
	Calendar fechaNacimiento;
	String rol;
	public Artista(int idInterprete, String nomInterprete, Calendar fechaNacimiento, String rol) {
		super(idInterprete, nomInterprete);
		this.fechaNacimiento = fechaNacimiento;
		this.rol = rol;
	}
	public Artista() {
		super();
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Artista [fechaNacimiento=" + fechaNacimiento + ", rol=" + rol + ", idInterprete=" + idInterprete
				+ ", nomInterprete=" + nomInterprete + "]";
	}
	
}
