import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
	int h;
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Introduce un numero de mas de 3 cifras: ");
	h= scan.nextInt();
	
	
	
	for(int i=0; i<3;i++) {
		h=h/10+0;
		
	}
	for(int j=0; j<3; j++) {
		h=h*10 + 0;
	}
	System.out.println(h);
	scan.close();
	}

}
