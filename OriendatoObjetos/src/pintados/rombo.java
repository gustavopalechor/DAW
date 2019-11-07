package pintados;

public class rombo {

	public static void main(String[] args) {
		int Lado1 = 5;
		int Lado2 = 5;
		for (int i = 0; i < Lado1; i++) {
			for (int j = 0; j < Lado2; j++) {
				if (i == (Lado1-1)/2 || 
						((i==Lado1-1)&&(j==Lado2/2)) || //punto mas a la izquierda
						((j==(Lado2-1)/2))&&(i==(Lado1-1)/2)|| //Punto mas abajo
						((i==0))&&(j==(Lado2-1)/2)|| //punto mas arriba
						((i==1) && (j==((Lado2-1)/2)+1))|| ((i==1) && (j==((Lado2-1)/2)-1))|| //segunda fila
						((i==3) && (j==((Lado2-1)/2)+1)) ||	((i==3) && (j==((Lado2-1)/2)-1)) || //cuarta fila
						j==(Lado2-1)/2)//columna del medio
				{
					System.out.print("*");

				}
				System.out.print("\t");
			}
			System.out.println("\n");
			
		}
	}
}
