package repaso1EvaEjercicio2;

import java.util.Random;

public class ejercicio2 {

	public static void main(String[] args) {
		int numero1=0;
		int numero2;
		Random r1= new Random();
		numero2= r1.nextInt(6);
		for(int j=0; j<=6; j++) {
			for(int i=0; i<=6; i++) {
			System.out.println(j + "|" + i);}
			System.out.println("");
		}
		
		  
			  for(int i=0; i<=10; i++) {
				  for(int j=0; j<=2; j++) {
					  if(i==0 || j==0 || i==10 || j==2 || i==5) {
					  System.out.print("*");
					  
					  }
					  System.out.print("\t");
				  }
				  System.out.println("");
			  }
		  		 
		  		  
			  
		 
		  
		 

	}

	}
