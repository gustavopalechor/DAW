package Herencias;

public class Persona {
	String apellido1;
	String apellido2;
	String nombre;
	
	public Persona() {
		super();
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona [apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nombre=" + nombre + "]";
	}
}
