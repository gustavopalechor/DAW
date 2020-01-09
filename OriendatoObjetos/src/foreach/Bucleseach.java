package foreach;

public class Bucleseach {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int suma=0;
		for(int s: num) {
			suma+=s;
		}
		System.out.println(suma);
		String palabra= "hola.hola,adios:mario;luigi_wario";
		String[] array=palabra.split("[.,:;_]");
		for(String j: array) {
			System.out.println(j);
		}
	}

}
