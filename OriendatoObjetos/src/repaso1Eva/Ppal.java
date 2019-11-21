package repaso1Eva;

import java.util.Scanner;

public class Ppal {
	public static void menu() {
		int i=0;
		
		while(i<6) {
			System.out.print("*");
			System.out.print("\t");
			i++;
		}
		System.out.println();
		System.out.println("|1 -- Insertar nueva señal informativa |");
		System.out.println("|2 -- Insertar nueva señal prohibitiva |");
		System.out.println("|3 -- Salir |");
		
		i=0;
		while(i<6) {
			System.out.print("*");
			System.out.print("\t");
			i++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int opcion=0;
		
		String texto=" ";
		while(opcion<3) {
			menu();
		System.out.println("Introducir opcion: ");
		opcion=scan.nextInt();
		switch (opcion) {
		case 1:Informativa i1= new Informativa();
				i1.setIdSenial(1);
				
				System.out.println("Introducir el numero de la señal");
				i1.setNum(scan.nextInt());
				System.out.println("Introducir nombre y descripcion de la señal");
				scan.nextLine();
				texto=scan.nextLine();
				i1.setTexto(texto);
				
				i1.pintar();
				
			break;
		case 2: Prohibitiva p1= new Prohibitiva();
				System.out.println("Introducir nombre del archivo: ");
				p1.setNombreArchivoImagen(scan.next());
				scan.nextLine();
				System.out.println("Introducir descripcion de la señal: ");
				p1.setTexto(scan.nextLine());
				System.out.println("Introducir el alto de la imagen:");
				p1.setAlto(scan.nextInt());
				System.out.println("Introducir el ancho de la imagen:");
				p1.setAncho(scan.nextInt());
				p1.pintar();
		break;
		case 3: System.out.println();  System.out.println("Cerrado correctamente");
		break;
		default: System.out.println("Dato introducido incorrecto");
		break;
		}
		}
		scan.close();
		
	}

}
