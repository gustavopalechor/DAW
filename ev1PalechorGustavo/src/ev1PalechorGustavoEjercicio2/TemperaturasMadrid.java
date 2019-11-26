package ev1PalechorGustavoEjercicio2;

import java.util.Random;

public class TemperaturasMadrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran= new Random();
		int temperatura;
		int mayor40=0;
		int menor25=0;
		int j=0;
		while(j<3) {
		for(int i=0; i<1000; i++) {
			temperatura=(int)(ran.nextDouble()*30+20);
			
			if(temperatura>40) {
				mayor40++;
			}
			else if(temperatura<25) {
				menor25++;
			}
			
		}
		System.out.println("Julio y agosto:" + "\n"+
		"\t" + "Más de 40:" + "\t" + mayor40 + "\n"+
		"\t" + "Menos de 25:" + "\t" + menor25);
		mayor40=0;
		menor25=0;
		j++;
		}
	}

}
