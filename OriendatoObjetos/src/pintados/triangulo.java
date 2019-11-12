package pintados;

public class triangulo {

	public static void main(String[] args) {
		int num1=6;
		int num2=5;
		int contador=1;
		
		  for(int i=0; i<num1; i++){
		  
		  for(int j=0; j<=i; j++) { if(i==num1-1 || j==0|| i==j || j<=i ) {
		  System.out.print(contador); contador++; } System.out.print("\t");
		  
		  } System.out.print("\n");
		  
		  }
		 
		System.out.println();
		System.out.println();
		for(int i=0; i<num1; i++) {
			for(int j=num2; j>i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
