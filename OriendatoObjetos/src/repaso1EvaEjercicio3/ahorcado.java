package repaso1EvaEjercicio3;

import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {
		String palabra=" ";
		String acertadas="";
		int vidas=5;
		int contador=0;
		int ganar=0;
		char letra=' ';
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce la palabra sin espacios: ");
		palabra= scan.next().toLowerCase();
		
		while(vidas>0 && ganar<palabra.length()) {
			System.out.println();
			System.out.println("-Vidas restantes= " + vidas + "\n" + "-Total letras acertadas= " + ganar +"\n" +"-Letras acertadas= " + acertadas );
			System.out.println();
		for(int i=0; i<palabra.length(); i++) {
			System.out.print("_");
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("Introduce una letra= ");
		letra= scan.next().charAt(0);
		for(int j=0; j<palabra.length(); j++) {
			if(palabra.charAt(j)==letra) {
			contador++;
			System.out.println("Letra acertada= " + letra);
			acertadas=acertadas+palabra.charAt(j);
			}
		}
		if(contador==0) {
			vidas--;
		}
		else if(contador>0) ganar++;
		
		if(ganar>=palabra.length()-1) {
			System.out.println("Has ganado!");
			System.out.println("Total letras acertadas= "+ acertadas);
			
		}
		if(vidas==0) {
			System.out.println("Has perdido");
		}
		contador=0;
		}
		scan.close();
	}
	

}
