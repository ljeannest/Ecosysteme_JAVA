package individus;

import ressources.Eau;

public class Carnivore  extends Animal{
	
	public Carnivore(String espece, int posx,int posy, String sexe, int age, int esp_de_vie,int qte_viande,int ageReproMin, int ageReproMax) {
		super(espece, 1, posx,posy, sexe, age, esp_de_vie,100,100,qte_viande, ageReproMin, ageReproMax);
	}
	
	public void manger(Animal A) {
		if (A.type==0 && A.est_vivant==true) {
			
				A.est_vivant=false;
			
		
		while (A.qte_viande<0 && this.jauge_nourriture<100) {
			this.manger();
			A.se_faire_manger();	}	
			
		}
		
		
		
	}
	
	public void boire(Eau eau) {
		
		
		while (eau.quantiteRessource<0 && this.jauge_eau<100) {
			this.boire();
			eau.se_faire_boire();
		}
		
		
		
	}
	
	
	
	

}
