package muebles;

import java.util.Calendar;

public class Mesa extends Mueble{
	float alto;
	float ancho;
	public Mesa(String material, float precioCoste, float precioVenta, Calendar fechaVenta, float alto, float ancho) {
		super(material, precioCoste, precioVenta, fechaVenta);
		this.alto = alto;
		this.ancho = ancho;
	}
	public Mesa() {
		super();
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	@Override
	public String toString() {
		return "Mesa [alto=" + alto + ", ancho=" + ancho + ", material=" + material + ", precioCoste=" + precioCoste
				+ ", precioVenta=" + precioVenta + ", fechaVenta= " + fechaVenta.getTime() + "]";
	}
	
}
