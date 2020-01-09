package ejerciciosVacaciones;

import java.util.Random;
import java.util.Scanner;

public class TresenRaya {

	public static void main(String[] args) {
		Random ran= new Random();
		int id=0;
		boolean acierto=false;
		int[] posicion= new int[2];
		int[] posicionMaquina= new int[2];
		
		String nombre;
		Scanner scan= new Scanner(System.in);
		Jugador p1= new Jugador();
		
		char[][] Jugador=new char[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				Jugador[i][j]=' ';
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("|"+Jugador[i][j]+"|");
			}
			System.out.println();
		}
		
		System.out.println("Introduce nombre del jugador=");
		nombre= scan.nextLine();
		p1.CrearJugador(nombre, id);
		
		
		System.out.println(p1.NomJugador+" vas a realizar el juego ¡3 en raya! jugaras contra la maquina");
		for(int x=0; x<5; x++) {
		System.out.println("Tú eres la \"x\" ingresa la primera posición");
		
		System.out.println("Primero deberas ingresar las filas y depúes la columna empezando desdel 0");
		posicion[0]=scan.nextInt();
		
		System.out.println("Ahora la columna");
		posicion[1]=scan.nextInt();
		Jugador[posicion[0]][posicion[1]]='x';
		
		posicionMaquina[0]=(int)(ran.nextDouble()*3+0);
		posicionMaquina[1]=(int)(ran.nextDouble()*3+0);
		
		while(acierto=false) {
		if(Jugador[posicionMaquina[0]][posicionMaquina[1]]=='x') {
			posicionMaquina[0]=(int)(ran.nextDouble()*3+0);
			posicionMaquina[1]=(int)(ran.nextDouble()*3+0);
			if(Jugador[posicionMaquina[0]][posicionMaquina[1]]!='x') {
				acierto=true;
			}
		}
		else {
			acierto=true;
		}
		}

		Jugador[posicionMaquina[0]][posicionMaquina[1]]='O';
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("|"+Jugador[i][j]+"|");
			}
			System.out.println();
		}
		}
	
	
		scan.close();
	}
	
	

}
