package Estructuras;

import java.util.Scanner;

public class ejercicioFor {
	
	public static int resultado(String contraseņa) {
		char letra= ' ';
		int opcion=0;
		for(int i=0; i < contraseņa.length(); i++) {
			letra=contraseņa.charAt(i);
			if(contraseņa.length()<8) {
			
			return 1;}
			
			if(letra>=33 && letra<=96) {
				opcion=opcion + 2;
			}
			else if((contraseņa.length()>=8) && (letra>=97 && letra<=122)) {
				opcion= opcion + 1;
			}
			
		}
		return opcion;
	}

	public static void main(String[] args) {
		String contraseņa;
		int solucion;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce tu contraseņa");
		contraseņa= scan.next();
		
		solucion = resultado(contraseņa); 
		
		if(solucion==1) { System.out.println("Contraseņa demasiado corta");}
		else if (solucion>contraseņa.length() && solucion<contraseņa.length()+8) { System.out.println("Contraseņa poco segura");}
		else if (solucion>contraseņa.length()+8) { System.out.println("Contraseņa segura");}
		/*case 1: System.out.println("Contraseņa demasiado corta");
			break;
		case 2:
		case 3:
		case 4: System.out.println("Contraseņa poco segura");
		break;
		case 5: 
		
		
		default:
			break;
		}*/	
			

		scan.close();
	}

}
