package ev1PalechorGustavoEjercicio3;

import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		String palabra;
		
		char letra;
		int contador=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce una frase:");
		palabra= scan.nextLine().toUpperCase();
		
		
		for(int i=0; i<=palabra.length()-1; i++) {
			palabra.replace(" ", "\n");
			letra=palabra.charAt(i);
			if(letra==' ' || letra=='\n') {
				
				System.out.println(palabra.substring(contador, i)+ " " + ((i-contador)));
				contador=i+1;
			}
		}
		scan.close();
	}

}
