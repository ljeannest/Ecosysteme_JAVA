package ressources;

public class Vegetaux {
	
	
	String type;
	String couleur;
	int quantiteRessources;
	int posX;
	int posY;
	boolean estVivant;
	
	public Vegetaux(String type, String couleur, int quantiteRessouce,int posX, int posY) {
		
		this.type = type;
		this.couleur = couleur;
		this.quantiteRessources = quantiteRessouce;
		this.estVivant = true;
		this.posX = posX;
		this.posY = posY;
		
		}
	
	public void manger() {
		
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
