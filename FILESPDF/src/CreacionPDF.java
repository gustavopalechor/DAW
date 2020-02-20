import java.awt.Font;
import java.io.FileOutputStream;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreacionPDF {

	public static void main(String[] args) {
		try {
			Document documento= new Document();
			
			FileOutputStream ficheropdf= new FileOutputStream("ficheros/documento.pdf");
			
			PdfWriter.getInstance(documento, ficheropdf).setInitialLeading(20);
			
			
			documento.open();
			
			documento.add(new Paragraph("Este es el primer texto"));
			documento.add(new Paragraph("Este es el segundo texto",
					FontFactory.getFont("arial", 21, Font.ITALIC ,BaseColor.CYAN)));
					
			
				Image foto= Image.getInstance("imagenes/mafalda.jpeg");
				foto.scaleToFit(100,50);
				foto.setAlignment(Chunk.ALIGN_CENTER);
				documento.add(foto);
				
				PdfPTable tabla= new PdfPTable(3);
				for(int i=0; i<15; i++) {
					tabla.addCell("celda"+i);
				}
				documento.add(tabla);
				documento.close();
			
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
