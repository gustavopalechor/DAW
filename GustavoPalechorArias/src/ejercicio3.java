import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		String frase;
		int contador1=0;
		int contador2=0;
		char letra =' ';
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		frase= scan.nextLine();
		
		for(int i=0; i<frase.length(); i++) {
			letra=frase.toLowerCase().charAt(i);
			if(letra=='a' || letra=='á') {
				contador1++;
			}
			if(letra=='e' || letra=='é') {
				contador2++;
			}
		}
		System.out.println("Tiene "+ contador1 + " a\n" + "tiene " + contador2 + " e\n");
		scan.close();
	}

}
