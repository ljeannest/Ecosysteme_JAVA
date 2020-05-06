package ressources;

public class Vegetaux {
	
	
	String type;
	public String couleur;
	public int quantiteRessources;
	public int posX;
	public int posY;
	public boolean estVivant;
	
	public Vegetaux(String type, String couleur, int quantiteRessource,int posX, int posY) {
		
		this.type = type;
		this.couleur = couleur;
		this.quantiteRessources = quantiteRessource;
		this.estVivant = true;
		this.posX = posX;
		this.posY = posY;
		
		}
	
	public void se_faire_manger() {
		
		this.quantiteRessources-=1;
		
		if(this.quantiteRessources==0) {
			
			this.couleur = "marron";
			this.estVivant = false;
			
		}
	}
	
	public void pousser() {
		
		this.quantiteRessources +=1;
		
	}
	}
