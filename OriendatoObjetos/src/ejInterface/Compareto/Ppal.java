package ejInterface.Compareto;

import java.util.Arrays;

public class Ppal {

	public static void main(String[] args) {
		Vehiculo v1= new Vehiculo("Seat", 200);
		Vehiculo v2= new Vehiculo("Renault", 400);
		Vehiculo v3= new Vehiculo("Audi", 300);
		Vehiculo v4= new Vehiculo("Fiat", 100);
		Vehiculo v5= new Vehiculo("chevrolet", 60);
		
		Vehiculo[] veh= {v1,v2,v3,v4, v5};
		
		System.out.println(Arrays.toString(veh));
		for(Vehiculo j: veh) {
			System.out.println(j);
		}
		System.out.println();
		Arrays.sort(veh);
		for(Vehiculo j: veh) {
			System.out.println(j);
		}
		
		System.out.println();
		System.out.println();

		
		Autobus a2=new Autobus("AuSiemens", 580);
		Autobus a1= new Autobus("AuFiat", 120);
		Taxi t1= new Taxi("TxMercedes", 860);
		Taxi t2= new Taxi("TxMazda", 150);
		
		Vehiculo[] veh1= {a2,a1,t2,t1};
		System.out.println(Arrays.toString(veh1));
		for(Vehiculo j: veh1) {
			System.out.println(j);
		}
		
		System.out.println();
		
		Arrays.sort(veh1);
		
		
		for(Vehiculo y: veh1) {
			System.out.println(y);
		}
	
	}

}
