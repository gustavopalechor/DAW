package ejerciciosSimples;

public class Estudiante {

	String apellido;
	int curso;
	String ciclo;
	
	public Estudiante(String apellido, int curso, String ciclo) {
		super();
		this.apellido = apellido;
		this.curso = curso;
		this.ciclo = ciclo;
	}
	
	public Estudiante(String apellido, String ciclo) {
		super();
		this.apellido = apellido;
		this.ciclo = ciclo;
	}
	
	public void escribir() {
		System.out.println(apellido + " - " + curso + " - " + ciclo);
	}
	
	
	
	
}
