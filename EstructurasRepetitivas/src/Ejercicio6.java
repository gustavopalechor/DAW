import java.util.Scanner;

public class Ejercicio6 {
	
	public static void calculo(String numero1) {
		int contador=1;
		boolean comparador=false;
		String solucion="";
		do {
			comparador=(contador==numero1.length());
			if(comparador){
				
			}
			else if(numero1.charAt(contador)==numero1.charAt(contador--)) {
				solucion="Es un número capicua";
			}
			else solucion="No es capicua";
			
			
			
			contador++;
			
			
		}
		while(contador<=numero1.length());
		System.out.println(solucion);
	}

	public static void main(String[] args) {
		String numero1="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduce un numero y te decimos si es capicua:");
		numero1=scan.next();
		calculo(numero1);
		scan.close();

	}

}
