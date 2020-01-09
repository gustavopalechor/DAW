package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;



public class ExpresionesRegulares {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String palabra;
		String palabra1;
		
		  String control="(?i)[a-z]{2,}@(gmail|hotmail)[.]{1}(com|es|net)";
		  System.out.println("Introduce correo electronico:"); palabra=scan.next();
		  System.out.println(Pattern.matches(control, palabra)); System.out.println();
		  
		  String palabra2; String control2="([a-z]|\\d){1,}";
		  System.out.println("Introduce una palabra con minusculas o numeros");
		  palabra2=scan.next(); System.out.println(Pattern.matches(control2,
		  palabra2));
		  
		  System.out.println();
		  
		  String palabra3; String control3="[a-zA-Z]{2,}\\w{0,}";
		  System.out.println("Introduce una palabra con minusculas o numeros");
		  palabra3=scan.next(); System.out.println(Pattern.matches(control3,
		  palabra3));
		 
		
		System.out.println();
		String control1="[A-Z]{2}[a-z]{1,}\\s{1}[a-z]{1,}[@]{1}(gmail|hotmail)[.]{1}(com|es|net)";
		System.out.println("Introduce correo electronico:");
		palabra1=scan.nextLine();
		System.out.println(Pattern.matches(control1, palabra1));
		scan.close();
	}

}
