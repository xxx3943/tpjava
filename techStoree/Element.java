package techStoree;

import java.util.Objects;

public class Element {
	private Article article;
	private long quantite;
	
	public Element(String nom, double prix , long quantite) {
		this.article =new Article(nom,prix);
		this.quantite = quantite;
	}
	public void Element(Article article , long quantite) {
		this.article = article;
		this.quantite = quantite;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public long getQuantite() {
		return quantite;
	}
	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}
	public long getReferenceArticle() {
		return article.getId();
	}
	public String getNomArticle() {
		return article.getNom();
	}
	public double getPrixArticle() {
		return article.getPrix();
	}
	public void incrementerQuantite(long qte) {
		this.quantite+=qte;
	}
	public void decrementerQuantite(long qte) {
		this.quantite-=qte;
	}
	public void modifier(String nom, double prix, long quantite) {
		this.article= new Article(nom,prix);
		this.quantite=quantite;
	}
	public boolean equals(String ch) {
		return article.getReference().equals(ch);
	}
	public boolean equals(Article article) {
		return this.article.equals(article);
	}
	public String toString() {
		return "Element [article=" + article + ", quantite=" + quantite + "]";
	}
	
	
}
