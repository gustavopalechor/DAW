package ejercicioComunidad;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		List<String> centros;
		List<String> centros1= new ArrayList<String>();
		Charset charset= StandardCharsets.UTF_8;
		InputStream inbuffer= null;
		BufferedWriter outbuffer= null;
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
			//28820,28821,28822,28823
			centros.remove(0);
			//System.out.println(centros);
			String lineas1=null;
			for(String j: centros) {
				atributos=j.split(";");
				if(atributos[4]=="28820"|| atributos[4]=="28821" || atributos[4]=="28822") {
					for(int i=0; i<atributos.length; i++) {
					lineas1+=(atributos[i]+" ");
					}
					centros1.add(lineas1);
					System.out.println(centros1);
					if(atributos[1]== "Coslada") {
						System.out.println("Coslada"+"\n"+"\t" +lineas1);
					}
					else if(atributos[1]=="San Fernando de Henares") {
						System.out.println("San Fernando de Henares"+"\n"+"\t" +lineas1);
					}
					else if(atributos[1]=="Torrejón de Ardoz") {
						System.out.println("Torrejón de Ardoz"+"\n"+"\t" +lineas1);
					}
				}
				
			}
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		

	}

}
