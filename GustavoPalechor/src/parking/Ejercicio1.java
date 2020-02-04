package parking;


import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		Random ran= new Random();
		String[][] plazas=new String[15][30];
		
		/*
		 * Inicializacion de plazas en "VD"
		 */
		for(int i=0; i<15; i++) {
			for(int j=0; j<30; j++) {
				plazas[i][j]="-VD-";
			}
		}
		
		/*
		 * Modificacion de plazas ocupadas
		 */
		for(int i=0; i<100; i++) {
				int filas= ran.nextInt(15);
				int columnas= ran.nextInt(30);
				if(plazas[filas][columnas]=="-VD-") {
				plazas[filas][columnas]="-RR-";
				}
				else if(plazas[filas][columnas]=="-RR-") {
					filas= ran.nextInt(15);
					columnas= ran.nextInt(30);
					
					plazas[filas][columnas]="-RR-";
				}
			
		}
		/*
		 * Obtener numero de plazas libres en cada fila
		 */
		
		for(int i=0; i<15; i++) {
			int contador=0;
			for(int j=0; j<30; j++) {
				if(plazas[i][j]=="-VD-") {
					contador++;
				}
				System.out.print(plazas[i][j]);
			}
			System.out.print(" Libres :" + contador);
			System.out.println();
		}
		
			
	}
}
