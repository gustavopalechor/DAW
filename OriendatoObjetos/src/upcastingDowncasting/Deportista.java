package upcastingDowncasting;

public class Deportista {
	
	String nombre;
	String Pais;
	String fechaNacimiento;
	String estatura;
	String sexo;
	public Deportista() {
		super();
	}
	public Deportista(String nombre, String pais, String fechaNacimiento, String estatura, String sexo) {
		super();
		this.nombre = nombre;
		Pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.estatura = estatura;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getEstatura() {
		return estatura;
	}
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", Pais=" + Pais + ", fechaNacimiento=" + fechaNacimiento
				+ ", estatura=" + estatura + ", sexo=" + sexo + "]";
	}
	
}
