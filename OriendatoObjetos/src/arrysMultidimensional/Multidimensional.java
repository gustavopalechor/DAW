package arrysMultidimensional;

import java.util.Arrays;
import java.util.Random;

public class Multidimensional {

	public static void main(String[] args) {
		Random ran= new Random();
		
		int[][] arrayInt= new int[2][3];
		
		arrayInt[0][0]=1;
		arrayInt[0][1]=2;
		arrayInt[0][2]=3;
		arrayInt[1][0]=4;
		arrayInt[1][1]=5;
		arrayInt[1][2]=6;
		
		System.out.println(Arrays.toString(arrayInt[0]));
		System.out.println(Arrays.toString(arrayInt[1]));
	
		int[][] arrayInt2= {{1,2,3},{4,5,6}};
		System.out.println(Arrays.toString(arrayInt2[0]));
		System.out.println(Arrays.toString(arrayInt2[1]));
		
		for(int i=0; i<arrayInt.length;i++) {
			for(int j=0; j<arrayInt[i].length;j++) {
				System.out.print(arrayInt[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		/************************************
		 * 
		 * Array multidimensional
		 * 
		 *************************************/
		int[][][][] arrayTri=new int[2][2][2][2];
		arrayTri[0][0][0][0]=0;
		arrayTri[0][0][0][1]=1;
		arrayTri[0][0][1][0]=2;
		arrayTri[0][0][1][1]=3;
		arrayTri[0][1][0][0]=4;
		arrayTri[0][1][0][1]=5;
		arrayTri[0][1][1][0]=6;
		arrayTri[0][1][1][1]=7;
		arrayTri[1][0][0][0]=8;
		arrayTri[1][0][0][1]=9;
		arrayTri[1][0][1][0]=10;
		arrayTri[1][0][1][1]=11;
		arrayTri[1][1][0][0]=12;
		arrayTri[1][1][0][1]=13;
		arrayTri[1][1][1][0]=14;
		arrayTri[1][1][1][1]=15;
		
		
		System.out.println(Arrays.toString(arrayTri[0][0][0]));
		System.out.println(Arrays.toString(arrayTri[0][0][1]));
		System.out.println(Arrays.toString(arrayTri[0][1][0]));
		System.out.println(Arrays.toString(arrayTri[1][0][0]));
		System.out.println(Arrays.toString(arrayTri[1][1][0]));
		System.out.println(Arrays.toString(arrayTri[1][1][1]));
		/************************************
		 * 
		 * Tres en raya
		 * 
		 *************************************/
		System.out.println();
		char[][] letra=new char[3][3];
		int posicion;
		int posicion2;
		for(int i=0; i<letra.length; i++) {
			for(int j=0; j<letra[i].length; j++) {
				letra[i][j]=' ';
			}
			}
		for(int i=0; i<3; i++) {
			posicion=ran.nextInt(3);
			posicion2=ran.nextInt(3);
			if(letra[posicion][posicion2]==' ') {
				letra[posicion][posicion2]='x';
			}
			
		}
		for(int i=0; i<3; i++) {
			posicion=ran.nextInt(3);
			posicion2=ran.nextInt(3);
			if(letra[posicion][posicion2]==' ') {
				letra[posicion][posicion2]='O';
			}
			if(letra[posicion][posicion2]=='x') {
				posicion2=ran.nextInt(3);
				letra[posicion][posicion2]='O';
			}
		}
		for(int i=0; i<letra.length; i++) {
			for(int j=0; j<letra[i].length; j++) {
				System.out.print("|"+ letra[i][j]+ "|");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
