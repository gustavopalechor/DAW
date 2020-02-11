package modelo;

import java.util.List;

public class Grupo extends Interprete{
	private int numComponentes;
	List<Artista> artistas;
	public Grupo() {
		super();
	}

	public Grupo(int numComponentes, List<Artista> artistas) {
		super();
		this.numComponentes = numComponentes;
		this.artistas = artistas;
	}
	

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}

	public int getNumComponentes() {
		return numComponentes;
	}

	public void setNumComponentes(int numComponentes) {
		this.numComponentes = numComponentes;
	}

	@Override
	public String toString() {
		return "Grupo [numComponentes=" + numComponentes + ", idInterprete=" + idInterprete + ", nomInterprete="
				+ nomInterprete + "]";
	}
	
}
