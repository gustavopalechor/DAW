import java.util.Scanner;

public class deberes2 {

	public static void main(String[] args) {
		boolean comparador = false;
		
		int i = 0;
		int c = 0;
		String estacion;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		i = scan.nextInt();

		comparador = i < 34 && i > 15;
		System.out.println(comparador + "\n");

		System.out.println("Introduce otro numero: ");
		i = scan.nextInt();
		comparador = i >= 0 && i < 100;
		System.out.println(comparador + "\n");

		System.out.println("Introduce otro numero: ");
		i = scan.nextInt();
		comparador = (i < 34 && i > 15) || (i < 70 && i > 50);
		System.out.println(comparador + "\n");

		System.out.println("Introduce otro numero: ");
		i = scan.nextInt();
		comparador = i % 2 == 0 && i < 100;
		System.out.println(comparador + "\n");

		System.out.println("Introduce otro numero: ");
		i = scan.nextInt();
		comparador = i > 5 || i <= 27;
		System.out.println(comparador + "\n");

		System.out.println("Introduce otro numero: ");
		i = scan.nextInt();
		comparador = (i == 25 || i > 100) || (i < 7 && i > 3);
		System.out.println(comparador + "\n");

		System.out.println("Que estación estamos: ");
		estacion = scan.next();
		System.out.println("Introduce la temperatura: ");
		i = scan.nextInt();
		System.out.println("Introduce la humedad: ");
		c = scan.nextInt();
		comparador = (estacion.toLowerCase().equals("otoño")) && (i < 15) && (c > 25);
		System.out.println(comparador + "\n");
		
		System.out.println("Es de ciclo?");
		boolean esDeCiclo = false;
		esDeCiclo=scan.nextBoolean();
		System.out.println("Edad del alumno: ");
		i = scan.nextInt();
		comparador= i<16 && (!esDeCiclo);
		System.out.println(comparador + "\n");
		
		
		scan.close();

	}

}
