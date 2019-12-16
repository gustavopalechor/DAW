package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;



public class ExpresionesRegulares {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String palabra;
		String palabra1;
		String control="(?i)[a-z]{2,}[@]{1}(gmail|hotmail)[.]{1}(com|es|net)";
		System.out.println("Introduce correo electronico:");
		palabra=scan.next();
		System.out.println(Pattern.matches(control, palabra));

		System.out.println();
		String control1="[A-Z]{2}[a-z]{1,}[ ]{1}[a-z]{1,}[@]{1}(gmail|hotmail)[.]{1}(com|es|net)";
		System.out.println("Introduce correo electronico:");
		palabra1=scan.next();
		System.out.println(Pattern.matches(control1, palabra1));
	}

}
