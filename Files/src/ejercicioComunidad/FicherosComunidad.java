package ejercicioComunidad;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FicherosComunidad {

	public static void main(String[] args) {
		Path paths= Paths.get("ficheros/CentrosFpInformatica.csv");
		Path paths1= Paths.get("ficheros/centros1.txt");
		List<String> centros;
		List<String> centros1= new ArrayList<String>();
		Charset charset= StandardCharsets.UTF_8;
		InputStream inbuffer= null;
		
		int n;
		String[] atributos;
		
		
		try {
			inbuffer= Files.newInputStream(paths);
			String linea= null;
			centros= new ArrayList<String>();
			while ((n= inbuffer.read())!= -1) {
				if(n=='\n') {
					centros.add(linea);
					
					linea="";
					
				}
				else linea +=(char)n;
				
			}
			
			centros.remove(0);
			
			String lineas1="";
			for(String j: centros) {
				atributos=j.split(";");
				for(int i=0; i<atributos.length; i++) {
				if(atributos[i].contains("Coslada")|| 
						atributos[i].contains("San Fernando de Henares") ||
						atributos[i].contains("Torrejón de Ardoz")) {
					
					
					for(int j1=0; j1<atributos.length; j1++) {
					lineas1+=(atributos[j1]+" ");
					}
				
					centros1.add(lineas1);
						
					lineas1="";
				}
				
			}
			
			}
			System.out.println("Coslada"+"\n"+"\t-"+centros1.get(0));
			System.out.println("San Fernando de Henares"+"\n"+"\t-"+centros1.get(1)+"\n"+"\t-"+centros1.get(2));
			System.out.println("Torrejon de Ardoz"+"\n"+"\t-"+centros1.get(3));
		}
				
		 catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			Files.write(paths1, centros1, charset);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				inbuffer.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	
	}

}
