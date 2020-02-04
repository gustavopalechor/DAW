package muebles;

import java.util.Calendar;

public class Mueble implements Comparable<Mueble>{
	String material;
	float precioCoste;
	float precioVenta;
	Calendar fechaVenta;
	public Mueble(String material, float precioCoste, float precioVenta, Calendar fechaVenta) {
		super();
		this.material = material;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.fechaVenta = fechaVenta;
	}
	public Mueble() {
		super();
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getPrecioCoste() {
		return precioCoste;
	}
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Calendar getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Calendar fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	@Override
	public String toString() {
		return "Mueble [material=" + material + ", precioCoste=" + precioCoste + ", precioVenta=" + precioVenta
				+ ", fechaVenta= " + fechaVenta + "]";
	}
	@Override
	public int compareTo(Mueble m) {
		int valor=0;
			if(this instanceof Silla || m instanceof Silla) {
				valor=1;
			}
			else if(this instanceof Mesa || m instanceof Mesa) {
				valor=-1;
			}
					
		  else { 
			  if(this.getPrecioVenta()<m.getPrecioVenta()) { 
				  valor=-1; } 
			  else  if(this.getPrecioVenta()>m.getPrecioVenta()) {
				  valor=1;
				  }
			  }
		 
		return valor;
	}
	
}
