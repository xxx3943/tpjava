package techStoree;

public class Personne {
	private String cin;
	private String nom;
	private String prenom;
	private Adresse adress;
	public Personne(String cin, String nom, String prenom, Adresse adress) {
			super();
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
			this.adress = adress;
		}
	public Personne(String cin, String nom, String prenom, String governorat, int codepostal) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = new Adresse(governorat,codepostal);
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdress() {
		return adress;
	}
	public void setAdress(Adresse adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Personne [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adress=" + adress.toString() + "]";
	}
	
}
