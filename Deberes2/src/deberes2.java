import java.util.Scanner;

public class deberes2 {

	public static void main(String[] args) {
		boolean comparador=false;
		int i= 0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		i=scan.nextInt();
		
		comparador= i<34 && i>15;
		System.out.println(comparador+"\n");
		
		System.out.println("Introduce otro numero: ");
		i=scan.nextInt();
		comparador= i>=0 && i<100;
		System.out.println(comparador+"\n");
		
		System.out.println("Introduce otro numero: ");
		i=scan.nextInt();
		comparador= (i<34 && i>15) || (i<70 && i>50);
		System.out.println(comparador+"\n");
		
		System.out.println("Introduce otro numero: ");
		i=scan.nextInt();
		comparador= i%2==0 && i<100;
		System.out.println(comparador + "\n");
		
		System.out.println("Introduce otro numero: ");
		i=scan.nextInt();
		comparador= i>5 || i<=27;
		System.out.println(comparador + "\n");
		
		System.out.println("Introduce otro numero: ");
		i=scan.nextInt();
		comparador= (i==25 || i>100) || (i<7 && i>3);
		System.out.println(comparador + "\n");
		
		scan.close();

	}

}
