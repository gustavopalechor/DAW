package ejercicioCuadrado;

public class Cuadrado {
	float Lado1;
	float Lado2;
	
	public Cuadrado() {
		
	}

	public Cuadrado(float lado1, float lado2) {
		Lado1 = lado1;
		Lado2 = lado2;
	}
	
	public static void calcularArea(float Lado1, float Lado2) {
		System.out.println(Lado1*Lado2);
	}
	public static void calcularPerimetro(float Lado1) {
		System.out.println(Lado1*4);
	}
	public static void esCuadrado (float Lado1, float Lado2) {
		if(Lado1==Lado2) {
			System.out.println("Es cuadrado");
		}
		else System.out.println("No es un cuadrado");
	}
	public static void pintarCuadrado(float Lado1, float Lado2) {
		for(float i=0; i<=Lado1; i+0,5) {
			for(float j=0; j<=Lado2; j+0,5) {
				if(i==0 || i==Lado1 || j==0 || j==Lado2) {
					System.out.println("*");
				}
				
			}
			System.out.println("\n");
		}
	}
}
