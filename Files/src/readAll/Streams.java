package readAll;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		Path path= Paths.get("ficheros/fichero1.txt");
		InputStream iStream=null;
		
		List<String> texto= new ArrayList<String>();
		int n;
		String filas;
		
		try {
			iStream= Files.newInputStream(path);
			filas="";
			while((n = iStream.read()) != -1) {
				if(n == '\n') {
					texto.add(filas);
					filas="";
				}
				else filas+=(char)n;
			}
			
			for(String s: texto) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		finally {
			try {
				iStream.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
		}

	}

}
