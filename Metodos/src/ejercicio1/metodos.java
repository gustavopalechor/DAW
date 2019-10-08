package ejercicio1;
import java.util.Scanner;

public class metodos {
	
	public static float multiplicacion (float valor1, float valor2) {
		/*float resultado;
		resultado = valor1*valor2;*/
		return valor1*valor2;
	}
	
	public static float suma (float valor1, float valor2) {
		float resultado;
		resultado = valor1+valor2;
		return resultado;
	}
	public static float dividir (float valor1, float valor2) {
		float resultado;
		resultado = valor1/valor2;
		return resultado;
	}

	public static void main(String[] args) {
		float valor1=0.0f; 
		float valor2=0.0f;
		char operacion;
		Scanner scan = new Scanner(System.in);
		System.out.println("\t La calculadora\n\nsuma \t multiplicacion\t division\n");
		System.out.println("Introduce el primer valor");
		valor1 = scan.nextFloat();
		System.out.println("Introduce el segundo valor");
		valor2 = scan.nextFloat();
		
		System.out.println("que quieres realizar una suma o una multiplicacion");
		operacion = scan.next().toLowerCase().charAt(0);
		
		switch (operacion) {
		case 'm':	System.out.println("El resultado es: " + multiplicacion(valor1,valor2));
			break;
		case 's':	System.out.println("El resultado es: " + suma(valor1, valor2));
			break;
		case 'd': System.out.println("El resultado es: "+ dividir(valor1,valor2));
		default: System.out.println("La operacion introducia no corresponde a ninguna");
			break;
		}
		System.out.println("Fin");
		scan.close();
	}

}
