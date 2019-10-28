package EjerciciosAmpliación;

public class Libro {

	String titulo;
	int numeroPaginas;
	String fechaEdicion;
	Autor autor;
	editorial editorial;
	public Libro() {
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(String fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(editorial editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", fechaEdicion=" + fechaEdicion
				+ ", editorial=" + editorial + ", autor=" + autor + "]";
	}
}