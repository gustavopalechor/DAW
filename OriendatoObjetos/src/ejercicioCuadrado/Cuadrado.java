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
	
	

	@Override
	public String toString() {
		return "Cuadrado [Lado1=" + Lado1 + ", Lado2=" + Lado2 + "]";
	}

	public float getLado1() {
		return Lado1;
	}

	public void setLado1(float lado1) {
		Lado1 = lado1;
	}

	public float getLado2() {
		return Lado2;
	}

	public void setLado2(float lado2) {
		Lado2 = lado2;
	}

	
	
	public float calcularArea() {
		return Lado1*Lado2;
	}
	public float calcularPerimetro() {
		return Lado1*4;
	}
	public void esCuadrado () {
		if(Lado1==Lado2) {
			System.out.println("Es cuadrado");
		}
		else System.out.println("No es un cuadrado");
	}
	public static void pintarCuadrado(float Lado1, float Lado2) {
		
		for(int i=0; i<Lado1; i++) {
			for(int j=0; j<Lado2; j++) {
				if(i==0  || i==Lado1-1 || j==0 || j==Lado2-1) {
					System.out.print("*");
				}
				
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
