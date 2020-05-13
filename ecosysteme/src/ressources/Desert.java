package ressources;

import individus.Animal;
//vérife90
public class Desert extends Ressource{

	public boolean individuMort;

	
	public Desert(int posx, int posy,String couleur, int quantiteRessource) {
		super("Desert","desert",posx, posy, "marron clair", 0);

	
		
		this.posx = posx;
		this.posy = posy;
		this.individuMort = false;
		
	}

	public boolean régénérationPossible(Animal A) {
		 if (this.posx == A.posx) {
			 if (this.posy == A.posy) {
				 if (A.est_vivant == false) {
					 this.individuMort = true;
				 }
			 }
		 }
		 else {
			 this.individuMort = false;
		 }
		 
		 return individuMort;
		 
	}
}