package upcastingDowncasting;

public class Nadador extends Deportista {
	String estilo;

	public Nadador() {
		super();
	}

	public Nadador(String nombre, String pais, String fechaNacimiento, String estatura, String sexo, String estilo) {
		super(nombre, pais, fechaNacimiento, estatura, sexo);
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Nadador [estilo=" + estilo + ", nombre=" + nombre + ", Pais=" + Pais + ", fechaNacimiento="
				+ fechaNacimiento + ", estatura=" + estatura + ", sexo=" + sexo + "]";
	}
	
	

}
