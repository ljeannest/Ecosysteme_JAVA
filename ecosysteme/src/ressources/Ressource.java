package ressources;

public class Ressource {

	public String type;
	public String sous_type;
	public int posx;
	public int posy;
	public String couleur;
	public int quantiteRessource;
	public boolean estVivant;
	
	public Ressource(String type,String sous_type,int posx,int posy, String couleur,int quantiteRessource) {
		
		this.type = type;
		this.sous_type=sous_type;
		this.posx = posx;
		this.posy = posy;
		this.couleur = couleur;
		this.quantiteRessource = quantiteRessource;
		this.estVivant = true;
		
		}
	
	
	public void se_faire_manger_boire() {
		
		this.quantiteRessource-=1;
		
		if(this.quantiteRessource==0) {
			
			this.couleur = "marron";
			this.estVivant = false;
			
		}
	}
	
	public void pousser_croitre() {
		
		this.quantiteRessource +=1;
		
	}
	
}
