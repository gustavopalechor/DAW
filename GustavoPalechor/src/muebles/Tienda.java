package muebles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Tienda {
	static List<Mueble> muebles= new ArrayList<Mueble>();
	
	static void crear() {
		muebles.add(new Silla("Madera", 21.55F, 35.50F, (new GregorianCalendar(2020,12,03)), 55.25F, 25.66F ));
		muebles.add(new Silla("Plastico", 7.37F, 10.42F, (new GregorianCalendar(2020,02,03)), 63.71F, 43.21F ));
		muebles.add(new Mesa("Metal", 47.55F, 60.00F, (new GregorianCalendar(2019, 01, 23)), 72.88F, 55.33F));
		muebles.add(new Mesa("Madera", 79.88F, 99.95F, (new GregorianCalendar(2019, 12, 11)), 82.88F, 85.33F));
	}
	/*
	 * Creacion menu
	 */
	static void menu(int opcion) {
		switch (opcion) {
		case 1: costeMuebles();
			break;
		case 2: stockMuebles();
			break;
		case 3: costeMuebles1();
			break;
		case 0: System.out.println("El programa ha terminado");
		default:
			break;
		}
	}
	/*
	 * precio venta de todos los muebles
	 */
	static void costeMuebles() {
		float total=0.0F;
			for(Mueble j: muebles) {
				total+=j.getPrecioVenta();
			}
		System.out.println("Total precio de venta de los muebles: "+ total+ "€");
	}
	
	/*
	 * Coste de sillas y mesas por separado
	 */
	static void costeMuebles1() {
		float totalSillas=0.0F;
		float totalMesas=0.0F;
		for(Mueble j: muebles) {
			if(j instanceof Silla) {
				totalSillas+=j.getPrecioCoste();
			}
			else if(j instanceof Mesa) {
				totalMesas+=j.getPrecioCoste();
			}
		}
	System.out.println("Total precio de venta de las sillas: "+ totalSillas +"€" + "\n"
			+ "Total precio de venta de las mesas: "+totalMesas+"€");
		
	}
	/*
	 * stock muebles
	 */
	
	static void stockMuebles() {
		Collections.sort(muebles);
		for(Mueble j: muebles) {
			System.out.println(j);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		crear();
		
		
		int opcion=1;
		while(opcion!=0) {
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println("\tAplicacion de tienda de Muebles\n"
					+ "Escoja la opcion que desee consultar:\n"
					+ "-1- Coste todos los muebles\n"
					+ "-2- Stock actual de muebles\n"
					+ "-3- Coste de sillas y coste de las mesas\n"
					+ "-0- Salir");
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
			opcion= scan.nextInt();
			menu(opcion);
			
		}
		
		scan.close();

	}

}
