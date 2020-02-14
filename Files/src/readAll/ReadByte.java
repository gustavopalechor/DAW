package readAll;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ReadByte {

	public static void main(String[] args) {
		Path path= Paths.get("ficheros/fichero1.txt");
		byte[] lista1;
		
		try {
			lista1= Files.readAllBytes(path);
			
			for(byte s: lista1) {
				System.out.print((char) s);
				
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		

	}

}
