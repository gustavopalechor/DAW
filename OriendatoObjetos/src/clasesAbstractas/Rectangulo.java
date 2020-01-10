package clasesAbstractas;

public class Rectangulo extends FiguraGeometrica{

	@Override
	void dibujar() {
		for(int i=0; i<getLado(); i++) {
			for(int j=0; j<getLado(); j++) {
			if(i==0 || j==0 || i==getLado()-1 || j==getLado()-1) {
				System.out.print("*");}
			System.out.print("\t");
			
			}
			System.out.println();
			
		}
	}
	
}
