package clasesAbstractas;

public class Triangulo extends FiguraGeometrica{

	@Override
	void dibujar() {
		for(int i=0; i<getLado(); i++) {
			for(int j=0; j<getLado(); j++) {
				if(i==0 || j==getLado()-1 || (j==i || j>i)  ) {
					System.out.print("*");
					
				}
				System.out.print("\t");
				
			}
			System.out.println();
		}
	}
}
