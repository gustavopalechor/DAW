import java.util.Scanner;

public class Ejercicio5 {
	
public static void main(String[] args) {
		String palabra1;
		String palabra3 ="";
		
		int contador1=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Escribe una palabra");
		palabra1= scan.nextLine();
		contador1= palabra1.length()-1; //con esto sabemos la longitud de la palabra y como despues de una palabra hay siempre un \n se resta 1
		while (contador1>=0) {
			
			palabra3 = palabra3 + palabra1.charAt(contador1);
			
			contador1--;
						
		}
		System.out.println(palabra3);
		if (palabra1.compareTo(palabra3) == 0) { 
			System.out.println("son iguales");
		}
		else System.out.println("no son iguales");
		scan.close();
	}

}