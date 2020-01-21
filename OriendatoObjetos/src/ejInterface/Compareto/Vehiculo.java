package ejInterface.Compareto;

public class Vehiculo implements Comparable<Vehiculo>{

	
		String marca;
		int cilindrada;
		public Vehiculo() {
			super();
		}
		public Vehiculo(String marca, int cilindrada) {
			super();
			this.marca = marca;
			this.cilindrada = cilindrada;
		}
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getCilindrada() {
			return cilindrada;
		}
		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}
		
		@Override
		public int compareTo(Vehiculo ve1)//Para que reciba un objeto especifico, en comparable le indicamos el tipo de objeto que tenga
		{
			
			
			
			int valor1=0;
			
			if((ve1 instanceof Taxi && this instanceof Taxi)||(ve1 instanceof Autobus && this instanceof Autobus)) {
							
					if(this.cilindrada>ve1.getCilindrada()) {
						valor1=1;
					}
					else if(this.cilindrada<ve1.getCilindrada()) {
						valor1=-1;
					}
					else { if(this.marca.charAt(0)<ve1.getMarca().charAt(0)) {
						valor1=-1;
					}
					}
				}
			
			else {
				if(ve1 instanceof Taxi)valor1=1;
				else valor1=-1;
				return valor1;
				
			}
			
				
			return valor1;
		}
		
		@Override
		public String toString() {
			return "Vehiculo [marca=" + marca + ", cilindrada=" + cilindrada + "]";
		}
		

	

}
