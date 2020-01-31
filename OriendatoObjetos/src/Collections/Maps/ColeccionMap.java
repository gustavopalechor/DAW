package Collections.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ColeccionMap {
	
	class Persona() {
		
	}

	public static void main(String[] args) {
		Map <Integer, String> coleccion= new HashMap<Integer, String>();
		
		coleccion.put(1, "Pepe");
		coleccion.put(2, "Pere");
		coleccion.put(3, "Peter");
		coleccion.put(4, "Maria");
		coleccion.put(5, "Bea");
		coleccion.put(6, "Marta");

		System.out.println("Tamaño coleccion: " +coleccion.size());
		System.out.println("El numero 5 es: "+ coleccion.get(5));
		System.out.println("La coleccion es vacia? "+ coleccion.isEmpty());
		System.out.println(coleccion);
		System.out.println("Existe peter? " + coleccion.containsValue("peter") + " Existe la clave 7?"
				+ coleccion.containsKey(7));
		
		Iterator<Integer> it= coleccion.keySet().iterator();
			while(it.hasNext()) {
				int i= it.next();
				String s= coleccion.get(i);
				System.out.println(i + s);
			}
		//Generacion de un conjunto a partir de un map
		Set conjunto = coleccion.entrySet();
		System.out.println(conjunto);
		
		//Generacion de una lista a partir de un map
		
		List coleccionList= new ArrayList(coleccion.values());
		System.out.println("\n");
		System.out.println(coleccionList);
		
		ArrayList<String> a= new ArrayList<String>(Arrays.asList("pepe"));
		
		/*		Ahora con objetos
		*/
		
	}

}
