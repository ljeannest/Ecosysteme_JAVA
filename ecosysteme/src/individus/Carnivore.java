package individus;

import ressources.Eau;

/**
 * <b>Individus de type Animal mais ne mangeant que les individus de type Herbivore.</b>
 *  <p> Il es identifi� par l'id 1 dans type.</p>
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
	public Carnivore(String espece, int posx,int posy, String sexe, int age, int esp_de_vie,int qte_viande,int ageReproMin, int ageReproMax,int date_naissance,int duree_gestation) {
		super(espece, 1, posx,posy, sexe, age, esp_de_vie,100,100,qte_viande, ageReproMin, ageReproMax,date_naissance,duree_gestation);
	}
	
	

}
