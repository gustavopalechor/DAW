import java.util.Scanner;

public class ejecicioSalario {

	public static float salarioNeto(float horas) {
		float variacionHoras=0.0f;
		float precioHoras=0.0f;
		if(horas<=37.5) precioHoras=horas*18;
		else if(horas>37.5) variacionHoras=horas-37.5
		
		return;
	}
	
	
	
	public static void main(String[] args) {
		String nombre;
		float horas=0.0f;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduce tu nombre completo:");
		nombre= scan.nextLine();
		System.out.println("Introduce las horas totalrealizadas esta semana");
		horas= scan.nextFloat();
		
		salarioNeto(horas);
	}

}
