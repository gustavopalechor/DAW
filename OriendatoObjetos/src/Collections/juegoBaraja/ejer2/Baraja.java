package Collections.juegoBaraja.ejer2;

import java.util.ArrayList;

import java.util.List;

public class Baraja {

	
	private List<Cartas> baraja;
	
	public Baraja(){
	baraja = new ArrayList<Cartas>();
	String[] palos = {(char)9829+ "-Corazones",(char)9830+ "-Rombos",(char) 9827+"-Tréboles", (char)9824+"-Picas" };
	for(int i=0; i<4; i++) {
		for(int j=1; j<10; j++) {
			baraja.add(new Cartas(i, palos[j]));
			
		}
		
	}
	}
	
	void pintarBaraja() {
	
	for(Cartas c: baraja) {
		System.out.println(c.toString());
	}
	}
}
