package ejercicioQuijote;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Quijote {
	
	static public void escribir(String palabra) {
		
		
		
			System.out.println(palabra+ palabra.length());
			
		}
			
	public static void main(String[] args) {
		Path paths= Paths.get("ficheros/Quijote.txt");
		InputStream stream= null;
		
		  byte[] fichero; Charset charset= StandardCharsets.UTF_8;
		  
		  try { fichero= Files.readAllBytes(paths);
		  
		  for(byte s: fichero) {
		  
		  System.out.print((char)s); if(s=='.') {
		  
		  System.out.print("\n"); } }
		  
		  } catch (Exception e) { e.getMessage(); }
		  finally {
			try {
				stream.close();
			} catch (Exception e2) {
				e2.getMessage();
			}
		}		 
		 /*******************************************/
		System.out.println("\n\n");
		  
		  
		byte[] lista = new byte[1];
		
		String palabra="";
		
		RandomAccessFile ran1=null;
		try {
			ran1 = new RandomAccessFile("ficheros/Quijote.txt", "r");
			for(int i=0; i<ran1.length(); i++) {
				ran1.seek(i);
				ran1.read(lista);
				
				palabra+=(char)lista[0];
				if(lista[0]=='\n') {
				System.out.print((palabra.length()-1)+palabra);
				palabra="";
				}
				
			}
		} catch (Exception e) {
			e.getMessage();
		}
		finally {
			try {
				ran1.close();
			} catch (Exception e2) {
				e2.getCause();
			}
		}
		
		


	}

}
