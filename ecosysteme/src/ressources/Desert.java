package ressources;

import individus.Animal;
//vérife90

public class Desert {
	
	public int posX;
	public int posY;
	public boolean individuMort;
	
	public Desert(int posX, int posY) {
		
		this.posX = posX;
		this.posY = posY;
		this.individuMort = false;
		
	}

	public boolean régénérationPossible(Animal A) {
		 if (this.posX == A.posx) {
			 if (this.posY == A.posy) {
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