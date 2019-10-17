import java.util.Scanner;

public class ejecicioSalario {

	public static float salarioNeto(float horas) {
		float variacionHoras=0.0f;
		float precioHoras=0.0f;
		if(horas<=37.5) precioHoras=horas*18;
		else if(horas>37.5) { variacionHoras=(float) (horas-37.5); precioHoras=(float) 
				((37.5*18)+(variacionHoras*28.8));}
		
		return calculoImpuestos(precioHoras);
	}
	
	public static float calculoImpuestos(float precioHoras) {
		float salarioNeto=0.0f;
		
		return salarioNeto;
	}
	
	public static void main(String[] args) {
		
		float horas=0.0f;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce las horas totalrealizadas esta semana");
		horas= scan.nextFloat();
		
		salarioNeto(horas);
		scan.close();
	}

}
