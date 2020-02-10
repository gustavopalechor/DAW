package readAll;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {

	public static void main(String[] args) {
	Path path= Paths.get("ficheros/fichero1.txt");
	
	List<String> lista;
	
	Charset charset= StandardCharsets.UTF_8;
	
	try {
		lista= Files.readAllLines(path, charset);
		
		for(String s: lista) {
			System.out.println(s);
		}
		
	} catch (Exception e) {
		System.err.println(e);

	}

	}

}
