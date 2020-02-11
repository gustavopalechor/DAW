package modelo;

public class Interprete {
	int idInterprete;
	String nomInterprete;
	
	public Interprete() {
		// TODO Auto-generated constructor stub
	}

	public Interprete(int idInterprete, String nomInterprete) {
		super();
		this.idInterprete = idInterprete;
		this.nomInterprete = nomInterprete;
	}

	public int getIdInterprete() {
		return idInterprete;
	}

	public void setIdInterprete(int idInterprete) {
		this.idInterprete = idInterprete;
	}

	public String getNomInterprete() {
		return nomInterprete;
	}

	public void setNomInterprete(String nomInterprete) {
		this.nomInterprete = nomInterprete;
	}

	@Override
	public String toString() {
		return "Interprete [idInterprete=" + idInterprete + ", nomInterprete=" + nomInterprete + "]";
	}
	
}
