package techStoree;

public class Article {
	private int id;
	private String nom;
	private String reference;
	private double prix;
	public Article(String nom, double prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getReference() {
		return reference;
	}
	private String genererreference() {
		String ref="";
		for (int i=0;i<nom.length();i++) {
			if(i%5==0) {
				char x=nom.charAt(i);
				if(x!=' ') {
					ref =ref + x;
				}
			}
		}
		return ref+ id;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void modifier(String nom,int id) {
		this.nom=nom;
		this.reference= genererreference();
	}
	public void modifier(String nom,double prix) {
		this.nom=nom;
		this.prix=prix;
		this.reference= genererreference();
	}
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", reference=" + reference + ", prix=" + prix + "]";
	}
	
}
