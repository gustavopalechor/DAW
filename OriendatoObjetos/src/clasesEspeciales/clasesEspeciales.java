package clasesEspeciales;

import java.util.Random;
import java.util.Scanner;

public class clasesEspeciales {

	public static void main(String[] args) {
		int num1;
		int num2=0;
		Random num= new Random(2);
		Scanner scan= new Scanner(System.in);
		num1=num.nextInt(4);
		
		/*
		 * for(int i=0; i<=4; i++) {
		 * System.out.println("Adivina el numero entre 1 y 4"); num2= scan.nextInt();
		 * if(num1==num2) { System.out.println("Has ganado!"); i=2; }
		 * 
		 * }
		 * 
		 * if(num1!=num2) { System.out.println("Has perdido"); }
		 */
		System.out.println(num1);
		System.out.println(num1);
		scan.close();
		
	}

}
