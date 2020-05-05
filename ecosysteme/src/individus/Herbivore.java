package individus;

import ressources.*;


public class Herbivore extends Animal {

	public Herbivore(String espece, int posx, int posy, String sexe, int age, int esp_de_vie,int qte_viande, int ageReproMin, int ageReproMax) {
		super(espece, 0, posx, posy, sexe, age, esp_de_vie,100,100, qte_viande, ageReproMin, ageReproMax);
	}
	
	
	public void manger(Vegetaux V) {
		if (V.estVivant = true) {

		while (V.quantiteRessources<0 && this.jauge_nourriture<100) {
			this.manger();
			V.se_faire_manger();	}	
			
		}
		
		
		
	}
	
	public void boire(Eau eau) {
		
		
		while (eau.quantiteRessource<0 && this.jauge_eau<100) {
			this.boire();
			eau.se_faire_boire();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
