package EjerciciosAmpliación;

public class Libro {

	String titulo;
	int numeroPaginas;
	String nombreAutor;
	String fechaEdicion;
	
	public Libro(String titulo, int numeroPaginas, String nombreAutor, String fechaEdicion) {
		super();
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.nombreAutor = nombreAutor;
		this.fechaEdicion = fechaEdicion;
	}
	
	

public void escribir() {
	System.out.println("Autor: "+ nombreAutor + "\n" + "Titulo: " + titulo
			+ "\n"+ "Fecha de edicion: " + fechaEdicion);
}
}