package Collections.juegoBaraja.ejer2;

import java.util.ArrayList;
import java.util.Arrays;

public class Cartas implements Comparable<Cartas> {

	int valor;
	String palos;
	public Cartas() {
		super();
	}
	public Cartas(int valor, String palos) {
		super();
		this.valor = valor;
		this.palos = palos;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalos() {
		return palos;
	}
	public void setPalos(String palos) {
		this.palos = palos;
	}
	@Override
	public String toString() {
		return "Cartas valor=" + valor + ", palos=" + palos;
	}
	@Override
	public int compareTo(Cartas c1) {
		int valor=0;
		ArrayList<String> palos = new ArrayList<String>(Arrays.asList("Corazones","Rombos","Tréboles","Picas"));
			if(palos.indexOf(this.getPalos())>palos.indexOf(c1.getPalos())) {
				valor=-1;
				
			}
			else if(palos.indexOf(this.getPalos())<palos.indexOf(c1.getPalos())) {
				valor=1;
			}
			else {
				if(this.valor<c1.valor) {
					valor=-1;
				}
				else if(this.valor>c1.valor) {
					valor=1;
				}
			}
		
		
		return valor;
	}
	
}
