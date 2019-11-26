package ev1PalechorGustavo;

public class TipoProducto {
	private String nombreProducto;

	public TipoProducto() {
		super();
	}

	public TipoProducto(String nombreProducto) {
		super();
		this.nombreProducto = nombreProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Override
	public String toString() {
		return nombreProducto;
	}
	
}
