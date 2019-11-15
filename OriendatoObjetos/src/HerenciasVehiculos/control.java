package HerenciasVehiculos;

public class control {

	public static void main(String[] args) {
		Taxi t1= new Taxi();
		t1.setModelo("ford");
		t1.setMatricula("1234asd");
		t1.setnLincecia("12asd2");
		t1.setPotencia("140CV");
		t1.setCarga(1500);
		t1.sobrecarga(t1.carga, 40);
		
		Avanza a1= new Avanza();
		a1.setBano(true);
		System.out.println(a1.toString());
		
		EMT e1= new EMT();
		e1.setnLinea(144);
		e1.setPotencia("150CV");
		e1.setModelo("Mercedes");
		System.out.println(e1.toString());
		

	}

}
