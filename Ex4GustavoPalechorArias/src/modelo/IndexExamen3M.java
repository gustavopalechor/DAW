package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.stream.util.StreamReaderDelegate;





public class IndexExamen3M {

	public static void main(String[] args) {
		Path paths= Paths.get("ficheros/carreras.csv");
		Path oPaths= Paths.get("SalidaExamen/plannig.txt");
		BufferedReader bufferInput = null;
		InputStream iStream=null;
		BufferedWriter oStream=null;
		Charset charset= StandardCharsets.ISO_8859_1;
		List<String> listaFichero= new ArrayList<String>();;
		List<Carrera> listaCarrerasGen= new ArrayList<Carrera>();
		List<Object> listaCarrerasEsp= new ArrayList<Object>();
		List<String> listaCarrerasPopulares= new ArrayList<String>();
		listaCarrerasPopulares.add("Fecha:"+ "\t"+ "Nombre: " + "\t" + "Lugar:");
		String filas;
		
		try {
			//Ejercicio 2
			int n;
			iStream= Files.newInputStream(paths);
			filas="";
			while((n = iStream.read()) != -1) {
				if(n == '\n') {
					listaFichero.add(filas);
					filas="";
				}
				else filas+=(char)n;
			}
			listaFichero.remove(0);
			
			//Ejercicio 3
			String[] parametros;
			
			for(String j: listaFichero) {
				parametros= j.split(";");
				
				listaCarrerasGen.add(new Carrera(parametros[0],null, parametros[2]));
			}
			
			//Ejercicio 4
			
			for(String j: listaFichero) {
				parametros= j.split(";");
				if(parametros[3].contains("Populares")){
						listaCarrerasEsp.add(new Populares(parametros[0], null, parametros[2], null, parametros[4]));
						listaCarrerasPopulares.add(" "+parametros[1]+ "\t"+parametros[0]+"\t\t"+ parametros[2]);
				}
				else if(parametros[3].contains("DeCoches")) {
					listaCarrerasEsp.add(new DeCoches(parametros[0], null, parametros[2],parametros[4], parametros[5]));
				}
				
			}
			//Ejercicio 5
			listaCarrerasEsp.sort(null);
			
			//Ejercicio 6
			
			
			  oStream= Files.newBufferedWriter(oPaths, charset);
			  for(int i=0; i<=listaCarrerasPopulares.size(); i++) {
			  oStream.write(listaCarrerasPopulares.get(i)); }
			 
						
			}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				iStream.close();
				oStream.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

}
