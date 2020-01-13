package ejInterface;

public class Tutor implements Comparacion{

	
	public void comparo(Persona p1, Persona p2) {
		if(p1.grupo=="tutor" && p2.grupo=="tutor")
		System.out.println("Los dos son tutores");
		else System.out.println("Uno es tutor y el otro alumno");
	}

}
