package ev1PalechorGustavo;

public class Producto {
	String nombreProducto;
	int idProducto;
	TipoProducto tipoProducto;
	float precioVenta;
	float precioCoste;
	public Producto(int idProducto, TipoProducto tipoProducto, float precioVenta, float precioCoste, String nombreProducto) {
		super();
		this.nombreProducto= nombreProducto;
		this.idProducto = idProducto;
		this.tipoProducto = tipoProducto;
		this.precioVenta = precioVenta;
		this.precioCoste = precioCoste;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Producto() {
		super();
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public float getPrecioCoste() {
		return precioCoste;
	}
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", tipoProducto=" + tipoProducto + ", precioVenta=" + precioVenta
				+ ", precioCoste=" + precioCoste + "]";
	}
}
