package Estructuras;

import java.util.Scanner;

public class ejercicioFor {
	
	public static int resultado(String contrase�a) {
		char letra= ' ';
		int opcion=0;
		for(int i=0; i < contrase�a.length(); i++) {
			letra=contrase�a.charAt(i);
			if(contrase�a.length()<8) {
			
			return 1;}
			
			if(letra>=33 && letra<=96) {
				opcion=opcion + 2;
			}
			else if((contrase�a.length()>=8) && (letra>=97 && letra<=122)) {
				opcion= opcion + 1;
			}
			
		}
		return opcion;
	}

	public static void main(String[] args) {
		String contrase�a;
		int solucion;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce tu contrase�a");
		contrase�a= scan.next();
		
		solucion = resultado(contrase�a); 
		
		if(solucion==1) { System.out.println("Contrase�a demasiado corta");}
		else if (solucion>contrase�a.length() && solucion<contrase�a.length()+8) { System.out.println("Contrase�a poco segura");}
		else if (solucion>contrase�a.length()+8) { System.out.println("Contrase�a segura");}
		/*case 1: System.out.println("Contrase�a demasiado corta");
			break;
		case 2:
		case 3:
		case 4: System.out.println("Contrase�a poco segura");
		break;
		case 5: 
		
		
		default:
			break;
		}*/	
			

		scan.close();
	}

}
