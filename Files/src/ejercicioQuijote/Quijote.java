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
	
	static public void escribir(byte[] lista, int contador) {
		for(byte s: lista) {
			if(s=='\n') {
				System.out.print(contador);
				contador=0;
			}
			System.out.print((char) s);
			contador++;
			
			
		}
	}

	public static void main(String[] args) {
		//Path paths= Paths.get("ficheros/Quijote.txt");
		//InputStream stream= null;
		/*
		 * byte[] fichero; Charset charset= StandardCharsets.UTF_8;
		 * 
		 * try { fichero= Files.readAllBytes(paths);
		 * 
		 * for(byte s: fichero) {
		 * 
		 * System.out.print((char)s); if(s=='.') {
		 * 
		 * System.out.print("\n"); } }
		 * 
		 * } catch (Exception e) { e.getMessage(); }
		 */
		
		byte[] lista = new byte[1];
		int j=0;
		int contador=0;
		RandomAccessFile ran1=null;
		try {
			ran1 = new RandomAccessFile("ficheros/Quijote.txt", "r");
			for(int i=0; i<ran1.length(); i++) {
				ran1.seek(j);
				ran1.read(lista);
				escribir(lista, contador);
				j++;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		


	}

}
