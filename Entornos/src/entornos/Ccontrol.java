package entornos;

public class Ccontrol {

	public static void main(String[] args) {
		Ejemplo E1= new Ejemplo(20, "pepe");
		
		System.out.println(E1.getNumero());
		E1.setNumero(15);
		System.out.println(E1.getNumero());
	}

}
