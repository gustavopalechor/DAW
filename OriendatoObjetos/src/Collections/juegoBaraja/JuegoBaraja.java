package Collections.juegoBaraja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class JuegoBaraja {
	
	public static void MostrarBaraja(ArrayList <String> a) {
		
	for(String j: a) {
		System.out.println(j);
	}
	}
	public static void barajar(ArrayList <String>a, ArrayList <String>b) {
		for(int i=0; a.size()<3; i++) {
			Collections.shuffle(b);
			if(a.contains(b.get(0))==false){
				a.add(b.get(0));
				
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> baraja= new ArrayList<String>(Arrays.asList("1a", "2a", "3a", "1b",
				"2b", "3b", "1c", "2c", "3c"));
		ArrayList<String> barajaJugador= new ArrayList<String>();
		ArrayList<String> barajaJugador1= new ArrayList<String>();
		ArrayList<String> barajaJugador2= new ArrayList<String>();
		
		System.out.println("Esta es la baraja:");
		MostrarBaraja(baraja);
		
		System.out.println();
		System.out.println("Ahora vamos a barajar las cartas");
		
		barajar(barajaJugador, baraja);
		barajar(barajaJugador1, baraja);
		barajar(barajaJugador2, baraja);
		System.out.println("\n");
		
		MostrarBaraja(barajaJugador);
		System.out.println("\n");
		MostrarBaraja(barajaJugador1);
		System.out.println("\n");
		MostrarBaraja(barajaJugador2);

	}

}
