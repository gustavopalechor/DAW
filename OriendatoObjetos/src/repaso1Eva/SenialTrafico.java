package repaso1Eva;

public class SenialTrafico {
	int idSenial;
	int num;
	public SenialTrafico() {
		super();
	}
	public int getIdSenial() {
		return idSenial;
	}
	public void setIdSenial(int idSenial) {
		this.idSenial = idSenial;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "SenialTrafico [idSenial=" + idSenial + ", num=" + num + "]";
	}
}
