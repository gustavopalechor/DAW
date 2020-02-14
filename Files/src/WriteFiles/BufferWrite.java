package WriteFiles;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BufferWrite {

	public static void main(String[] args) {
		Path path= Paths.get("ficheros/Buffer.txt");
		String[] s= {"Primer parrafo", "Segundo parrafo", "Tercer parrafo"};
		Charset charset= StandardCharsets.UTF_8;
		BufferedWriter b1= null;
		try {
			b1= Files.newBufferedWriter(path, charset);
			for(int i=0; i<s.length; i++) {
				b1.write(s[i], 0, s[i].length());
				if(i<s.length-1) b1.newLine(); 
					
				}
			
				
		} catch (Exception e) {
			e.getMessage();
		}
		finally {
			try {
				b1.close();
			} catch (Exception e2) {
				e2.getMessage();
			}
		}

	}

}
