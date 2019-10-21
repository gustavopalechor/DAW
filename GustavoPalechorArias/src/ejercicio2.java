import java.util.Scanner;

public class ejercicio2 {
	
	
	public static void mayusculas(String palabra) {
		String palabra2;
		palabra2 = palabra.toUpperCase();
		System.out.println(palabra2);
	}
	
	public static void minusculas(String palabra) {
			String palabra2;
			palabra2 = palabra.toLowerCase();
			System.out.println(palabra2);
		
	}
	
	public static void primerosCaracteres(String palabra) {
		String palabra2;
		palabra2= palabra.substring(0, 10);
		System.out.println(palabra2);
	}
	
	public static void ultimosCaracteres(String palabra) {
		String palabra2;
		palabra2= palabra.substring(palabra.length()-10, palabra.length());
		System.out.println(palabra2);
	}
	
	public static void especial(String palabra) {
		String palabra2="";
			
		for(int i=0; i<palabra.length()-10; i++) {
			palabra2= palabra2 + "*";
		}
		palabra2= palabra2 + palabra.substring(palabra.length()-10, palabra.length());
		System.out.println(palabra2);
	}

	public static void main(String[] args) {

		String palabra;
		int opcion;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		palabra= scan.nextLine();
		
		if(palabra.length()<11) {
							
		  while (palabra.length()<11) {
			  System.out.println("Introduce una palabra de mas de 11 caracteres: ");
				palabra=scan.nextLine();
		  }
		}
		System.out.println("Que deseas realizar con esta palabra: \n" + 
				"1. Toda la frase en mayúsculas \n" +
				"2. Toda la frase en minúscula \n" +
				"3. Los 10 primeros caracteres de la frase \n"+
				"4. Los 10 ultimos caracteres de la frase \n" +
				"5. Los 10 últimos caracteres de la frase, mostrando el resto con * \n"+
				"6. Nada \n");
		opcion=scan.nextInt();
		
		switch(opcion) {
		case 1: mayusculas(palabra);
			break;
		case 2: minusculas(palabra);
			break;
		case 3: primerosCaracteres(palabra);
			break;
		case 4: ultimosCaracteres(palabra);
			break;
		case 5: especial(palabra);
			break;
		case 6: System.out.println("Fin");
			break;
		default: System.out.println("Dato incorrecto");
			break;
			
		}
		
	
	scan.close();
	}

}
