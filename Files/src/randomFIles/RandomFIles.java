package randomFIles;
import java.io.IOException;
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
		
		byte[] data= new byte[1];
		RandomAccessFile R1= null;
		int j=0;
		
		try {
			
			R1 = new RandomAccessFile("ficheros/grupos.txt", "r");
			
			for(int i=0; i<R1.length(); i++) {
				
			R1.seek(j);
			R1.read(data);
			escribir(data);
			j++;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				R1.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		
	}

}
