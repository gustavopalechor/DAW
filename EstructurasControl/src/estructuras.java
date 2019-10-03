import java.util.Scanner;

public class estructuras {

	public static void main(String[] args) {
		int x=0;
		
		Scanner scan=new Scanner(System.in);
		
		//Ejercicio 1
		System.out.println("Introduce un número: ");
		x= scan.nextInt();
		
		if(x%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		

		/*	Ejercicio 2	*/
		
		char caracter;
		System.out.println("Introduce un caracter: ");
		caracter= scan.next().charAt(0);
		
		if((caracter>=48) && (caracter<=57) ) {
			System.out.println("Es un digito");
		}
		else System.out.println("No es un digito");
		
		/*	Ejercicio 3	*/
		
		String palabra;
		System.out.println("Introduce una palabra");
		palabra= scan.next();
		if(palabra.charAt(1)>= 65 &&  palabra.charAt(1)<=90) 
			System.out.println("Es una letra mayúscula");
		if (palabra.charAt(1)>= 97 && palabra.charAt(1)<=122) 
				System.out.println("Es una letra minúscula");
		
		
		else System.out.println("Es otro tipo de caracter");
		
		
		
		
			//(palabra.equals())==(palabra.toUpperCase().charAt(1).equals())
		scan.close();
	}

}
