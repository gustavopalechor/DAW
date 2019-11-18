package upcastingDowncasting;

public class Control {

	public static void main(String[] args) {
		
		Deportista d1= new Atleta("Roberto", "España", "17/07/1977", "1,80 m", "Varon", "100 m lisos");
		System.out.println(d1.toString());
		Deportista d2= new Nadador("Raul", "España", "20/05/1985", "1,85 m", "varon", "mariposa");
		System.out.println(d2.toString());
		System.out.println("Tipo carrera: "+((Atleta)d1).tipoCarrera+ "\n" + "Nombre: " + d1.nombre +"\n"
				+ "País de nacimiento: " + d1.Pais + "\n" + "Fecha de nacimiento: " + d1.fechaNacimiento + "\n"
				+ "Estatura: " + d1.estatura + "\n" + "Sexo: " + d1.sexo + "\n" + 
				"marca: " + ((Atleta)d1).resultado() );
		
		
			

	}

}
