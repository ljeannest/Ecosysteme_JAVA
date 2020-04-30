package individus;

public class Carnivore  extends Animal{
	
	public Carnivore(String espece, int posx,int posy, String sexe, int age, int esp_de_vie,int qte_viande) {
		super(espece, 1, posx,posy, sexe, age, esp_de_vie,100,qte_viande);
	}
	
	public void manger(Animal A) {
		if (A.type==0) {
			if (A.est_vivant==true) {
				A.est_vivant=false;
			}
		}
	}

}
