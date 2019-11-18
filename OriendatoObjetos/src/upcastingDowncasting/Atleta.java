package upcastingDowncasting;

import java.util.Calendar;
import java.util.Date;


public class Atleta extends Deportista {
		Calendar marca = Calendar.getInstance();
		String tipoCarrera;
		
		public Atleta() {
			super();
		}
		

		public Atleta(String nombre, String pais, String fechaNacimiento, String estatura, String sexo, String tipoCarrera) {
			super(nombre, pais, fechaNacimiento, estatura, sexo);
			
			this.tipoCarrera = tipoCarrera;
		}
		
		public Calendar getMarca() {
			return marca;
		}

		public void setMarca(Calendar marca) {
			this.marca = marca;
		}

		public String getTipoCarrera() {
			return tipoCarrera;
		}
		public void setTipoCarrera(String tipoCarrera) {
			this.tipoCarrera = tipoCarrera;
		}
		

		@Override
		public String toString() {
			return "Atleta [marca=" + marca.getTime() + ", tipoCarrera=" + tipoCarrera + ", nombre=" + nombre + ", Pais=" + Pais
					+ ", fechaNacimiento=" + fechaNacimiento + ", estatura=" + estatura + ", sexo=" + sexo + "]";
		}
		public  Date resultado() {
			Date resu= marca.getTime(); 
			return resu;
						
		}
	
}
