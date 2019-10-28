package EjerciciosAmpliación;

public class Autor {

		String apellido;
		String nombre;
		String fechaNacimiento;
		public Autor() {
			
		}
		public Autor(String apellido, String nombre) {
			super();
			this.apellido = apellido;
			this.nombre = nombre;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
}
