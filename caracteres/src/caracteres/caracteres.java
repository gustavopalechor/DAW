package caracteres;

import java.util.Scanner;

public class caracteres {
	public static void main(String[] args) {
		char c ='c';
		int i=5;
		boolean respuesta=false;
		Scanner scan= new Scanner (System.in);
		
		c= (char)((int)c -27); //utizar la tabla de unicodes y forzar a un tipo de variable ser de otro tipo
		
		System.out.println(c);
		respuesta= i<6;
		System.out.println(!respuesta); //con el ! quiere decir lo contrario a lo que siga
		
		respuesta= i<6 && i<4;
		System.out.println(!respuesta); // con && los dos tienen que ser iguales para ser true sino siempre va a ser false
		
		respuesta= i<6 || i>3 || (!respuesta); // con || si hay un true va a resultar siempre true, para ser false todos tienen que ser false
		System.out.println(!respuesta);	// el == es un comparador;
		
		String palabra= "Hola que tal";
		System.out.println(palabra.equalsIgnoreCase("hola que tal")); //ignora la mayuscula
		
		System.out.println("Quieres seguir jugando? ");
		respuesta=(scan.next()).toLowerCase().equals("si");
		
		scan.close();
		
	}
}
