package ressources;

public class Eau {
	
	
	String type;
	String couleur;
	public int quantiteRessource;
	
	public Eau (String type, int quantiteRessource) {
		
		this.type = type;
		this.couleur = "bleu";
		this.quantiteRessource = quantiteRessource;
	}
	
	
	public void se_faire_boire() {
		this.quantiteRessource-=1;
		
	}

}
