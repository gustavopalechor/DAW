package Herencias;

public class Empleado extends Persona{
	String antiguedad;

	public Empleado() {
		super();
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado [antiguedad=" + antiguedad + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", nombre=" + nombre + "]";
	}

}
