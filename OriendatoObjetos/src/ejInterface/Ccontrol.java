package ejInterface;

import java.util.Arrays;

public class Ccontrol {

	public static void main(String[] args) {
		Persona p2= new Persona(19, "Felipe", "tutor");
		Persona p1= new Persona(38, "Manuela", "tutor");
		Persona[] p3= {p1,p2};
		Carrera c1= new Carrera();
		Tutor t1= new Tutor();
		c1.comparo(p1, p2);
		t1.comparo(p1, p2);
		System.out.println();
		p1.compareTo(p2);
		Arrays.sort(p3);
	}

}
