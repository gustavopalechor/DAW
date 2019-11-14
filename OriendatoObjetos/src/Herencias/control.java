package Herencias;

public class control {

	public static void main(String[] args) {
		Empleado e1= new Empleado();
		Becario b1= new Becario();
		e1.setNombre("Oscar");
		e1.setApellido1("Perez");
		e1.setApellido2("Garcia");
		e1.setAntiguedad("2 años");
		System.out.println(e1.toString());
		b1.setNombre("Luis");
		b1.setApellido1("Martinez");
		b1.setApellido2("Benitez");
		b1.setTiempoMaxBecario("1 año");
		System.out.println(b1.toString());

	}

}
