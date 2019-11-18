package clasesEspeciales;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class especialCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale local= Locale.getDefault();
		Scanner scan= new Scanner(System.in);
		Calendar fecha= Calendar.getInstance();
		
		System.out.println("Introduce una fecha, primero el dia: ");
		fecha.get(Calendar.DATE);
		fecha.set(Calendar.DATE, scan.nextInt());
		System.out.println("Introduce el mes: ");
		fecha.set(Calendar.MONTH, scan.nextInt());
		System.out.println("Introduce año");
		fecha.set(Calendar.YEAR, scan.nextInt());
		
		System.out.println(fecha.get(Calendar.DATE)+ " de "+ fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, local)+ " del " + fecha.get(Calendar.YEAR));
		for(int i=0; i<4; i++) {
		fecha.add(Calendar.MONTH, 3);
		System.out.println("El "+ fecha.get(Calendar.DATE)+ " de "+ fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, local)
							+ " Ha pasado trimestre" + " del " + fecha.get(Calendar.YEAR));
		}
		/*
		 * System.out.println(fecha.getTime());
		 * 
		 * System.out.println(fecha.get(Calendar.MONTH));
		 */
		
		scan.close();
	}

}
