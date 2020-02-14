package WriteFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class EscrituraBytes {
	
	public static void main(String[] args) {
		
	Path path1=Paths.get("ficheros/fichero1.txt");
	Path path= Paths.get("ficheros/ficherobytes.txt");
	byte[] lista= new byte[1];
	
	try {
		lista= Files.readAllBytes(path1);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		try {
			Files.write(path, lista);
		} catch (Exception e2) {
			e2.getMessage();
		}
	}
	}
	}

