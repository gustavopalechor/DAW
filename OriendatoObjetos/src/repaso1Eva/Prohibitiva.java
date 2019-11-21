package repaso1Eva;

public class Prohibitiva extends SenialTrafico{
	String nombreArchivoImagen;
	String texto;
	int alto;
	int ancho;
	public String getNombreArchivoImagen() {
		return nombreArchivoImagen;
	}
	public void setNombreArchivoImagen(String nombreArchivoImagen) {
		this.nombreArchivoImagen = nombreArchivoImagen;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public Prohibitiva() {
		super();
	}
	public void pintar() {
		System.out.println("Señal prohibitiva nueva= ");
		System.out.println("<img src=\"" + this.nombreArchivoImagen + "\"" + " alt=\"" + this.texto + "\""
				+ " height=\"" + this.alto + "\""+ " width=\"" + this.ancho + "\""+ ">");
		System.out.println();
		System.out.println();
	}
	@Override
	public String toString() {
		return "Prohibitiva [nombreArchivoImagen=" + nombreArchivoImagen + ", texto=" + texto + ", alto=" + alto
				+ ", ancho=" + ancho + ", idSenial=" + idSenial + ", num=" + num + "]";
	}
}
