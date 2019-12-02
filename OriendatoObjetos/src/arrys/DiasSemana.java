package arrys;

import java.util.Scanner;
public class DiasSemana {

	public static void main(String[] args) {
		String[] diasSemana= {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		String dia;
		String dia1;
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Qué dia de la semana es?");
		dia= scan.next().toLowerCase();
		
		for(int i=0; i<7; i++) {  
			if(diasSemana[i].equals(dia)) {  
				dia1=diasSemana[i+1];
				System.out.println(dia1);
				i=7;
				
			}
			
		}
		scan.close();
		
		

	}
	}
