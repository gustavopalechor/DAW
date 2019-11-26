package ev1PalechorGustavo;

import java.util.Calendar;

public class Ppal {
	public static Calendar tiempoCaduca(ProdPropio p1) {
		Calendar Cal= Calendar.getInstance();
		Cal.set(Calendar.YEAR, 2019);
		Cal.set(Calendar.MONTH, 11);
		Cal.set(Calendar.DATE, 23);
		
		return Cal;
		
	}

	public static void main(String[] args) {
		Calendar C1= Calendar.getInstance();
		ProdPropio roscon= new ProdPropio();
		roscon.getTipoProducto();
		roscon.setTipoProducto(new TipoProducto("Roscon"));
		roscon.setNombreProducto("Roscon de nata");
		roscon.setIdProducto(1);
		roscon.setTiempoPreparacion(120);
		roscon.setTiempoCaducidad(24*60);
		roscon.setPrecioVenta(120);
		roscon.setPrecioCoste(70);
		System.out.println(roscon.toString());
		
		ProdExterno miel = new ProdExterno();
		miel.setNombreProducto("Miel de la sierra de grazalema");
		
		C1=tiempoCaduca(roscon);
		System.out.println(C1.get(Calendar.YEAR)+"--" + C1.get(Calendar.MONTH)+"--"+ C1.get(Calendar.DATE));
		System.out.println();
		//Tambien se puede modificar en el toString
		System.out.println("Producto: " + "\n" + 
		"\t" + "-"+ " "+ "Identificador:"+ "\t" + roscon.idProducto+ "\n" +
		"\t" + "-"+ " "+ "Tipo de producto:" + "\t" + roscon.tipoProducto + "\n" +
		"\t" + "-"+ " "+ "Propio" + "\n" +
		"\t" + "-"+ " "+ "descripcion:" + "\t" + roscon.nombreProducto + "\n" +
		"\t" + "-"+ " "+ "ganancia:" + "\t" + (roscon.precioVenta-roscon.precioCoste));
		
	}

}
