package pintados;

public class arbol {

	public static void main(String[] args) {
		int a=10;
		
		int x=0;
		
		while(x<5) {
		for(int p=0; p<(a/2)-x; p++) {
			System.out.print(" ");
			
		}
		for(int i=(a/2)-x; i<=(a/2)+1; i++) {
		System.out.print("*");}
	
		
		for(int j=(a/2)+x; j<a; j++) {
			System.out.print(" ");
			
		}
		System.out.println();
		x++;
		
	}
	}

}
