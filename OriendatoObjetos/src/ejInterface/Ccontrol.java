package ejInterface;

public class Ccontrol {

	public static void main(String[] args) {
		Persona p2= new Persona(19, "Felipe", "tutor");
		Persona p1= new Persona(38, "Manuela", "tutor");
		
		Carrera c1= new Carrera();
		Tutor t1= new Tutor();
		c1.comparo(p1, p2);
		t1.comparo(p1, p2);
	}

}
