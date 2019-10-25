package ejerciciosSimples;

public class control {

	public static void main(String[] args) {
		
		Estudiante p1= new Estudiante("García", 1, "DAW");
		Estudiante p2= new Estudiante("Perez", "DAM");
		
		p1.escribir();
		p2.setCurso(2);
		p2.escribir();
	}

}
