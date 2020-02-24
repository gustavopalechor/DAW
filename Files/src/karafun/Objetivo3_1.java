package karafun;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Objetivo3_1 {
	
	

	

	public static void main(String[] args) {
		InputStream strm1=null;
		Path path= Paths.get("ficheros/karafuncatalog.csv");
		String[] lista1 = null;
		String[] lista=null;
		int n=0;
		String fichero = null;
		int j=0;
		try {
			strm1= Files.newInputStream(path);
			while((n = strm1.read()) !=-1) {
				if(n=='\n') {
					lista[j]=fichero;
					fichero="";
					j++;
				}
				else {
					fichero +=(char)n;
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		finally {
			try {
				strm1.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
