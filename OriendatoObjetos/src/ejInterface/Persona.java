package ejInterface;

public class Persona implements Comparable{
	int edad;
	String nombre;
	String grupo;
	public Persona(int edad, String nombre, String grupo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	public Persona() {
		super();
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	@Override
	public int compareTo(Object pers) {
		Persona p2=(Persona)pers;
		if(this.edad<p2.getEdad()) {
			System.out.println(p2.getNombre()+" es mayor que "+ this.nombre);
		}
		else System.out.println(this.nombre + " es mayor que "+ p2.nombre);
			
		
		return 0;
	}
	
}
