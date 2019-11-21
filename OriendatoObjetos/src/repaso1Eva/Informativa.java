package repaso1Eva;

public class Informativa extends SenialTrafico{
	String texto;

	public Informativa() {
		super();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void pintar() {
		int i=0;
		System.out.println("Señal informativa nueva=");
		
		while(i<4) {
			System.out.print("*");
			System.out.print("\t");
			i++;
		}
		System.out.println();
		System.out.println("|" + this.num + " " + this.texto + "|");
		 i=0;
		
		while(i<4) {
			System.out.print("*");
			System.out.print("\t");
			i++;
		}
		System.out.println();
		System.out.println();
	
	}

	@Override
	public String toString() {
		return "Informativa [texto=" + texto + ", idSenial=" + idSenial + ", num=" + num + "]";
	}
}
