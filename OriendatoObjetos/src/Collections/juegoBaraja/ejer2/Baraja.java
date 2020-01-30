package Collections.juegoBaraja.ejer2;

import java.util.ArrayList;

import java.util.List;

public class Baraja {

	
	private List<Cartas> baraja;
	
	public Baraja(){
	baraja = new ArrayList<Cartas>();
	String[] palos = {"Corazones","Rombos","Tréboles","Picas" };
	for(int i=0; i<4; i++) {
		for(int j=1; j<10; j++) {
			baraja.add(new Cartas(j, palos[i]));
			
		}
		
	}
	}
	
	void pintarBaraja() {
	
	for(Cartas c: baraja) {
		System.out.println(c);
	}
	}
}
