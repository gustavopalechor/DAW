import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String palabra;
		int contador=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Escribe una palabra");
		palabra= scan.nextLine();
		
		while (contador<palabra.length()) {
			System.out.println(palabra.charAt(contador));
			contador++;
			
			
		}
		scan.close();
	}

}
