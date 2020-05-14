package individus;

import ressources.Eau;

/**
 * <b>Individus de type Animal mais ne mangeant que les individus de type Herbivore.</b>
 *  <p> Il es identifié par l'id 1 dans type.</p>
 *@see Animal
 *
 * @author Lucie
 * @version 2.0
 *
 */

public class Carnivore  extends Animal{
	/**
	 * Construction d'un carnivore
	 * 
	 * 
	 * @param espece
	 *			@see Animal#espece
	 * @param posx
	 * 			@see Animal#posx
	 * @param posy
	 * 			@see Animal#posy
	 * @param sexe
	 * 			@see Animal#sexe
	 * @param age
	 * 			@see Animal#age
	 * @param esp_de_vie
	 * 			@see Animal#esp_de_vie
	 * @param qte_viande
	 * 			@see Animal#qte_viande
	 * @param ageReproMin
	 * 			@see Animal#agesReproMin
	 * @param ageReproMax
	 * 			@see Animal#ageReproMax
	 * 
	 */
	public Carnivore(String espece, int posx,int posy, String sexe, int age, int esp_de_vie,int qte_viande,int ageReproMin, int ageReproMax) {
		super(espece, 1, posx,posy, sexe, age, esp_de_vie,100,100,qte_viande, ageReproMin, ageReproMax);
	}
	
	/**
	 * Permet de faire manger un animal en vérifiant qu'il est vivant.
	 * Modifie le boolean est-vivant de l'animal mangé en false.
	 * 
	 * 
	 * @param A
	 * 		Animal que le carnivore mange nécessairement de type 0.
	 * 		@see Herbivore
	 */
	public void manger(Animal A) {
		if (A.type==0 && A.est_vivant==true) {
			
				A.est_vivant=false;
			
		
		while (A.qte_viande<0 && this.jauge_nourriture<100) {
			this.manger();
			A.se_faire_manger();	}	
			
		}
		
		
		
	}
	

}
