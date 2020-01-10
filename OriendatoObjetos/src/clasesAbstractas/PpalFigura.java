package clasesAbstractas;

public class PpalFigura {

	public static void main(String[] args) {
		
		FiguraGeometrica varFG= new Rectangulo();
		FiguraGeometrica varFG1= new Triangulo();
		
		varFG.dibujar();
		System.out.println();
		varFG1.dibujar();
	}

}
