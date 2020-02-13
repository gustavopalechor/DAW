package randomFIles;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class RandomFIles {
	
	public static void escribir(byte[] data) {
		
		for(byte s: data) {
			System.out.print((char)s);
		}
		
	}

	public static void main(String[] args) {
		
		byte[] data= new byte[4];
		RandomAccessFile R1= null;
		
		try {
			
			R1 = new RandomAccessFile("ficheros/grupos.txt", "r");
			for(int i=0; i<R1.length(); i++) {
			if(i==0)R1.seek(0);
			R1.read(data);
			escribir(data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
