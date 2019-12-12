package arrysMultidimensional;

import java.util.Random;

public class TemperaturasCiudades {

	public static void main(String[] args) {
		Random ran= new Random();
		int contador=0;
		int media;
		int[] media2= new int[4];
		int[][] temperaturas= new int[4][13];
		for(int i=0; i<4; i++) {
			temperaturas[i][0]=contador++;
			for(int j=1; j<=12; j++) {
				temperaturas[i][j]=(int)(ran.nextDouble()*40+1);
			}
		}
		//Media de cada año
		for(int i=0; i<4; i++) {
			media=0;
			for(int j=1; j<=12; j++ ) {
			media=media+temperaturas[i][j];
			}
			media=media/12;
			media2[i]=media;
			
		}
		//Media de cada mes
		int[] mediaMeses=new int[12];
		
		contador=0;
		for(int j=0; j<12; j++) {
			media=0;
			for(int i=0; i<4; i++) {
			
			media=media+temperaturas[i][(j+1)];
				
		}
			mediaMeses[j]=media/4;
		}
		
		for(int i=0; i<4; i++) {
		System.out.println("Media "+" año " +(i+1)+ " = "+ media2[i]+" grados");
		
		}
		
		System.out.println();
		for(int i=0; i<12; i++) {
			System.out.println("Media mes " +(i+1)+ " en todos los años"+ " = "+ mediaMeses[i]+" grados");
			
			}
		}
	

}
