package ev1PalechorGustavo;

public class ProdExterno extends Producto{
	int tiempoServicio;

	

	public ProdExterno(int idProducto, TipoProducto tipoProducto, float precioVenta, float precioCoste,
			String nombreProducto, int tiempoServicio) {
		super(idProducto, tipoProducto, precioVenta, precioCoste, nombreProducto);
		this.tiempoServicio = tiempoServicio;
	}

	public ProdExterno() {
		super();
	}

	public int getTiempoServicio() {
		return tiempoServicio;
	}

	public void setTiempoServicio(int tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}

	@Override
	public String toString() {
		return "ProdExterno [tiempoServicio=" + tiempoServicio + ", nombreProducto=" + nombreProducto + ", idProducto="
				+ idProducto + ", tipoProducto=" + tipoProducto + ", precioVenta=" + precioVenta + ", precioCoste="
				+ precioCoste + "]";
	}

	
	

}
