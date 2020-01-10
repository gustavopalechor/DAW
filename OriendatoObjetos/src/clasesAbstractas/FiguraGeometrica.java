package clasesAbstractas;

abstract class FiguraGeometrica {
	private int lado=10;
	abstract void dibujar();
	public FiguraGeometrica(int lado) {
		super();
		this.lado = lado;
	}
	
	public FiguraGeometrica() {
		super();
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
}
