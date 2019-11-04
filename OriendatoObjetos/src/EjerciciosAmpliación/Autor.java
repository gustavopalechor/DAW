package EjerciciosAmpliación;

public class Autor {

		String apellido;
		String nombre;
		String fechaNacimiento;
		public Autor() {
			
		}
		public Autor(String apellido, String nombre, String fechaNacimiento) {
			super();
			this.apellido = apellido;
			this.nombre = nombre;
			this.fechaNacimiento = fechaNacimiento;
		}
		public Autor(String apellido, String nombre) {
			super();
			this.apellido = apellido;
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		@Override
		public String toString() {
			return "[apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
		}
		
		
}
