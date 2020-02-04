package muebles;

import java.util.Calendar;

public class Silla extends Mueble{
	float alturaPatas;
	float alturaRespaldo;
	public Silla(String material, float precioCoste, float precioVenta, Calendar fechaVenta, float alturaPatas,
			float alturaRespaldo) {
		super(material, precioCoste, precioVenta, fechaVenta);
		this.alturaPatas = alturaPatas;
		this.alturaRespaldo = alturaRespaldo;
	}
	public Silla() {
		super();
	}
	public float getAlturaPatas() {
		return alturaPatas;
	}
	public void setAlturaPatas(float alturaPatas) {
		this.alturaPatas = alturaPatas;
	}
	public float getAlturaRespaldo() {
		return alturaRespaldo;
	}
	public void setAlturaRespaldo(float alturaRespaldo) {
		this.alturaRespaldo = alturaRespaldo;
	}
	@Override
	public String toString() {
		return "Silla [alturaPatas=" + alturaPatas + ", alturaRespaldo=" + alturaRespaldo + ", material=" + material
				+ ", precioCoste=" + precioCoste + ", precioVenta=" + precioVenta + ", fechaVenta= " + fechaVenta.getTime() + "]";
	}
	
	
}
