package EjerciciosAmpliación;



public class control {

	public static void main(String[] args) {
		
	
		Libro librito = new Libro();
		
		librito.setAutor(new Autor());
		librito.getAutor().setNombre("Juan");
		librito.setEditorial(new editorial());
		librito.getEditorial().setEditorial("Anaya");
	
		
	}

}
