package arrys;

import java.util.Arrays;
import java.util.Random;

public class EjercicioFIlas {

	public static void mezclarBaraja(int[] baraja) {
		Random ran= new Random();
		int num1=0;
		
		for(int i=0; i<6; i++) {
			num1=ran.nextInt(6);
			baraja[i]=num1;
		}
			
	}
	
	public static  void pintarBaraja(int[] baraja) {
		Random ran= new Random();
		int num1=0; 
		for(int i=0; i<2; i++) {
		num1= ran.nextInt(6);
		System.out.println(baraja[num1]);}
	}
	public static void main(String[] args) {
		int[] baraja= new int[6];
		
	
		
		mezclarBaraja(baraja);
		System.out.println(Arrays.toString(baraja));
		pintarBaraja(baraja);
	}
}
