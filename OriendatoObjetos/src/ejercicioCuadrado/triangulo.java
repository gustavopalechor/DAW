package ejercicioCuadrado;

public class triangulo {

	public static void main(String[] args) {
		int base=6;
		int altura=6;
		for(int i = 0; i<altura; i++) {
			
				for (int j = 0; j <base; j++) {
					
				if(i==altura-1 || j==base-1 || j==(base-1)-i || j>(base-1)-i ) {
					System.out.print("*");
				}
				
				System.out.print("\t");
			}
				
			System.out.print("\n");
			
		}

	}

}
