package Collections.juegoBaraja.ejer2;

public class Cartas {

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
}
