package dibujos;

import java.util.Scanner;

public class triangulorevez {

	public static void main(String[] args) {
		
		int altura, base;
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduce la base del triangulo");
		base = scan.nextInt();
		System.out.println("Introduce la altura del triangulo");
		altura = scan.nextInt();
		int x=1;
		for(int i=0; i<altura; i++) {
			for(int j=0; j<base; j++) {
				if(j==0 || i==0 || j==base-x ) {
					System.out.print("*");
				}
				System.out.print("\t");
			}
			System.out.println("\n");
			x++;
		}

		scan.close();
	}

}
