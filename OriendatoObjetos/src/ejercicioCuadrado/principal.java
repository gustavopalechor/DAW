package ejercicioCuadrado;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		float lado1=0.0f;
		float lado2=0.0f;
		int a, b;
		Scanner scan= new Scanner(System.in);
		System.out.println("Cuando mide la altura?:");
		lado1=scan.nextFloat();
		System.out.println("Cuando mide la base?:");
		lado2=scan.nextFloat();
		Cuadrado L1= new Cuadrado();
		L1.setLado1(lado1);
		L1.setLado2(lado2);
		L1.calcularArea();
		L1.calcularPerimetro();
		L1.esCuadrado();
		a=(int) lado1;
		b=(int) lado2;
		
				
		L1.setLado1(a);
		L1.setLado2(b);
		
		L1.pintarCuadrado(L1.Lado1, L1.Lado2);
	
		scan.close();
	}

}
