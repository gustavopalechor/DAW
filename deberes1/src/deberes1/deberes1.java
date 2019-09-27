package deberes1;

import java.util.Scanner;

public class deberes1 {

	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		Scanner scan= new Scanner(System.in);
		System.out.println("Escribe la primera palabra: ");
		palabra1= scan.next();
		System.out.println("Escribe la segunda palabra: ");
		palabra2= scan.next();
		
		System.out.println(palabra1.charAt(0)+ 
				palabra1.substring(palabra1.length()-2, palabra1.length()));
		
		System.out.println(palabra2.charAt(0)+ 
				palabra2.substring(palabra2.length()-2, palabra2.length()));

		scan.close();
	}

}
