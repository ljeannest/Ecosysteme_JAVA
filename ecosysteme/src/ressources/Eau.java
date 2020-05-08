package ressources;

public class Eau extends Ressource{
	
	
	String type;
	String couleur;
	public int quantiteRessource;
	
	public Eau (String type, int quantiteRessource,int posX, int posY) {
		super("Eau");
		this.type = type;
		this.couleur = "bleu";
		
		this.quantiteRessource = quantiteRessource;
	}
	
	
	public void se_faire_boire() {
		this.quantiteRessource-=1;
		
	}

}
