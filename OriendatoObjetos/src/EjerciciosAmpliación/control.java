package EjerciciosAmpliación;



public class control {

	public static void main(String[] args) {
		
	
		
		
		Autor p1= new Autor("Perez", "joquin", "20/05/1987");
		Libro l1= new Libro("Libro", 93, p1.nombre, "15/05/2016");
		
		Autor p2= new Autor("Lucía", "Hernández", "15/06/1998");
		Libro l2= new Libro("kamasutra", 150, p2.nombre, "20/03/2017");
		
		
		
		
		
		l1.escribir();
		l2.escribir();
	
		
	}

}
