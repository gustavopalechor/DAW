import java.util.Scanner;

public class ejerciciofor {

	public static int resultado(String contraseña) {
		char letra= ' ';
		int opcion=contraseña.length();
		if(contraseña.length()<8) {	return 1;}
		
		
		for(int i=0; i < contraseña.length(); i++) {
			letra=contraseña.charAt(i);
						
			if(letra>=33 && letra<=96) {
				opcion=opcion + 2;
			}
			else if((contraseña.length()>=8) && (letra>=97 && letra<=122)) {
				opcion= opcion + 1;
			}
			
		}
		return opcion;
	}

	public static void main(String[] args) {
		String contraseña;
		int solucion;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce tu contraseña");
		contraseña= scan.next();
		
		solucion = resultado(contraseña); 
		
		if(solucion==1) { System.out.println("Contraseña demasiado corta");}
		else if ((solucion>contraseña.length()) && (solucion<contraseña.length()+10)) { System.out.println("Contraseña poco segura");}
		else if (solucion>contraseña.length()+10) { System.out.println("Contraseña segura");}
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
