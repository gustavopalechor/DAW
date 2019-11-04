package EjerciciosAmpliación;

import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Libro librito = new Libro();
		Libro varLibro= new Libro();
		
		System.out.println("Introduce e titulo del libro:");
		varLibro.setTitulo(scan.nextLine());
		System.out.println("Introduce el nombre del autor:");
		varLibro.setAutor(new Autor());
		varLibro.getAutor().setNombre(scan.next());
		System.out.println("Introduce el apellido del autor:");
		varLibro.getAutor().setApellido(scan.nextLine());
		System.out.println("Introduce la editorial:");
		varLibro.setEditorial(new Editorial());
		varLibro.getEditorial().setNombreEditorial(scan.next());
		System.out.println(varLibro.toString());
		System.out.println("Introduce el número de páginas");
		varLibro.setNumeroPaginas(scan.nextInt());
			
		
		librito.setAutor(new Autor());
		librito.getAutor().setNombre("Juan");
		librito.setEditorial(new Editorial());
		librito.getEditorial().setNombreEditorial("Anaya");
		
		Libro libro1=new Libro();
		libro1.setAutor(new Autor("Federico", "Perez", "15/04/1957"));
		libro1.setEditorial(new Editorial("Anaya"));
		libro1.getEditorial().setNombreEditorial("Teide");
		System.out.println(libro1.toString());
		
		Libro libro2= new Libro();
		Autor autor1= new Autor("Garcia", "Gabriel", "17/09/1965");
		Editorial editorial1=new Editorial("Anaya");
		libro2.setAutor(autor1);
		libro2.setEditorial(editorial1);
		System.out.println(libro2.toString());
		autor1.setNombre("Sofia");
		editorial1.setNombreEditorial("Teide");
		System.out.println(libro2.toString());
		
		Libro libro3= new Libro();
		libro3.setAutor(new Autor());
		libro3.getAutor().setNombre("Mateo");
		libro3.getAutor().setApellido("Palermo");
		libro3.getAutor().setFechaNacimiento("16/08/1987");
		libro3.setEditorial(new Editorial());
		libro3.getEditorial().setNombreEditorial("Edinumen");
		System.out.println(libro3.toString());
	scan.close();
	}
	

}
