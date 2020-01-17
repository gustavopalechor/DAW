package ejInterface.Compareto;

public class Taxi extends Vehiculo{

	
	
	
	
	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taxi(String marca, int cilindrada) {
		super(marca, cilindrada);
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public int compareTo(Object ve1) {
		int valor=0;
		Vehiculo v2=(Vehiculo)ve1;
		if(v2 instanceof Taxi) {
			if(this.cilindrada>v2.getCilindrada()) {
				valor=1;
			}
			else if(this.cilindrada<v2.getCilindrada()) {
				valor=-1;
			}
		}
		
			
		return valor;
	}*/

	
	
}
