package individus;

public class Carnivore  extends Animal{
	
	public Carnivore(String espece, double position, String sexe, int age, int esp_de_vie) {
		super(espece, 1, position, sexe, age, esp_de_vie);
	}
	
	public void manger(Animal A) {
		if (A.type==0) {
			if (A.est_vivant==true) {
				A.est_vivant=false;
			}
		}
	}

}
