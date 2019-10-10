package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
	public static String adivinar(String mes, int dia) {
			String  estacion = " ";
			switch (mes) {
			case "diciembre": if(dia>=21) System.out.println("Estamos en invierno"); else System.out.println("Estamos en otoño");
			break;
			case "enero":
			case "febrero": estacion="Estamos en invierno";
			break;
			case "marzo":	if(dia>=21) System.out.println("Estamos en primavera"); else System.out.println("Estamos en invierno");
			case "abril":
			case "mayo": estacion="Estamos en primavera";
			break;
			case "junio":	if(dia>=21) System.out.println("Estamos en verano"); else System.out.println("Estamos en primavera");
			case "julio":
			case "agosto": estacion="Estamos en verano";
			break;
			case "septiembre":	if(dia>=21) System.out.println("Estamos en otoño"); else System.out.println("Estamos en verano");
			case "octubre":
			case "noviembre": estacion="Estamos en otoño";	
			break;
			default:
				break;
			}
			return estacion;
		
	}
	

	public static void main(String[] args) {
		int dia;
		String mes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Saber en que estación estamos ");

		System.out.println("Introduce el mes");
		mes = scan.next().toLowerCase();
		System.out.println("Introduce el día ");
		dia = scan.nextInt();
		System.out.println(adivinar(mes,dia));
		scan.close();
	}

}
