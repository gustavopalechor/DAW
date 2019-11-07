package dibujos;

import java.util.Scanner;

public class arbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int altura, base;
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduce la base del triangulo");
		base = scan.nextInt();
		System.out.println("Introduce la altura del triangulo");
		altura = scan.nextInt();
		int x=0;
		for(int i=0; i<altura; i++ ) {
			for(int j=0; j<base; j++) {
				if (i == altura - 1 || j == ((base) / 2)  || (i>0 && j==(base/2)-x) || (i>0 && j==(base/2)+x) || (j==0 && i==altura-1) || (j==base-1 && i==altura-1) ) {
					System.out.print("*");
				}
				
			}
			System.out.println("\n");
			x++;
		}

		scan.close();
	}

}
