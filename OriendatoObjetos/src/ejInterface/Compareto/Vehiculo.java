package ejInterface.Compareto;

public class Vehiculo implements Comparable{

	
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
		public String toString() {
			return "Vehiculo [marca=" + marca + ", cilindrada=" + cilindrada + "]";
		}
		@Override
		public int compareTo(Object ve1) {
			int valor=0;
			Vehiculo v2=(Vehiculo)ve1;
			if(this.cilindrada>v2.getCilindrada()) {
				valor=1;
			}
			else if(this.cilindrada<v2.getCilindrada()) {
				valor=-1;
			}
				
			return valor;
		}
		
		
		

	

}
