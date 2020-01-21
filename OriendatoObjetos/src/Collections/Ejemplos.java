



package Collections;

import java.util.ArrayList;

public class Ejemplos {
	public static void main(String[] args) {
		ArrayList<Character> vocales= new ArrayList<Character>();
		
		vocales.add('a');
		vocales.add('e');
		vocales.add('i');
		vocales.add('o');
		vocales.add('u');
		for(char c: vocales) {
			System.out.println(c);
		}
		vocales.remove(3);
		vocales.remove(1);
		System.out.println();
		System.out.println("Borrados la posicion 3 y 1");
		for(char c: vocales) {
			System.out.println(c);
		}
		System.out.println();
		ArrayList<Persona> ListPersonas= new ArrayList<Persona>();
		ListPersonas.add(new Persona("Pepe", 14));
		ListPersonas.add(new Persona("Pele", 40));
		ListPersonas.add(new Persona("Maria", 4));
		ListPersonas.add(new Persona("Paula", 22));
		ListPersonas.add(new Persona("Bea", 33));
		
		for(Object c: ListPersonas) {
			System.out.println(c);
		}
		System.out.println();
		
		
		ListPersonas.remove(ListPersonas.get(0));
		ListPersonas.remove(ListPersonas.get(3));
		System.out.println("Borrados la posicion 2 y 4");
		System.out.println();
		
		for(Object c: ListPersonas) {
			System.out.println(c.toString());
		}
	}

}
