package individus;

import ressources.Eau;
/**
 * <b> Individu de type animal ne mangeant que des individus mort.</b>
 * <p>
 * Il es identifié par l'id 2 dans type.</p>
 * 
 * @version 2.0
 * @author Lucie
 *
 */

public class Charognard extends Animal{
	/**
	 * Construction d'un charognard
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

	public Charognard(String espece, int posx,int posy, String sexe, int age, int esp_de_vie,int qte_viande, int ageReproMin, int ageReproMax,int date_naissance,int duree_gestation) {
		super(espece, 2, posx, posy, sexe, age, esp_de_vie,100,100,qte_viande,ageReproMin,ageReproMax,date_naissance,duree_gestation);
	}


}
