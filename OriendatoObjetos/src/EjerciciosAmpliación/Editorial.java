package EjerciciosAmpliación;

public class Editorial {

	String nombreEditorial;

	public Editorial() {
		
	}

	public Editorial(String nombreEditorial) {
		
		this.nombreEditorial = nombreEditorial;
	}

	public String getNombreEditorial() {
		return nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	@Override
	public String toString() {
		return "= " + nombreEditorial;
	}
	

}
