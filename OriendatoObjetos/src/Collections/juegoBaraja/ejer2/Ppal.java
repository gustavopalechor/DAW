package Collections.juegoBaraja.ejer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
	Baraja b1= new Baraja();
	ArrayList<Baraja> b2= new ArrayList<Baraja>(Arrays.asList(b1));
		
		for(Object j: b2) {
			System.out.println(j);
		}
		
		Collections.sort((List) b2);
		
		
		for(Object j: b2) {
			System.out.println(j);
		}
	
	}
		
		
}
