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
		if(palabra.charAt(1)>= 65 &&  palabra.charAt(1)<=90) {
			System.out.println("Es una letra mayúscula");
		}else if (palabra.charAt(1)>= 97 && palabra.charAt(1)<=122) { 
				System.out.println("Es una letra minúscula");
		
		}
		else System.out.println("Es otro tipo de caracter");
		
		/* Ejercicio 4 */
		
		System.out.println("Introduce un caracter: ");
		caracter= scan.next().charAt(0);
		if (caracter==58 || caracter== 42 || caracter== 63 || caracter== 86) {
			System.out.println("Es un caracter prohibido: ");
		}
		else System.out.println("Es un caracter permitido");
		
		/* Ejercicio 5 */
		float peso=0.0f;
		float altura=0.0f;
		float IMC=0.0f;
		System.out.println("Introduce tu peso: ");
		peso = scan.nextFloat();
		System.out.println("Introduce la altura en centimetros: ");
		altura=scan.nextFloat();
		IMC=peso/altura;
		if (IMC<=18.5) System.out.println("Usted tiene delgadez");
		if (IMC>=18.5 && IMC<=24.9) System.out.println("Usted es normal");
		if (IMC>=25.0) System.out.println("Usted esta gordit@");
		
		/* Ejercicio 6 */
		String genero;
		System.out.println("Introduce tu peso: ");
		peso = scan.nextFloat();
		System.out.println("Introduce la altura en centimetros: ");
		altura=scan.nextFloat();
		System.out.println("Introduce tu género: (varon o mujer)");
		genero = scan.next();
		IMC=peso/altura;
		if(genero.toLowerCase().equals("varon")) {
		if (IMC<=18.5) { System.out.println("Usted es flaquito");}
		else if (IMC>=18.5 && IMC<=27.0) { System.out.println("Usted es normal");}
		else System.out.println("Usted esta gordito");
		}
		else if(genero.toLowerCase().equals("mujer")) {
			if (IMC<=18.5) System.out.println("Usted tiene delgadez");
			else if (IMC>=18.5 && IMC<=24.9) { System.out.println("Usted es normal");}
			else System.out.println("Usted esta gordita");
		}
		else System.out.println("usted es un extraterrestre");
		
		/* Ejercicio 7 */
		int numero1 = 0;
		int numero2 = 0;
		String operacion="";
		System.out.println("Introduce el primer número: ");
		numero1= scan.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2= scan.nextInt();
		System.out.println("desea multiplicar los numeros o sumar: ");
		operacion= scan.next();
		
		scan.close();
		
	}

}
