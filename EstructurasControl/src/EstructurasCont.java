import java.util.Scanner;

public class EstructurasCont {
	public static void main(String[] args) {
		int mes;
		Scanner scan=new Scanner(System.in);
		System.out.println("Te dire cuantos meses tiene un mes elige una opcion: \n"
				+ "1:Enero \t 2:febrero \t 3:marzo \n4:abril \t 5:mayo \t 6:junio \n"
				+ "7:julio \t 8:agosto \t 9:septiembre \n10:octubre \t 11:noviembre \t 12:diciembre");
		System.out.println("\nElige un mes");
		mes=scan.nextInt();
		
		if (mes==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("Tiene 31 días");
			
		}
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("tiene 30 días");
		}
		else if (mes == 2) {
			System.out.println("Tiene 28 días");
		}
		scan.close();
	}
		
}
