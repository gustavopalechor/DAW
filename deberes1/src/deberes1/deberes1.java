package deberes1;

import java.util.Scanner;

public class deberes1 {

	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		String palabra3;
		String correo="";
		boolean esCorreo=false;
		palabra3 = "hola";
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe la primera palabra: ");
		palabra1 = scan.next();
		System.out.println("Escribe la segunda palabra: ");
		palabra2 = scan.next();

		System.out.println(
				palabra1.toUpperCase().charAt(0) + palabra1.substring(palabra1.length() - 2, palabra1.length()));

		System.out.println(
				palabra2.toUpperCase().charAt(0) + palabra2.substring(palabra2.length() - 2, palabra2.length()));
		System.out.println(palabra3.toUpperCase().charAt(0)); // sacar una letra en mayuscula indicando la posicion que
																// se encuentra
		System.out.println("Me escribes tu correo"); //Utilizar el boolean para saber si es 
		correo=scan.next();							//un correo electronico	
		esCorreo=correo.contains("@");
		System.out.println("es: "+ esCorreo + " correo");
		scan.close();
	}

}
