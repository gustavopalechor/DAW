package Collections.juegoBaraja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;




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
		ArrayList<String> baraja= new ArrayList<String>(Arrays.asList((int)1+"1a", (int)2+"a",(int)3+ "a", (int)1+"b",
				(int)2+"b", (int)3+"b",(int)1+ "c",(int)2+ "c", (int)3+"c"));
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
		
		System.out.println();
		Collections.sort(barajaJugador);
		Collections.sort(barajaJugador1);
		Collections.sort(barajaJugador2);
		MostrarBaraja(barajaJugador);
		System.out.println();
		MostrarBaraja(barajaJugador1);
		System.out.println();
		MostrarBaraja(barajaJugador2);
		System.out.println("Final");
		System.out.println("\n");
		System.out.println(baraja.indexOf(barajaJugador1));
		
		Set<List> set= Set.of(barajaJugador, barajaJugador1, barajaJugador2);
		
		System.out.println("\n");
		System.out.println(set);
		
		
	}
	
	
	

}
