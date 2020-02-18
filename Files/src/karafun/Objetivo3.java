package karafun;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Objetivo3 {

	
	
	public static void main(String[] args) {
		
	
	InputStream strm1=null;
	Path path= Paths.get("ficheros/karafuncatalog.csv");
	List<String> lista= new ArrayList<String>();
	String[] lista1=null;
	int n=0;
	String fichero="";
	
	try {
		strm1= Files.newInputStream(path);
		
		
		while((n = strm1.read()) !=-1) {
			if(n=='\n') {
				lista.add(fichero);
				fichero="";
			}
			else {
				fichero +=(char)n;
			}
			
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	for(String s: lista) {
		System.out.println(s);
		
	}
	try {
		strm1.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
