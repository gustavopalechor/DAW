package ejInterface;

public class Carrera implements Comparacion{

	
	public void comparo(Persona p1, Persona p2) {
		if(p1.grupo=="alumno" && p2.grupo=="alumno")
		System.out.println("Los dos son alumnos");
		else System.out.println("Uno es tutor y el otro alumno");
			
		
	}

}
