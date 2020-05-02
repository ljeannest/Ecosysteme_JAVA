package individus;

public class Animal {

	String espece;
	int type;
	public int posx;
	public int posy;
	String sexe;
	int age;
	int esp_de_vie;
	public boolean est_vivant;
	int jauge_nourriture;
	int qte_viande;
	
	public Animal(String espece, int type, int posx,int posy, String sexe, int age, int esp_de_vie,int jauge_nourriture,int qte_viande) {
		this.espece = espece;
		this.type = type;
		this.posx = posx;
		this.posy=posy;
		this.sexe = sexe;
		this.age = age;
		this.esp_de_vie = esp_de_vie;
		this.est_vivant=true;
		this.jauge_nourriture=jauge_nourriture;
		this.qte_viande=qte_viande;
	}
	
	public void vieillir() {
		this.age+=1;
	}
	
	public boolean mort_de_vieillesse() {
		if (this.age>=this.esp_de_vie) {// on devrait rajouter une condition de probabilité genre on tire au hasard un chifffre s'il est sup à 0,5 alors true else false
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean reproduction(Animal A) {
		if (this.espece==A.espece) {
			if (this.sexe=="M") {
				if (A.sexe=="F") {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				if (A.sexe=="M") {
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
	
}
