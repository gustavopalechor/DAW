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

	
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void escribir() {
		System.out.println(apellido + " - " + curso + " - " + ciclo);
	}
	
	public String escribirr() {
		return "Estudiante:\nApellido: " + apellido + "\nCiclo: "+ ciclo + "\nCurso: "+ curso;
	}
	
	
	
}
