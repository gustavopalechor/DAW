package ev1PalechorGustavo;

public class ProdPropio extends Producto{
	int tiempoPreparacion;
	int tiempoCaducidad;

	
	public ProdPropio(int idProducto, TipoProducto tipoProducto, float precioVenta, float precioCoste,
			String nombreProducto, int tiempoPreparacion, int tiempoCaducidad) {
		super(idProducto, tipoProducto, precioVenta, precioCoste, nombreProducto);
		this.tiempoPreparacion = tiempoPreparacion;
		this.tiempoCaducidad = tiempoCaducidad;
	}
	public ProdPropio() {
		super();
	}
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	public int getTiempoCaducidad() {
		return tiempoCaducidad;
	}
	public void setTiempoCaducidad(int tiempoCaducidad) {
		this.tiempoCaducidad = tiempoCaducidad;
	}
	@Override
	public String toString() {
		return "ProdPropio [tiempoPreparacion=" + tiempoPreparacion + " minutos" + ", tiempoCaducidad=" + tiempoCaducidad + " minutos"
				+ ", nombreProducto=" + nombreProducto + ", idProducto=" + idProducto + ", tipoProducto=" + tipoProducto
				+ ", precioVenta=" + precioVenta + ", precioCoste=" + precioCoste + "]";
	}
	
	
	
	
}
