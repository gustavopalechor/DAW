package arrys;

import java.util.Arrays;
import java.util.Random;

public class EjerciciosArrays {

	public static void main(String[] args) {
		int []numeros= new int[8];
		int []num=new int[10];
		int num1;
		int num2=0;
		Random ran= new Random();
		
		
		for(int i=0; i<8; i++) {
			numeros[i]=ran.nextInt(8);
		}
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(numeros));
		
		if(numeros[4]>numeros[7]) {
			System.out.println("La posición 4 es mayor que la 7");
		}
		else if(numeros[4]<numeros[7]) {
			System.out.println("La posición 8 es mayor que la 4");
		}
		num1=numeros[4];
		numeros[4]=numeros[7];
		numeros[7]=num1;
		System.out.println(Arrays.toString(numeros));
		
		for(int i=0; i<10; i++) {
			
			num1=ran.nextInt(10);
			for(int j=0; j<10; j++) {
				
				if(num[j]==num1) {
					num2++;
				}
				
			}
			if(num2<1) {
				num[i]=num1;
			}
			else if(num2>=1) {
				i--;
				
			}
			num2=0;
			
		}
		System.out.println(Arrays.toString(num));
		
		
		
		
	}

}
