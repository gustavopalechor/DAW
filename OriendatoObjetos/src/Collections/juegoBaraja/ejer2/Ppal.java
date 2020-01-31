package Collections.juegoBaraja.ejer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
	Baraja b1= new Baraja();
	List b2=b1.getBaraja();
		
		for(Object j: b2) {
			System.out.println(j);
		}
		
		Collections.sort((List) b2);
		System.out.println("\n");
		
		
		for(Object j: b2) {
			System.out.println(j);
		}
	
	}
		
		
}
