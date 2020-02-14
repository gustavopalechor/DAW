package WriteFiles;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class EscrituraFiles {
	public static void main(String[] args) {
		Path path= Paths.get("ficheros/escritura.txt");
		List<String> lista= new ArrayList<String>(Arrays.asList("Primerer parrafo", "Segundo parrafo", "Tercer perrafo"));
		Charset charset= StandardCharsets.UTF_8;
		try {
			Files.write(path, lista, charset);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
