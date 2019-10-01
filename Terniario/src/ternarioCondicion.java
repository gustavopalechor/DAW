import java.util.Scanner;

public class ternarioCondicion {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int ent=0;
		
		System.out.println("Dime un valor: ");
		ent=scan.nextInt();
		
		String demo=((ent>15)&& (ent<34))?"cierto":"falso";
		System.out.println(demo);
		
		System.out.println((ent>15)&&(ent<34)?"cierto":"falso");
		scan.close();
	}

}
