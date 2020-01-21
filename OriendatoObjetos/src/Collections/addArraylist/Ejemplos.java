package Collections.addArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejemplos {

	public static void main(String[] args) {
		ArrayList<String> varString= new ArrayList<String>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));
		varString.add("Sabado");
		varString.add("Domingo");
		
		System.out.println(varString.size());
		System.out.println();
		for(String j: varString) {
			System.out.println(j);
		}
		System.out.println();
		Collections.sort(varString);
		for(String j: varString) {
			System.out.println(j);
		}
		System.out.println();
		ArrayList<String> var2= new ArrayList<String>(Arrays.asList("Monday"));
		var2.addAll(varString);
		for(String j: var2) {
			System.out.println(j);
		}
	}

}
