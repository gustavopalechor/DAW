package arrys;

import java.util.Arrays;
import java.util.Scanner;
public class DiasSemana {

	public static void main(String[] args) {
		String[] diasSemana= {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		String dia;
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Qué dia de la semana es?");
		dia= scan.next().toLowerCase();
		
		for(int i=0; i<7; i++) {  
			if(diasSemana[i].equals(dia)) {  
				if(i==6) {
					System.out.println(diasSemana[0]);
				}
				else if(i<6) {
				System.out.println(diasSemana[i+1]);
				}
				i=7;
				
			}
			System.out.println(Arrays.toString(diasSemana));
			
		}
		scan.close();
		
		

	}
	}
