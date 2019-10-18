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
		float impuestos2=0.0f;
		float impuestos1=0.0f;
		float precio1=precioHoras-525;
		float precio2=255.0f;
		if(precioHoras>525) {	
			impuestos2= (float) (precio1-(precio1*0.33));
			impuestos1= (float) (precio2*0.22);
			salarioNeto=275+impuestos2+impuestos1;
		
		}
		else if(precioHoras>275 || precioHoras<525) {
			impuestos1=(precioHoras-275); impuestos1=(float) (impuestos1-(impuestos1*0.22));
			salarioNeto=275+impuestos1;
			
		}
		else if(precioHoras<=275) salarioNeto=precioHoras;
		
		return salarioNeto;
	}
	
	public static void main(String[] args) {
		
		float horas=0.0f;
		float salarioNeto=0.0f;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce las horas totales realizadas esta semana");
		horas= scan.nextFloat();
		
		salarioNeto=salarioNeto(horas);
		
		System.out.println("EL salario neto que te corresponde es de: "+salarioNeto);
		scan.close();
	}

}
