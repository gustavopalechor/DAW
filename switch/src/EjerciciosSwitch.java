import java.util.Scanner;

public class EjerciciosSwitch {
	public static void main(String[] args) {
		String mes;
		int dia;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Te diremos la tempora en la que pertenece el mes \n Qué mes te gustaria saber: ");
		mes= scan.next().toLowerCase();
		System.out.println("Introduce el dia");
		dia = scan.nextInt();
		
		switch (mes) {
		case "diciembre": if(dia>21); else;
		case "enero":
		case "febrero":	System.out.println("Estamos en invierno "); break;
		case "marzo":	if(dia>21);
		case "abril":
		case "mayo":	System.out.println("Estamos en primavera"); break;
		case "junio":	if(dia>21);
		case "julio":
		case "agosto":	System.out.println("Estamos en verano"); break;
		case "septiembre":	if(dia>21);
		case "octubre":
		case "noviembre": System.out.println("Estamos en otoño");
		default: System.out.println("El mes introducido no es valido");	break;
		}
		scan.close();
	}
}
