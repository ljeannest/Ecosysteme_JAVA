package individus;

public class Animal {

	String espece;
	int type;
	int[] position;
	String sexe;
	int age;
	int esp_de_vie;
	boolean est_vivant;
	int besoin_nourriture;
	int qte_viande;
	
	public Animal(String espece, int type, int[] position, String sexe, int age, int esp_de_vie) {
		this.espece = espece;
		this.type = type;
		this.position = position;
		this.sexe = sexe;
		this.age = age;
		this.esp_de_vie = esp_de_vie;
		this.est_vivant=true;
	}
	
	public void vieillir() {
		this.age+=1;
	}
	
	public boolean mort_de_vieillesse() {
		if (this.age>=this.esp_de_vie) {
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
