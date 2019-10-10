package ejercicio3;

import java.util.Scanner;



public class ejercicio3 {
	
	public static String saberCiclo (int ciclo) {
		String gradoCiclo;
				switch (ciclo) {
				case 1:
				case 2: gradoCiclo="Primer ciclo";
					break;
				case 3:
				case 4: gradoCiclo="Segundo ciclo";
					break;
				case 5:
				case 6: gradoCiclo="Tercer ciclo";
					break;
				default: gradoCiclo="Los datos introducidos no son validos";
					break;
				}
		
		return gradoCiclo;
	}
	
	public static void main(String[] args) {
		String nombreAlumno;
		int ciclo;
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Nombre alumno: ");
		nombreAlumno=scan.next();
		
		System.out.println("ciclo: ");
		ciclo=scan.nextInt();
		
		System.out.println(nombreAlumno + " pertenece al " + saberCiclo(ciclo));
		scan.close();
	}
}
