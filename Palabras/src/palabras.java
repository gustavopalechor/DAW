import java.util.Scanner;

public class palabras {

	public static void main(String[] args) {
		String palabra;
		String palabra2;
		Scanner scan= new Scanner(System.in);
		System.out.println("Escribe la primera palabra: ");
		palabra= scan.next();
				
		System.out.println("Escribre la segunda palabra: ");
		palabra2= scan.next();
		
		System.out.println("La primera de cada palabra es: \n" + palabra.charAt(0)
		+"\t" + palabra2.charAt(0));


	}

}
