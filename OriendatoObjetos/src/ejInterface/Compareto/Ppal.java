package ejInterface.Compareto;

import java.util.Arrays;

public class Ppal {

	public static void main(String[] args) {
		Vehiculo v1= new Vehiculo("Seat", 200);
		Vehiculo v2= new Vehiculo("Renault", 400);
		Vehiculo v3= new Vehiculo("Audi", 300);
		Vehiculo v4= new Vehiculo("Fiat", 100);
		
		Vehiculo[] veh= {v1,v2,v3,v4};
		
		System.out.println(Arrays.toString(veh));
		for(Vehiculo j: veh) {
			System.out.println(j);
		}
		System.out.println();
		Arrays.sort(veh);
		for(Vehiculo j: veh) {
			System.out.println(j);
		}
	}

}
