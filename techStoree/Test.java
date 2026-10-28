package techStoree;

public class Test {
	public static void main(String[] args) {
		Adresse a1 = new Adresse("Monastir",5000);
		Adresse a2 = new Adresse("Ben Arous",1133);
		Adresse a3 = new Adresse("Ben Arous",1145);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		Personne p1= new Personne ("01111111","Kbayer","Jasser","Jendouba",8160);
		Personne p2= new Personne ("02222222","Smida","Gaith",a1);
		System.out.println(p1);
		System.out.println(p2);
		p1.setNom("Ali");
		p1.setPrenom("Ali");
		p1.setAdress(a2);
		System.out.println("APRES MODIFICATION");
		System.out.println(p1);
	}
	
	
}
