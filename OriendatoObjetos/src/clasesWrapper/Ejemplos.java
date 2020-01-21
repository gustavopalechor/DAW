package clasesWrapper;

import java.util.ArrayList;



public class Ejemplos {

	public static void main(String[] args) {
		ArrayList<String> varArray= new ArrayList<String>();
		Integer varI= new Integer(45);
		System.out.println(varI);
		varI.intValue();
		Float varF= new Float(45.25F);
		String s="23";
		int x= Integer.parseInt(s)+23;
		System.out.println(x);

	}

}
