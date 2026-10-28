package techStoree;

public class Adresse {
	private String governorat;
	private int codepostale;
	public Adresse (String gov, int codep) {
		this.governorat=gov;
		this.codepostale=codep;
	}
	public String getGovernorat() {
		return governorat;
	}
	public void setGovernorat(String gov) {
		this.governorat=gov;
	}
	public int getCodepostal() {
		return codepostale;
	}
	public void setCodepostale(int codep) {
		this.codepostale=codep;
	}
	public String toString() {
		return "Adresse[governorat="+this.governorat+",codepostale="+this.codepostale+"]";
	}

}
