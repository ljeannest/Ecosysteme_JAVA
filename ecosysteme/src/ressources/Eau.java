package ressources;

public class Eau {
	
	
	String type;
	String couleur;
	int quantiteRessource;
	
	public Eau (String type, int quantiteRessource) {
		
		this.type = type;
		this.couleur = "bleu";
		this.quantiteRessource = quantiteRessource;
	}
	
	
	public void Boire() {
		this.quantiteRessource-=1;
		
	}

}
