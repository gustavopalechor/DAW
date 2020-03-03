package ejercicio2;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		char[] letras= {'A','B', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'L',  'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'W', 'Y', 'Z'};
		Random ran= new Random();
		int numero=0;
		char[][] arrayCaracteres= new char[12][12];
		for(int i=0; i<12; i++) {
			for(int j=0; j<12; j++) {
				numero= ran.nextInt(25);
				arrayCaracteres[i][j]=letras[numero];
			}
		}
		for(int i=0; i<12; i++) {
			for(int j=0; j<12; j++) {
				System.out.print(arrayCaracteres[i][j]);
			}
			System.out.println();
			
		}
		

	}

}
